package com.syntax.review7.rewatch;

public class Tesla extends Car{

    String type;
    boolean autoPilot;

   public Tesla(String make,String model,int year,int horsePower,String type,boolean autoPilot){
        super(make,model,year,horsePower);
        this.type=type;
        this.autoPilot=autoPilot;
    }

    public void haveAutoPilot(){
        System.out.println(make+" have autopilot "+autoPilot);
    }

    public void start(){
        System.out.println(make+" starts automatically");
    }

    //overriding is when we have same method name in 2 different classes(parent-child)
    //in overriding - inheritance in the must
    // in overriding - method signature must be same


}
