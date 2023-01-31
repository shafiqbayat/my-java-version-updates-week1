package com.cydeo.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {

    private int employeeID;
    private String employeeName;
    private String employeeEmail;
    private List<String> employeePhoneNumbers;




}
