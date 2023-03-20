package com.syntax.review7.rewatch;

public class Car {
    protected String make, model;
    int year, horsePower;

    public Car(String make, String model){//we overload the constructor
        this.make=make; // use this for instance variable
        this.model=model;
    }

    public Car(String make, String model,int year, int horsePower){
        this(make,model);//making call to the current class constructor
        this.year=year;//accessing current class instance variables
        this.horsePower=horsePower;
    }

    public void start(){
        System.out.println(make+" starts");
    }

    public void drive(int speed){
        System.out.println(make+" drives with speed "+speed);
    }

    //same class have method 2 or more method with same name= method overloading
    /* how to implement
    1. by using different number of parameters
    2. by using different type of parameters
    3. sequence

    */
    protected String drive(String destination){ // overloading by different type of parameters
        System.out.println(make+" drives to "+destination);
        return destination;
    }

     void drive(int speed, String destination){
        System.out.println(make+" drive to "+destination+" with speed "+ speed);
    }

    public void drive(String destination, int speed){
        System.out.println(make+" drive to "+destination+" with speed "+ speed);
    }
     /* // am i overloading
     private void drive (int wheel){ -- we cannot overload by changing access modifier
     we are not overloading
    }

    String drive(String destination){ -- we cannot overload by changing return type
        return destination;
    }

    In Overloading methods signature MUST BE DIFFERENT
    method signature involves name and parameter only

    In overloading we do not care about return type can be change
    or access modifier can be different

   */

}
