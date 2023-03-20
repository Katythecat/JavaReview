package com.syntax.review6.rewatch;

public class StrBuilderDemo {
    public static void main(String[] args) {

        //StringBuilder is mutable collection of characters
        StringBuilder stringBuilder=new StringBuilder("Hello");

        //all changes happen on the same object
        stringBuilder.reverse(); // proves that string builder is mutable
        System.out.println(stringBuilder);//olleH

        String str=stringBuilder.toString();
        str.toUpperCase();//proves that string is immutable
        System.out.println(str);//olleH



    }
}
