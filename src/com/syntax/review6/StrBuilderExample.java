package com.syntax.review6;

public class StrBuilderExample {
    public static void main(String[] args) {
        //StringBuilder is a class (mutable)
        //this class is mutable collection of characters
        StringBuilder sb=new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb);// reverse sequence of character
        String str=sb.toString();//converse to immutable
        str.toUpperCase();//prove that string is immutable
        System.out.println(str);//still to see hello in reverse and lower case

    }
}
