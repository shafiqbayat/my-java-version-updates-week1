package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Filter;
import java.util.stream.Stream;

public class StreamOperation {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 5, 6, 4, 5, 8, 7,55,47,56,84,59,22);

//        list.forEach(System.out::println);

//        Filter

        list.stream().filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Filter");
        System.out.println("Distinct");
//        Distinct
        Stream<Integer> str = list.stream().filter(i -> i % 2 == 0).distinct();
        str.forEach(System.out::println); // stream is closed here

        System.out.println("Limit");

        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(2)
                .forEach(System.out::println);

        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("Map");

        list.stream()
                .map(number -> number * 2)
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);

        System.out.println("Task");

        List<String> words = Arrays.asList("java","Apple","Honda","Toyota","Dev");

        words.stream()
                .map(word -> word.length())
                .forEach(System.out::println);




    }
}
