package com.MapaSet;

public class Person  { //implements Comparable<Person>
    String name;
    Integer phoneNumber;

    /*@Override
    public int compareTo(Person o) {// сравнения длины имен! в класс Person прописали Comparable<Person>
        return name.length()-o.name.length();
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public Person(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber=phoneNumber;
















    }
}

