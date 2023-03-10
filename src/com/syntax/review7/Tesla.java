package com.syntax.review7;

//Tesla is a subclass of a Car
//Car class is a super class of Tesle

public class Tesla extends Car{
    String type;
    boolean autoPilot;

    public Tesla(String make, String model , int year, int horsePower, String type, boolean autoPilot){
        super(make, model, year, horsePower);
        this.type=type;
        this.autoPilot=autoPilot;
        }

        public void haveAutoPilot(){
            System.out.println(make+" have auto pilot "+autoPilot);
        }


        @Override
    public void start(){
        System.out.println(make+" starts automatically");
    }

    //Overriding - is when we have same method name in 2 Different class(Parent - Child)
    // In overriding - INHERITANCE is must
    //In overriding method signature should be same

}

