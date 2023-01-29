package com.syntax.review5;

public class ArrayReview {
    public static void main(String[] args) {
        int a ;// call declare variable

        int[] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;

        System.out.println(arr[1]);//20
        //System.out.println(arr[3]);//ArrayIndexOutOfBoundException
        System.out.println("Size of the array = "+arr.length);

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----------");

        for(int num:arr){
            System.out.println(num+" ");
        }

        String[] colors={"Pink","Blue","Orange","White","Gold","Red"};
        //anytime we have arrays we can use enhanced for loop
        for(String color:colors){
            System.out.print(color+" ");//Pink Blue Orange White Gold Red
        }

        for(int i=colors.length-1;i>=0;i--){
            System.out.print(colors[i]+" ");//Red Gold White Orange Blue Pink
        }
    }
}
