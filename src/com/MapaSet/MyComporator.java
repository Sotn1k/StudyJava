package com.MapaSet;

import java.util.Comparator;

public class MyComporator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) { // Сравниваем по телефону по возрастанию
        return (int) (o1.phoneNumber.longValue() - o2.phoneNumber.longValue());
    }
}
