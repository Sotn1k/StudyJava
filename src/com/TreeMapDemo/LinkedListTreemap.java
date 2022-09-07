package com.TreeMapDemo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class LinkedListTreemap {
    public static void main(String[] args) {
        Queue<String> linklist = new LinkedList<>();
        linklist.add("One");
        linklist.add("two");
        linklist.add("Three");
        linklist.add("Four");
        linklist.add("Five");
        linklist.add("Six");
        linklist.add("Seven");
        linklist.add("Ten");

        System.out.println(linklist);

        TreeMap<Integer,String > map = new TreeMap<>();
        int key = 0;
        for (String word : linklist) {
            key += 10;
            map.put(key,word);

        }
        System.out.println(map);
        System.out.println("Headmap "+ map.headMap(40,true)); // включает последнее значение
        System.out.println("TailMap "+ map.tailMap(31));
        System.out.println("SubMap " + map.subMap(20, true,50,true));

        System.out.println("ceilingKey " + map.ceilingKey(41)); //вверх >=
        System.out.println("floorKey " + map.floorKey(39));     //вниз   <=
        System.out.println("higherKey " + map.higherKey(41));     //<
        System.out.println("lowerKey " + map.lowerKey(40));        //>
    }



}




























