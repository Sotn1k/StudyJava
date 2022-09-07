package com.arrayList;

import java.util.ArrayList;
public class ArrayTestDemo {
    public static ArrayList<Integer> arrayDemo = new ArrayList<>();

    public static void main(String[] args) {


        int nums = 2;
        for (int i = 0; nums > ArrayTestDemo.arrayDemo.size(); i++) {
            ArrayTestDemo.arrayDemo.add(i);

        }
        errorFind();

        System.out.println(arrayDemo);
        System.out.println("----------");

        for (Integer integer : arrayDemo) {
            System.out.print(integer+ " ");
        }
        System.out.println();
        System.out.println(arrayDemo.contains(Integer.valueOf(4)));

        System.out.println(arrayDemo.size());
    }

      static void errorFind() {//обход ошибки не реализован!
        try {
            System.out.println("До генерации");
            arrayDemo.add(5,0);
            System.out.println("Эта строка не будет отображатся");
        }catch (IndexOutOfBoundsException exception){
            System.out.println("Выход за границы листа");
        }

    }

}
