package com.animal;

public class Dog extends Animals{
    public Dog(String name) {
        setName(name);
    }
    public void eat(){
        System.out.println("Dog Eating");
    }
    public void bark(){
        System.out.println("BARK");
    }
    public void showName(){
        System.out.println(getName());
    }


}
