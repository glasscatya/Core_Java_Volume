package com.corejava.jar;

import java.time.LocalDate;
import java.util.Random;

public class EmployeeTest {
    public static void main(String[] args) {
//        var text = new Text();

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("xiao ming", 75000);
        staff[1] = new Employee(50000);
        staff[2] = new Employee();
//
//        for(com.corejava.jar.Employee e : staff) {
//            e.raiseSalary(5);
//        }
//
        for(Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",id = " + e.getId());
        }


    }
}

