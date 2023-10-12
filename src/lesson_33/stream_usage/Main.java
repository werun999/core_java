package lesson_33.stream_usage;

import lesson_33.stream_usage.model.Chiken;
import lesson_33.stream_usage.model.ChikenComparator;
import lesson_33.stream_usage.model.Dog;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs=List.of(
                new Dog("Tuzik",2),
                new Dog("Bobik",7),
                new Dog("Pushok",5),
                new Dog("Rex",3)
        );
        List<Chiken> chikens=List.of(
                new Chiken("Grill",5),
                new Chiken("Fried",7),
                new Chiken("Boiled",3),
                new Chiken("Grill",5)

        );

        Stream<Dog> dogStream=dogs.stream()
                .filter(it->it.getAge()>3)
                .filter(it->it.getName().length()>=5);

        dogStream.forEach(System.out::println);
        System.out.println("____________________");

        dogs.stream()
                .map(it-> it.getName())
                .forEach(System.out::println);

        dogs.stream()
                .sorted()
                .forEach(System.out::println);

        chikens.stream()
                .sorted(new ChikenComparator())
                .forEach(System.out::println);


        Stream<String>dogsobj=dogs.stream().map(dog -> dog.getName());
        Stream<String>chikobj=chikens.stream().map(chiken -> chiken.getName());
        Stream.concat(chikobj,dogsobj).forEach(System.out::println);

        chikens.stream().distinct().forEach(System.out::println);

        dogs.stream()
                .skip(3)//пропустить три
                .limit(2)//всего взять
                .forEach(System.out::println);
    }
}
