package com.syntax.review8;

import com.syntax.review7.Car;

public class Bmw extends Car {

    Bmw(String make, String model){
        super(make ,model);
    }

    public void start(){
        System.out.println(make+" start with push start button");
    }
    public String drive(String typeOfDriving){
        return  (make+" drives "+typeOfDriving);
    }
    void brake(){
        System.out.println(make+" brakes");
    }
}
