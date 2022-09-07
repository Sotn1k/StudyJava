package com.limaLesson22;

import java.util.Arrays;

public class Employee {
    private int salary = 0;
    private String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }

    public int getSalary() {
        if (salary == 0) {
            throw new SalaryNotFoundException("Не найдена зарплата у работника: " + name);
        }
        //System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
















