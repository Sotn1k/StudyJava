package Tasks.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numToArrays = sc.nextInt();
        int[] arrays = new int[numToArrays];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 10) + 1;
        }

        String num = Arrays.toString(arrays);

        int sum = 0;
        int sum1 = 0;
        int oddNumber = 0;
        int more8 = 0;
        int one = 0;

        for (int array : arrays) {
            sum = sum + array;
            if (array % 2 == 0) {
                sum1++;
            }
            if (array % 2 != 0) {
                oddNumber++;
            }
            if (array > 8) {
                more8++;
            }
            if (array == 1) {
                one++;
            }
        }

        System.out.println("Введено число " + arrays.length + ". Сгенерирован следующий массив");
        System.out.println(num);
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + arrays.length);
        System.out.println("Сумма всех элементов массива: " + sum);
        System.out.println("Колличество четных чисел: " + sum1);
        System.out.println("Колличество не четных чисел: " + oddNumber);
        System.out.println("Колличество чисел больше 8ми: " + more8);
        System.out.println("Количество чисел равных 1: " + one);

    }
}
