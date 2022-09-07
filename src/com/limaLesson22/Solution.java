package com.limaLesson22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        /*try (FileInputStream inputStream = new FileInputStream("C:\\in.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\\\out.txt")){

        } catch (FileNotFoundException e) {
            throw  new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        Stack<String > stringStack = new Stack<>();
        stringStack.push("понедельник");
        stringStack.push("вторник");
        stringStack.push("среда");
        stringStack.push("четверг");
        System.out.println(stringStack);
        stringStack.pop();
        System.out.println(stringStack);
        System.out.println(stringStack.peek());
        System.out.println(stringStack);
        System.out.println(stringStack.search("вторник"));

        /*FinansialDep finansialDep = new FinansialDep();
           int sal = finansialDep.calculateSalary(new Employee(2000,"Ivanov"));
        FinansialDep finansialDep2 = new FinansialDep();
        int sal2 = finansialDep2.calculateSalary(new Employee(3000, "Petrov"));
        System.out.println(sal);
        System.out.println(sal2);*/

    }

}
