package com.syntax.review6;

public class MoreStringMethods {
    public static void main(String[] args) {
        String myString="Today is February 2";
        String[] strArray=myString.split(" ");
        for(String x:strArray){
            System.out.println(x);
        }
        System.out.println("------------");
        System.out.println(myString);

       String newStr=myString.substring(9);//the beginning index we want to print
        System.out.println(newStr);//February 2

        newStr=myString.substring(9,17);
        System.out.println(newStr);

        int index=newStr.indexOf('b');
        System.out.println("Index of character b is "+index);//2

        String anotherStr="Today is Thursday";
        index=anotherStr.indexOf("Thursday");
        System.out.println("Index of Thursday is "+index);//9 9 is T


    }
}
