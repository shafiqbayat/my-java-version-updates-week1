package com.cydeo;

import com.cydeo.task1.Dish;
import com.cydeo.task1.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

//    All match

    public static void main(String[] args) {


        System.out.println("All match");
       boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("any match");


        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("the menu is vegetarian ");
        }

        System.out.println("None match");

        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);

        System.out.println(isHealthy2);

        System.out.println("find any");

        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();

        System.out.println(dish.get());


        System.out.println("find first");

        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();

        System.out.println(dish.get());

//        PARALLEL STREAMS (Async)

        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());


      /*  List<String> list1 = Arrays.asList("Georgann Huels"," IVChuck JacobsMarisa"," SimonisYoung JacobsonShawn"," LakinVernita TorphyKenny"," LarsonBarney Considine"," Eugenie Volkman"," Jr.Rona Ruecker");
        List<String> list2 = Arrays.asList("Robert Aufderhar"," Eusebio Reynolds"," DVMLeeanne Gorczany"," Luciana HudsonGavin", " Strosin Tajuana"," Rodriguez Kay"," Osinski  Schulist"," Tifany LindWhitney");

        Optional<String > findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String > findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findFirst.get());
        System.out.println(findAny.get());*/

//        min

        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));

        System.out.println(dMin);

        //        max

        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));

        System.out.println(dMax);

















    }
}
