package com.syntax.review8.rewatch;

public class Furniture {
    public void assemble(){
        System.out.println("Furniture needs to be assembled");
    }

    public void comfort(){ // overridden
        System.out.println("Furniture needs to be comfortable");
    }

    private void use(){//we cannot override private bc they don't participate in inheritance
        System.out.println("Furniture is used by humans");
    }

    public static void breaks(){//we cannot override static method
        System.out.println("Furniture breaks");
    }
}

class Chair extends Furniture{

    public static void breaks(){
        System.out.println("Chair breaks");
    }

    private void use(){//we are not override we redeclare
        System.out.println("Chair is used by humans");
    }

    public void comfort(){ //overriding
        System.out.println("Not every chair is comfortable");
    }

    protected void loveSeat(){
        System.out.println("This is the best chair");
    }


}

class Table extends Furniture{
    public void comfort(){
        System.out.println("Table cannot be comfortable");
    }

    protected void buildTable(){
        System.out.println("We can easily build a table");
    }

    //compile time polymorphism achieve by method overloading inside the same class

    public void buildTable(String material){
        System.out.println("Method overload buildTable ");
        System.out.println("We build table from "+material);

    }


}


