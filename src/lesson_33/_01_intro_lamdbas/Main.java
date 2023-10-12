package lesson_33._01_intro_lamdbas;

import lesson_33._01_intro_lamdbas.intefaces.Searcheble;
import lesson_33._01_intro_lamdbas.intefaces.impl.AgeSearchable;
import lesson_33._01_intro_lamdbas.intefaces.impl.BreedSearchable;
import lesson_33._01_intro_lamdbas.model.Breed;
import lesson_33._01_intro_lamdbas.model.Cat;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = List.of(
                new Cat("cat1", 2, Breed.SIBERIAN),
                new Cat("cat1", 1, Breed.SIAM),
                new Cat("cat1", 3, Breed.GARBAGE),
                new Cat("cat1", 2, Breed.SIBERIAN),
                new Cat("cat1", 1, Breed.SIAM),
                new Cat("cat1", 1, Breed.SIBERIAN)
        );

        System.out.println(getByBreed(cats, Breed.SIBERIAN));
        System.out.println(getByAge(cats, 2));

        //через реализацию интерфейсы
        System.out.println(getByCondition(cats, new BreedSearchable(), Breed.SIBERIAN));
        System.out.println(getByCondition(cats, new AgeSearchable(), 2));

        //через анонимный метод
        System.out.println(getByCondition(cats, new Searcheble<Breed>() {
            @Override
            public boolean test(Cat cat, Breed value) {
                return cat.getBreed().equals(value);
            }
        }, Breed.SIBERIAN));

        System.out.println(getByCondition(cats, new Searcheble<Integer>() {
            @Override
            public boolean test(Cat cat, Integer value) {
                return cat.getAge()==value;
            }
        },2));


        System.out.println(getByCondition(cats,(cat,value)->cat.getBreed().equals(value),Breed.SIBERIAN));
        System.out.println(getByCondition(cats,(cat,value)->cat.getAge()==value,2));




    }

    private static int getByBreed(List<Cat> cats, Breed breed) {
        int result = 0;
        for (Cat cat : cats) {
            if (cat.getBreed().equals(breed)) {
                result++;
            }

        }
        return result;
    }

    private static int getByAge(List<Cat> cats, int age) {
        int result = 0;
        for (Cat cat : cats) {
            if (cat.getAge() == age) {
                result++;
            }
        }
        return result;
    }

    private static <T> int getByCondition(List<Cat> cats, Searcheble<T> function, T value) {
        int result = 0;
        for (Cat cat : cats) {
            if (function.test(cat, value)) {
                result++;
            }
        }
        return result;
    }

}
