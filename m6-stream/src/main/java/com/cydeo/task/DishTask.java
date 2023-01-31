package com.cydeo.task;

public class DishTask {

    public static void main(String[] args) {

//        print all dish name that has less than 400 calories
//        print the length of the name of each dish
//        print three high caloric dish name (>300)
//        print all dish name that are below 400 calories in sorted


/*        DishData.getAll().stream()
                .filter(i -> i.getCalories()<400)
                .forEach(System.out::println);
        DishData.getAll().stream()
                .map(name -> name.getName().length())
                .forEach(System.out::println);
        DishData.getAll().stream()
                .filter(i ->i.getName() getCalories()>300)*/

        DishData.getAll().stream()
                .filter(dish ->dish.getCalories()<400)
//                .map(dish -> dish.getName()
                .map(Dish::getName)
                .forEach(System.out::println);
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(dish -> dish.length()).forEach(System.out::println);



    }
}
