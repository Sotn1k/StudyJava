package com.alishev.youtube.pet;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {
        List<Animals> animals1 = new ArrayList<>();
        animals1.add(new Animals(1));
        animals1.add(new Animals(2));
        showId(animals1);
    }
    public static void showId(List<? extends Animals>  list) {
        for(Animals animals: list){
            System.out.println(animals);
        }
    }
}
