package com.syntax.review4;

public class MoreLoop {
    public static void main(String[] args) {
        //What is the output
        for (int i = 0; i <=3 ; i++) {
            for (int j = 1; j <=3 ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("----------");
        for (int i = 0; i <=3 ; i++) {
            System.out.println(i);// 0 1 2 3 print only i j is false
            for (int j = 1; j >=3 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
