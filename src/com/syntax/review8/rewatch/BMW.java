package com.syntax.review8.rewatch;


import com.syntax.review7.rewatch.Car;

public class BMW extends Car {

    public BMW(String make, String model){
        super(make,model);
    }

    public void start(){
        System.out.println(make+" starts with push start button ");
    }

    public String drive(String typeOfDriving){
        System.out.println(make+" dieves "+ typeOfDriving);
        return typeOfDriving;
    }

    void brake(){
        System.out.println(make+" brakes ");
    }


}
