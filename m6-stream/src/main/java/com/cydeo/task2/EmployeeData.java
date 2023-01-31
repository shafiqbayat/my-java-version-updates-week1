package com.cydeo.task2;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll (){
       return
               Stream.of(
                new Employee(100, "safi", "safi@cydeo.com", Arrays.asList("45465215522", "548755448")),

                new Employee(200, "wali", "wali@cydeo.com", Arrays.asList("1542545245", "332556544")),

                new Employee(500, "mike", "mike@cydeo.com", Arrays.asList("3266554455", "44578555522")));




    }
}
