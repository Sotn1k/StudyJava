package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class testJob {





    public int maxValue(int[] array){
        int max = Integer.MIN_VALUE;
        for (int simb : array) {
            if (simb > max) {
                max = simb;
            }
        }
        return  max;
    }
    public void printInfo(int [] array, String skoba, String zapyat, String zskoba){
        System.out.print(skoba);
        for (int i = 0; i < array.length; i++) {
            int grades = array[i];
            System.out.print(grades);
            if (i < array.length - 1){
                System.out.print(zapyat);
            }
        }
        System.out.println(zskoba);
    }
}

