package lesson_33._01_intro_lamdbas.intefaces;

import lesson_33._01_intro_lamdbas.model.Cat;

public interface Searcheble<T> {
    boolean test(Cat cat, T value);

}
