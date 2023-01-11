package com.syntax.review2;

public class Casting {
    public static void main(String[] args) {
        /*
        Casting - convert 1 datatype into another
        1.widening / implicit/ automatic
        (byte->short->int->long->float->double)
        2.narrowing / explicit/ manual
        (double->float->long->int->short->byte)
         */

        //widening
        double d = 5;
        System.out.println(d);// 5.0

        //narrowing
        int i = (int)5.0;
        System.out.println(i);//5

        byte b = (byte)128;
        System.out.println(b);//-128
    }
}
