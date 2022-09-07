package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(200);// добавления в arraylist новое значение
        arrayList.add(100);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        //var array = (Integer[]) arrayList.toArray();

        for (Integer integer : arrayList) { // пропускаем информацию через foreach и выводим на экран
            System.out.println(integer);
        }

        System.out.println("----------------");

        System.out.println(arrayList);

        arrayList.add(3, 800);// добавляем в список arraylist новое значение по индексу
        System.out.println("----------------");

        System.out.println(arrayList);

        System.out.println(arrayList.get(4));// выводим на экран 4 элемент arraylist

        System.out.println(arrayList);
        arrayList.set(2,159); // изменяем элемент по индексу в arrayList.set(2,159)
        System.out.println();
        System.out.println(arrayList);

        arrayList.remove(1); // удаление значение по индексу
        System.out.println(arrayList);

        arrayList.remove(Integer.valueOf(800)); // удаление по значению!!! не по индексу!!!
        System.out.println(arrayList);

        System.out.println(arrayList.contains(Integer.valueOf(500))); //поиск в arrayList по значению!

        System.out.println(arrayList.size());// размер arrayList

        Iterator<Integer> iterator = arrayList.iterator();



    }
}
