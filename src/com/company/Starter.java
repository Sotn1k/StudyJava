package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        testJob list = new testJob();
        Starter first = new Starter();
        Scanner sc = new Scanner(System.in);
        int[] grades = first.getInts(sc);


        System.out.println(Arrays.toString(grades));
        int max = list.maxValue(grades);
        System.out.println(max);

        list.printInfo(grades, " |" , " : ", " |" );
    }

    private int[] getInts(Scanner sc) {
        System.out.println(" inter Grades :");
        int nums = sc.nextInt();
        int[] grades = new int[nums];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = sc.nextInt();
        }
        return grades;
    }
}
