package com.animal;

public class Animals {
    private String name;
    public void eat(){
        System.out.println("Im eating");
    }
    public void sleep(){
        System.out.println("Im sleeping");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
