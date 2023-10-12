package lesson_33._01_intro_lamdbas.intefaces.impl;

import lesson_33._01_intro_lamdbas.intefaces.Searcheble;
import lesson_33._01_intro_lamdbas.model.Cat;

public class AgeSearchable implements Searcheble<Integer> {

    @Override
    public boolean test(Cat cat, Integer value) {
        return cat.getAge()==value;
    }
}
