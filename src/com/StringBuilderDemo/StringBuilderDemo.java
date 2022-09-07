package com.StringBuilderDemo;

public class StringBuilderDemo {
    public static StringBuilder string1 = new StringBuilder();
        public static StringBuilder str = new StringBuilder("Hello");
    public static void main(String[] args) {
        string1.append("c");
        string1.append(str);
        System.out.println(string1);
    }

}
