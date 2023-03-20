package com.syntax.review6.rewatch;

public class StringMethods {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(str.length());//5
        System.out.println(str.toUpperCase());//HELLO
        System.out.println(str.charAt(1));// retrieve character e

        String newString=str.concat(" friends");
        System.out.println(newString);// Hello friends

        System.out.println(str);//Hello
        //string are immutable object we will not be able to change the value of the string
        //every time when we use the method then the brand-new string memory has created

        str=str.toLowerCase();
        System.out.println(str);// hello
        //but if we reassign then string will change to the latest ever we call str




    }


}
