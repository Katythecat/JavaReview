package com.syntax.review7;

public class Car {
    protected String make, model;//make protected or public to visible in different package
    int year, horsePower;

    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }

    public Car(String make, String model , int year, int horsePower){
        this(make, model);//making call to the current class constructor
        this.year=year;// accessing current class instance variables
        this.horsePower=horsePower;
    }

    public void start(){
        System.out.println(make+" starts");
    }

    public void drive(int speed){
        System.out.println(make+" drives with speed "+speed);
    }

    //SAME class have 2 or more methods with same mame=method overloading
    /*How to implement
    1.by using dif number of params
    2.by using dif type of params
    3.by sequence
     */

    //when we overload we can put parameter from nowhere no need to declared
    protected String drive(String destination){
        System.out.println(make+" drives to "+destination);
        return destination;
    }

    void drive(int speed, String destination){
        System.out.println(make+" drives to "+ destination+" with speed ="+speed);
    }

    public void drive(String destination, int speed){
        System.out.println(make+" drives to "+ destination+" with speed ="+speed);
    }

    //am I overloading
    /*
            private void drive(int wheel){}-NO
            by changing access modifiers we are not overloading

            String drive(String destination){} - NO
            we cannot overload methods by changing it is return type

            In Overloading methods signatures must be different
            method signature involve name and parameters only!!!

            In overloading we do not care about return type (can be changed)
            or access modifiers (can be different)

     */




}
