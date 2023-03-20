package com.syntax.review6.rewatch;

public class Flower {
    //static use for define a common feature
    static boolean pretty=true;
    // static variable belong to the class
    //it's a class level variable

    //attribute , properties
    String color, name; //instance variable
    int price;

    // behavior
    //method is a block of code that perform a particular task
    //if we need it we will call it
    //we have build-in and user define methods
    void smell(){
        System.out.println(name+" smells good");
    }

    void bloom(){
        System.out.println(name+" flowers blooms");
    }

    void grow(){
        System.out.println(name+" flower grows");
    }
}
