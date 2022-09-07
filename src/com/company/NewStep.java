package com.company;

import java.util.Scanner;


public class NewStep {
    private static void extenought(Scanner cs) {
        while (true){

            String a = cs.nextLine();
            if (a.equals("enough")) break;

        }
    }
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        extenought(cs);
       


    }


}
   /* public static void main(String[] args) {
        String nums = "222";
        int b = 123;
        int a = Integer.parseInt(nums);
        String v = "" + b;
        Typetester t = new Typetester();
        t.printType( a );
        t.printType(v);
        t.printType(nums);


    }
    static class Typetester {
        void printType(byte x) {
            System.out.println(x + " is an byte");
        }
        void printType(int x) {
            System.out.println(x + " is an int");
        }
        void printType(float x) {
            System.out.println(x + " is an float");
        }
        void printType(double x) {
            System.out.println(x + " is an double");
        }
        void printType(char x) {
            System.out.println(x + " is an char");
        }
        void printType(String x) {
            System.out.println(x + " is an String");
        }
    }*/
    /*static void arrayS(int[] array){
       int sum = 0;
       for (int i = 0; i < array.length; i++) {
           sum = sum + array[i];
           System.out.println(sum);

       }
   }

    public static void main(String[] args) {
        int[] a = {30,49,20,10,45};
        arrayS(a);
    }*/


    /* static void echo (){
        System.out.println("Hi man");
    }
    static void simple(int volume, String text){
        for (int i = 0; i < 3; i++) {
            echo();
        }
        for (int j = 0; j < volume; j++) {
            System.out.println(text);
        }
    }
    static void bumM(int a){
        for (int i = 0; i < a; i++) {
            simple(2, "Bummm");
        }


    }
    public static void main(String[] args) {
        bumM(3);

    }*/

