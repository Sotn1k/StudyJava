package Tasks.date;


import jdk.internal.util.ArraysSupport;

import java.util.Arrays;

public class SolutionDate {
    public static void main(String[] args) {
        String text = "abcsrtcba";
        char[] array1 = text.toCharArray();
        boolean result = true;

        for (int i = 0, n = array1.length; i < n / 2; i++) {
            char c = array1[i];
            result &= c == array1[n - i - 1];
            array1[i] = array1[n - i - 1];
            array1[n - i - 1] = c;
        }
        System.out.println(array1);
        System.out.println("Читаемость ? " + result);
    }
}








