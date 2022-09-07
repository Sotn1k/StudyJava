package Tasks.lesson4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] arrays = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = random.nextInt(50);
            }
        }

        int max = Integer.MIN_VALUE;
        int maxInd = 0;
        for (int i = 0; i < arrays.length; i++) {
            int sum = 0;
            for (int j = 0; j < arrays[i].length; j++) {
                sum += arrays[i][j];
            }
            if (sum >= max) {
                max = sum;
                maxInd = i;
            }
        }
        System.out.println(max + " " + maxInd);
    }
}
