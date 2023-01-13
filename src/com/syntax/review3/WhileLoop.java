package com.syntax.review3;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        while(i<=4){
            System.out.println("Hello");
            i++;
        }
        for(int j=1;j<=4;j++){
            System.out.println("Hello" +j);
        }
/*
Let's ask a user if he/she is tired
as long as user is not tired->we will say let's study Java
 */
        Scanner input=new Scanner(System.in);
        System.out.println("Are you tired");
        boolean tired=input.nextBoolean();

        while(!tired){
            System.out.println("Let's study Java");
            System.out.println("This is great");
            System.out.println("Are you tired");
            tired=input.nextBoolean();
            System.out.println();

        }

        }
    }

