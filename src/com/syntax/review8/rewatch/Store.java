package com.syntax.review8.rewatch;



public class Store {
    public static void main(String[] args) {
        Furniture chair=new Chair();//upcasting
        //the method will be available based on the type
        chair.assemble();//from the type -Furniture needs to be assembled

        chair.comfort();//Not every chair is comfortable from the child //runtime polymorphism
        //during the runtime java make a decision based on the object
        //runtime will talk about behavior(method overriding)

        chair.breaks();//since we are not override methods breaks will be executed from Parent
        //this is also not the right way to call static method


        Furniture table=new Table();
        table.comfort();//runtime - Table cannot be comfortable
        table.assemble();//from the type -Furniture needs to be assembled

        Table table1=new Table();

        table1.comfort();//child
        table1.assemble();//parent
        table1.buildTable();//child
        table1.buildTable("wood");

        //compile time we will know right away which method will be execute
        //by looking at the parameters will be called

        //compile time polymorphism achieve by method overloading inside the same class

        Chair.breaks();//static
        Furniture.breaks();//static


    }
}
