package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class CharStreamTask {

    public static void main(String[] args) {


        List<String> words = Arrays.asList("java", "Apple", "Honda", "Toyota", "Dev");

        words.stream()
                .map(word -> word.length())
                .forEach(System.out::println);

    }
}