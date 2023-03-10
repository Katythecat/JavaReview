package com.syntax.review6;

public class StringMethods {
    public static void main(String[] args) {
        String str="Hello";//immutable
        System.out.println(str.length());// show how many character 5
        System.out.println(str.toUpperCase());//HELLO
        System.out.println(str.charAt(1));//e

        String newString=str.concat(" friends");
        System.out.println(newString);//Hello friends
        System.out.println(str);//Hello
        str=str.toLowerCase();//we can re-assign
        System.out.println(str);//hello

        //check the length of the String is more than 0
        boolean empty=str.isEmpty();
        System.out.println(empty);//false

        String str1="  Review B15   " ;
        //remove any leading or trailing white spaces
        String newStr1=str1.trim();
        System.out.println(str1);
        System.out.println(newStr1);






    }


}
