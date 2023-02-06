package com.self.lambda_review;

public class MainApp {

    public static void main(String[] args) {

        Service service = () -> System.out.println("Object Saved");

        service.save();
    }
}
