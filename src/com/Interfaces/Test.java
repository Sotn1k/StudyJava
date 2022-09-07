package com.Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Jack");
        Persons persona = new Persons("Bob");

        System.out.printf("ID животного %d имя животного %s %n",Animal.getIdBack(),animal1.getName());
        Animal animal2 = new Animal("Tony");
        System.out.printf("ID животного %d имя животного %s%n",Animal.getIdBack(),animal2.getName());
        Animal ids = new Animal("fff");
        System.out.printf("ID животного %d имя животного %s %n",Animal.getIdBack(),ids.getName());
        Animal dog = new Animal();
        System.out.printf("ID животного %d имя животного %s%n",Animal.getIdBack(),dog.getName());

        animal1.showInfo();
        persona.showInfo();

        Info info1 = new Animal();
        Info info2 = new Persons("Kira");
        System.out.println(info1);
        System.out.println(info2);
        info1.showInfo();
        info2.showInfo();
        System.out.println();
        //outPutInfo(persona);
        persona.showInfo();

    }
   /* public static void outPutInfo(Info info){
        info.showInfo();
    }*/
}
