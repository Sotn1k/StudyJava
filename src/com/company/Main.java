package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input person count ");
       int countPersons = scanner.nextInt();

        String[] persons = new String[countPersons];
       //int n = persons.length;
        for (int i = 0; i < persons.length; i++) {
            System.out.println("input lastname for persons # " + i + ":");
            persons[i]=scanner.next();
            }
        //int salary {100,200,300};
        int[] salary = new int[persons.length];
        for (int i = 0; i < salary.length; i++) {
            System.out.println("input salary for "+persons[i]+ ":");
            salary[i] = scanner.nextInt();
        }
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]+" have salary $" + salary[i]);
        }
        String lastname = scanner.next();
        for (int i = 0; i < persons.length; i++) {
            if (lastname.equals(persons[i])){

                System.out.println(persons[i]+" have salary $" + salary[i]);

            }
        }



        /*for (int i = 0; i < persons.length; i++) {
            System.out.println("persons["+i+"]="+persons[i]);
        }*/
        /*for (String person : persons) {
            System.out.println(person);*/

        }

    }

        /*Scanner inputVol = new Scanner(System.in);
        int inputOne = inputVol.nextInt();
        int inputTwo = inputVol.nextInt();
        int inputThree = inputVol.nextInt();
        if (inputOne == inputTwo && inputTwo == inputThree) {
            System.out.println(inputOne + " " + inputTwo + " " + inputThree);
        }else if (inputOne == inputTwo) {
            System.out.println(inputOne + " " + inputTwo);
        } else if (inputTwo == inputThree) {
            System.out.println(inputTwo + " " + inputThree);
        }else if (inputOne == inputThree)
            System.out.println(inputOne + " " + inputThree);*/


/* Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        int num = console.nextInt();
        do {
            System.out.println(s);
            num --;
        } while (num > 0 && num < 10);*/