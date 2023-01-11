package com.syntax.review1;

public class WhatIf {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        String c = "Hello";
        String d = "Java";
        System.out.println(a+b+c+d);//30HelloJava
        System.out.println(a+c+d+b);//10HelloJava20

        //when String+int it became to String concatenation not plus
        System.out.println(c+d+a+b);//HelloJava1020

        System.out.println(c+d+(a+b));//HelloJava30 math order inside () first

        //Arithmetic Operators: + - * / %

    }
}
