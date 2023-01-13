package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {

        //logical operator
        //we use && || to test for 2 or more conditions
        //we use ! to reverse
        boolean loginButtonDisplayed=true;
        boolean loginButtonClickable=false;
        if(loginButtonDisplayed&&loginButtonClickable){
        System.out.println("Test case is passed");
    }else{
            System.out.println("Test case failed");
        }
        System.out.println("-------------------");

        boolean dashboard=false;
        String message="Welcome admin";
        if(dashboard||message.equals("Welcome admin")){
            System.out.println("User is successfully logged in");
        }else{
            System.out.println("User is not logged in");
        }
        System.out.println("------------------");

        boolean b=true;
        System.out.println(!true);//false

        boolean agreeCheckboxSelected=false;
        if(!agreeCheckboxSelected) {
            System.out.println("I am clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");

    }
}
