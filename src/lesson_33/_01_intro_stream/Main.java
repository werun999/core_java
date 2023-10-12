package lesson_33._01_intro_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(-5,-4,-3,-2,-1,0,1,2,3,4,5);
        System.out.println(getPositiveQuntity(numbers));

        System.out.println(
                numbers.stream()
                .filter(it ->it>0)
                .count()
        );


        Stream<Integer> integerStream=numbers.stream().filter(it->it>0);
        System.out.println("_____");
        Long count =integerStream.count();
        System.out.println(count);




    }
    private static int getPositiveQuntity(List<Integer> numbers){
        int counter=0;
        for (Integer number:numbers){
            if(number>0) {
                counter++;
            }
        }
        return counter;
    }
}
