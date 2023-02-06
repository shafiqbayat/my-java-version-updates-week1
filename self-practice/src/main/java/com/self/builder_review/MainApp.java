package com.self.builder_review;

public class MainApp {

    public static void main(String[] args) {

        Animal animal = new Animal("hex",2,"yello",1,"black");

        Animal animal2 = new Animal.AnimalBuilder().color("red").name("Pape").build();


//        Animal animal3 = new Animal().AnimalBuilder??



    }
}
