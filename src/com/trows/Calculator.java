package com.trows;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator started");
        Scanner scanner = new Scanner(System.in);

        for (;;){
            String expression = scanner.nextLine();
            if (expression.equalsIgnoreCase("end")){
                break;
            }else {
                validate(expression);
                double result = evaluate(expression);
            }

        }
        System.out.println("Calculator stoped");



    }

    private static double evaluate(String expression) {
        String operation = "+-*/";
        return 0;
    }

    private static void validate(String expression){

    }
}


































