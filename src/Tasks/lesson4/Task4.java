package Tasks.lesson4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arrays = new int[100];
        Random random = new Random();

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(10000);
        }
        int maxSum = 0;
        int ind = 0;
        for (int i = 0; i < arrays.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += arrays[j];
            }
            if (sum > maxSum)
                maxSum = sum;
                ind = i;
        }
        System.out.println(ind + " "+ maxSum);
    }
}
