package com.cydeo;

import com.cydeo.task1.Dish;
import com.cydeo.task1.DishData;
import com.cydeo.task1.Type;

import javax.swing.*;
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


//        averageingInt (ToIntFunction): returns average of integers

        Double caloriesAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(caloriesAverage);

//        joining(): used to join various element of character or string, puts into single object


        List<String> course = Arrays.asList("java","Paython","C++","Rubbi");
        String strPrint = course.stream()
                .collect(Collectors.joining(","));

        System.out.println(strPrint);

//        partitioningBy(): used to partition stream of object or element base on predicate

        Map<Boolean,List<Dish>> vegiDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(vegiDish);

//        groupingBy(); used for grouping objects by some property and storing result in map instance

        Map<Type,List<Dish>>dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);


















    }
}
