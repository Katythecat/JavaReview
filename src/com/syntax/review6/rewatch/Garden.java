package com.syntax.review6.rewatch;

public class Garden {
    //scope of local variable is in its block of code
    void hello(){
        String name="Adem"; // name is local variable
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        // String str; declaration
        // static String str; -error we cannot use static
        // for local variable (in main method) static is a class level variable




        //accessing variables of Flower class
        Flower flower1=new Flower();
        System.out.println(Flower.pretty);
        flower1.color="red"; // initialize variable
        flower1.name="Hibiscus";
        flower1.price=5;
        flower1.price=8;
        System.out.println(flower1.pretty);
        //can access through the instance but it is the right way

        System.out.println("flower1 price after reassign "+flower1.price);
        //flower1.size=error - since variables size
        //does not exist in flower class

        //accessing methods of Flowers class
        flower1.grow();
        flower1.smell();
        flower1.bloom();

        System.out.println("Cresting second object of the flower class");
        Flower flower2=new Flower();
        flower2.name="Rose";
        flower2.color="blue";
        flower2.price=15;

        flower2.grow();
        flower2.smell();
        flower2.bloom();

        Flower flower3=new Flower();
    }
}
