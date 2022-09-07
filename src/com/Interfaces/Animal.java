package com.Interfaces;

public class Animal implements Info{
    //static public int id = 0;
    static public int idBack = 0;
    public String name;
    public void sleep(){
        System.out.println("Im sleeping");
    }

    public Animal(String name) {
        idBack ++;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public Animal() {
        idBack ++;
    }

    public static int getIdBack() {
        return idBack;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + idBack +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public void showInfo() {
        System.out.println("Id is "+ idBack);

    }
}
