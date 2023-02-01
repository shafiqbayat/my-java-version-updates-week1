package com.cydeo;

import com.cydeo.task1.Dish;
import com.cydeo.task1.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {


//        toCollection (Supplier): is used to create a collection

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 5, 4, 3, 2, 1, 2, 9);

        List<Integer> numbersList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numbersList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

//        ToList(): returns a collector interface from gathered data into a new list

       List<Integer> numberList2 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());

        System.out.println(numberList2);

//        toSet(): returns a collector interface from gathered data into a new set


        List<Integer> numberSet2 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());

        System.out.println(numberSet2);

//        toMap(Function,Function): returns a collector interface that gathers input data into a new map


       Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));

        System.out.println(dishMap);


//        summingInt(ToIntFunction): returns collector that produce sum of Integer valued func


       Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sum);

//        counting(): returns collector that counts number of elements

        Long evenCount = numbers.stream()
                .filter(x-> x%2==0)
                .collect(Collectors.counting());

        System.out.println(evenCount);













    }
}
