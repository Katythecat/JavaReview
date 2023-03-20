package com.syntax.review8.rewatch;


import com.syntax.review7.rewatch.Car;
import com.syntax.review7.rewatch.Tesla;


public class CarTest {
    public static void main(String[] args) {
        BMW bmw=new BMW("BMW","X7");
        bmw.start();
        bmw.drive("smooth");
        bmw.brake();

        Car car=new Car("somecar","somemedel");
        car.drive(90);
        car.start();
        //car.brake(); this from BMW we cannot get this method

        Tesla tesla=new Tesla("Tesla","s4",2022,380,"Electric",true);
        tesla.haveAutoPilot();
        tesla.drive(90);
        tesla.start();

        //runtime polymorphism achieve through method overriding
        //casting : widening(happen implicitly) and narrowing - used with primitive
        //          upcasting(happen implicitly) and down-casting - used with non-primitive
        Car bmw1=new BMW("BMW","X77"); // we call by upcasting
        bmw1.start();
        bmw1.drive(120);
        bmw1.drive("Portland",80);

        //how the runtime polymorphism works
        // a compiler give you an options(methods) based on the type(Car type)
        // but java execute based on the object(BMW)(runtime)
        //1. compiler will look for the methods that available in the type(Parent)
        //2. but when we execute (runtime) java will look for a method from child
        // if this method override from parent it will be executed instead of method in parent




    }
}
