package com.syntax.review5;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many name you want to store");
        int size = input.nextInt();
        String[] name = new String[size];
        System.out.println("Please enter name");
        for (int i = 0; i < name.length; i++) {
            name[i] = input.next();
        }
        for (String n : name) {
            System.out.println(n + " ");
        }
    }
}
