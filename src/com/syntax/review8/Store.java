package com.syntax.review8;

public class Store {
    public static void main(String[] args) {

        Furniture table=new Table();
        //the compiler check base on the type but java will go for runtime
        table.assemble();
        table.comfort();

        Table t=new Table();

        t.comfort();
        t.assemble();
        t.buildTable("Wood");//compile time polymorphism achieve through method overloading
        //we will know when look by the signature which method we be executed by looking at
        //the parameter we passed
        //execution of the method designed during the compilation time

        Chair.breaks();
        Furniture.breaks();//static method called by class name

        Furniture chair=new Chair();//upcasting
        chair.assemble();//method from parent
        chair.comfort();//method from child bc of runtime they look for the object class
        // chair.loveSeat(); runtime don't see method from child class
        //proof that method brakes is not overridden
        chair.breaks();//this is not the right way to call static method
        //method hidden so we cannot override static method
        //since we are not overriding methods brakes will be executed from parent

    }

}
