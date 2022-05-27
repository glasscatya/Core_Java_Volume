package com.horstmann.corejava;

import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
    //从java9开始支持检测name是否为null   有两种模式
//        this.name = Objects.requireNonNullElse(name, "unKnown");
//        Objects.requireNonNull(name, "The name cannot be null!");
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

//    public Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }

    public String getNam() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return null;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

