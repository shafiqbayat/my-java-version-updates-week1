package com.cydeo.task2;

import java.security.spec.ECPoint;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {


//        print all emails


        EmployeeData.readAll().map(Employee::getEmployeeEmail).forEach(System.out::println);

//        EmployeeData.readAll().map(employee -> employee.getEmployeeEmail()).forEach(System.out::println);

//        print all phone numbers
        System.out.println("print with array brackets");

        EmployeeData.readAll()
                .map(Employee::getEmployeePhoneNumbers).forEach(System.out::println);

        System.out.println("print without array brackets");

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmployeePhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("print with double colon array brackets");

        EmployeeData.readAll()
                .map(Employee::getEmployeePhoneNumbers)
                .flatMap(List::stream).forEach(System.out::println);












    }
}
