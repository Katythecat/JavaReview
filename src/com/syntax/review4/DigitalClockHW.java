package com.syntax.review4;

public class DigitalClockHW {
    public static void main(String[] args) {
        //it should start printing 00.00 and end 23.59

        for (int i = 0; i <=23; i++) {
            for (int j = 0; j <=5 ; j++) {
                for (int k = 0; k <=9 ; k++) {
                    System.out.println(i+" "+j+" "+k);
                }
            }
        }



    }
}
