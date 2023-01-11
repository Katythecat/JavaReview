package com.syntax.review2;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        int i = 10;
        // non primitive variable = scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your age");
        int age=keyboard.nextInt();// to capture int values

        System.out.println("Are you tired?");
        boolean tired=keyboard.nextBoolean();// to capture boolean values


        System.out.println("What is your favorite food?");
        String sentence=keyboard.next();// to capture Sting the whole sentence
        sentence=keyboard.nextLine();

        System.out.println("What is your name?");
        String name=keyboard.next();// to capture String until space

    }

}
