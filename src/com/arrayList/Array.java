package com.arrayList;

public class Array {
    public static void main(String[] args) {
        int [] arrays = new int[5];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = i*10;
        }
        //int [] numbers = {1,2,3};
        var sum = 0;
        for (int array : arrays) {

            sum += array;
            //System.out.println(array);

        }
        System.out.println(sum);
        System.out.println();
        System.out.println(ArraysOne());



    }
    public static int ArraysOne(){
        int[] arrays = new int[5];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = i*10;
        }
        int sum =0;
        for (int array : arrays) sum = sum + array;
       // System.out.println(sum);
        for (int array : arrays) {
            System.out.println(array);
            
        }

        return sum;
        
    }


}


