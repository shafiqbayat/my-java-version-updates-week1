package com.cydeo;

import com.cydeo.task1.Dish;
import com.cydeo.task1.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(4,5,6,2,8,7);
/*
        int sum =0;
        for (int number:numbers){
            sum = sum +number;
        }*/

    int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(result);

        DishData.getAll().stream()
                .map(Dish::getCalories)
//                .reduce((a,b) -> a+b)
                .reduce(Integer::sum)
                .get();

//        max and min

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max =numbers.stream().reduce(Integer::max);
        Optional<Integer> sum =numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum.get());







    }
}
