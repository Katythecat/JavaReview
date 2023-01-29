package com.syntax.review5;

public class TwoDArrayReview {
    public static void main(String[] args) {
        int[][] num={{21,5,6,12,4,1},//0
                      {2,5,6},//1
                      {23,7,94,1},//2
                         {2,5},//3
                        {22,12,65}};//4

        //using reg for loop
        for (int row = 0; row < num.length; row++) {//outer loops iterates over rows
            for (int  column = 0;column  <num[row].length ; column++) {//iterates over each column

                //i want to print values only from add rows
                if (row % 2 != 0) {
                    System.out.print(num[row][column] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("-------------");










        //getting all values from 2d array
        for(int[] n:num){// iterates over arrays
            for(int t:n) {// iterates over each element
                if (t % 2 == 0) {
                    System.out.print(t + " ");
                }
            }
            System.out.println();
        }

        System.out.println("----------------");
        int numberOfArrays=num.length;// number of row
        System.out.println(numberOfArrays);

        int numberOfElementsIn1Array=num[0].length;
        System.out.println(numberOfElementsIn1Array);//6

        int numberOfElementsIn4Array=num[3].length;
        System.out.println(numberOfElementsIn4Array);//2

        //access 7
        System.out.println(num[2][1]);//7



    }
}
