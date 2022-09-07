package Tasks.lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result;
        while (true){
            double a = sc.nextInt();
            double b = sc.nextInt();
            if (b == 0){
                System.out.println("Деление на 0 незя!");
                break;
            }
            result = a / b;
            System.out.println(result);
        }
    }

}
