package com.corejava.jar;

import java.time.LocalDate;
import java.util.Random;

class Employee {
    private static int nextId;

    private int id;
    private String name = "";// instance field initialization
    private double salary;
//    private LocalDate hireDay;

//    public com.corejava.jar.Employee(String name, double salary, int year, int month, int day) {
    //从java9开始支持检测name是否为null   有两种模式
//        this.name = Objects.requireNonNullElse(name, "unKnown");
//        Objects.requireNonNull(name, "The name cannot be null!");
//        this.name = name;
//        this.salary = salary;
//        hireDay = LocalDate.of(year, month, day);
//    }

    static {
        var generator = new Random();
        nextId = generator.nextInt(10000);// set nextId to a random number between 0 and 9999
    }

    {
        id = nextId;
        nextId++;
    }


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    // 通过this 可以使用其他的构造器
    public Employee(double s) {
        this("com.corejava.jar.Employee #" + nextId,s);
//        nextId++;
    }

    public Employee() {

    }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    private LocalDate getHireDay() {
        return null;
    }

    public int getId() {
        return id;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
