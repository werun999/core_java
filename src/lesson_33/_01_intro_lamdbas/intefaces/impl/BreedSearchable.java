package lesson_33._01_intro_lamdbas.intefaces.impl;

import lesson_33._01_intro_lamdbas.intefaces.Searcheble;
import lesson_33._01_intro_lamdbas.model.Breed;
import lesson_33._01_intro_lamdbas.model.Cat;

public class BreedSearchable implements Searcheble<Breed> {
    @Override
    public boolean test(Cat cat, Breed value) {
        return cat.getBreed().equals(value);
    }
}
