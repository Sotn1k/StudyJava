package com.alishev.youtube.lessonGetterAndSet;

public class lessonGetterAndSetter {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Vitalik");
        person1.setAge(-1);
        System.out.println("Выводим на экран имя " + person1.getName());
        System.out.println("Выводим на экран возраст " + person1.getName());
        person1.speak();
        person1.calculatedAge();
    }
}
class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if (name.isEmpty()){
           System.out.println("Ты ввел пустое имя");
        }else
        this.name = name;
    }

    public int getAge(int userAge) {

        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Ошибка в возрасте");
        }else
        this.age = age;
    }

    int calculatedAge(){
    int years = 65 - age;
        System.out.println(years);
    return years;
    }
void speak(){
    for (int i = 0; i < 3; i++) {
        System.out.println("Меня зовут "+ name + " мне " + age + " лет");
    }
}

}
