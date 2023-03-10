package com.syntax.review8;

import com.syntax.review7.Car;
import com.syntax.review7.Tesla;

public class CarTest {
    public static void main(String[] args) {
        Bmw bmw=new Bmw("BMW","X7");
        bmw.start();
        System.out.println(bmw.drive("smooth"));
        bmw.brake();//comes from subclass

        Car car=new Car("Some-car","SomeModel");
        car.start();
        car.drive(90);

        Tesla tesla=new Tesla("Tesla","S",2022,380,"Electric",true);
        tesla.start();//overrided method from tesla class is executed
        tesla.drive(75);//comes from parent class
        tesla.haveAutoPilot();// comes from tesla class

        //Runtime polymorphism achieved through method overriding

        // casting= widening and narrowing - used with primitives
        //          upcasting and down-casting - non primitives
        Car bmw1=new Bmw("BMW","X77");//upcasting
        //when we do upcasting for (Polymorphism) the compiler will look at the type(Car)
        //which method available in Car type compiler will give you the access
        //same below we can access method only in the parent class
        //compiler doesn't give the access to the brake method from child class
        //but during the run time when we execute java will always go by the object type
        //when the java start execute it first java will go to the object type (BMW)
        //which mean if java see the method that compile give the access in parent class
        //if we have those method that override in child class java will take it and execute it
        //that's why we call runtime polymorphism achieve through the method overriding

        //during the runtime java give the priority to the object
        //during compile time compile give the priority to the type
        bmw1.start();//from child
        bmw1.drive(100);//from parent
        bmw1.drive("Miami",120);// from parent
    }
}
