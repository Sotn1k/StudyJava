package com.alishev.youtube.lesson20;

public class lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 30);
        Human human2 = new Human();
        System.out.println(human2);

    }

}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
        this.name = "Пользователь";
        this.age = 0;

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
