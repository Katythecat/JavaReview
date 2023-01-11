package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {
        /* when we have more conditions to test

            if(boolean condition){
                code A;
            }else if(boolean condition){
                code B;
            }else if(boolean condition){
                code C;

         */
        /* Check homework
        if you completed more than 25 -> great job
        if you completed more than 20 -> good job
        if you completed more than 10 -> ok job
        if you completed more than 5 -> not good job
        */

        int hw=25;
        if(hw>25){
            System.out.println("Great job!!");
        }else if(hw>20){
            System.out.println("Good job");
        }else if(hw>10){
            System.out.println("Ok job");
        }else if(hw>5){
            System.out.println("Not good job");
        }

        System.out.println("------------------");

        String browser = "firefox";
        if(browser.equals("chrome")){
            System.out.println("Test cases executed on chrome browser");
        }else if(browser.equals("safari")){
            System.out.println("Test case executes on safari browser");
        }else if(browser.equals("firefox")){
            System.out.println("Test cases execute on firefox browser");
        }else{
            System.out.println("Browser is not supported");
        }

    }
}
