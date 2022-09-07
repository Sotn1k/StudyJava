package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class numberArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,-2,8,9,10};
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element<min){
                min=element;
            }
        }
        System.out.println("In array: " + Arrays.toString(array));
        System.out.println("min = "+ min);
        int sum = 0;
        for (int elements : array) {
            sum +=elements;
        }
        Arrays.sort(array);
        System.out.println("In array: " + Arrays.toString(array));
        System.out.println("sum of array = "+sum);
    }
}
