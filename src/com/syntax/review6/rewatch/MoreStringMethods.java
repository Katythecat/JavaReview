package com.syntax.review6.rewatch;

import java.util.Arrays;

public class MoreStringMethods {
    public static void main(String[] args) {
        String myString="Today is February 2";
        String[] s=myString.split(" ");
        for(String a:s){
            System.out.println(a);
        }
        System.out.println(Arrays.toString(s));
        System.out.println(s[1]);//is
        System.out.println(s.length);//4

        System.out.println("------------");

        System.out.println(myString); // Today is February 2
        String newStr=myString.substring(9);// it can be just start point
        System.out.println(newStr);

        //we can specify beginning and end
        newStr=myString.substring(9,17);
        System.out.println(newStr);//February

        int index=newStr.indexOf('b');
        System.out.println(index);//2

        String anotherStr="Today is Thursday";
        int index1=anotherStr.indexOf("Thursday");
        System.out.println(index1); // we will get only single character T








    }
}
