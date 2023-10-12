package lesson_33.creating;

import lesson_33._01_intro_lamdbas.model.Cat;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //пустой стрим
        Stream<Object> empty=Stream.empty();
        //из листа
        List<Integer>ints=List.of(1,2,3);
        Stream<Integer> stream=ints.stream();
        //из коллекции
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"1");
        map.put(2,"2");
        Stream<Map.Entry<Integer,String>> stream1=map.entrySet().stream();;
        //из массива
        Stream<String> stream2= Arrays.stream(new String[]{"a","b"});
        //из элементов
        Stream<Integer> integerStream=Stream.of(1,2,3);

    }
}
