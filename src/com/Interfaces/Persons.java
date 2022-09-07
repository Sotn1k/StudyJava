package com.Interfaces;

public class Persons implements Info{
    public String name;
    public void sayHello(){
        System.out.println("Hello");
    }

    public Persons(String name) {
        this.name = name;

    }

    @Override
    public void showInfo() {
        System.out.println("name is  "+ this.name);

    }

    @Override
    public String toString() {
        return name;
    }
}
