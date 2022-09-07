package Tasks.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (count < 5){
            int a = sc.nextInt();
            int b = sc.nextInt();
            count++;
            if (b == 0){
                System.out.println("Деление на ноль");
                continue;
            }
            System.out.println(a/b);
        }
    }

}


