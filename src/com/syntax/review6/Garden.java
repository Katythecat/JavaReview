package com.syntax.review6;

public class Garden {

    void hello(){
        String name="Adem";
        System.out.println("Hello "+name);

    }
    public static void main(String[] args) {
        //static String str;cannot use static for
        // local variable




        //variable declaration=new object
        // flower1 is a referent variable

        //accessing variables of Flowers class
            Flower flower1=new Flower();

            flower1.name="Hibiscus";
            flower1.color="red";
            flower1.price=5;
        System.out.println(Flower.pretty);//correct way accessing static variable
        //accessing static variable
           flower1.pretty=false;//not the right way to
        //access static variable but it is possible
        //accessing methods of Flowers class
            flower1.bloom();
            flower1.smell();
            flower1.grow();
            System.out.println("Hibiscus pretty"+flower1.pretty);

        System.out.println(flower1.price);



        System.out.println("Crating second object of the flower class");
            Flower flower2=new Flower();
        System.out.println("Roses are pretty? "+flower2.pretty);
            flower2.name="Rose";
            flower2.color="blue";
            flower2.price=15;
            flower2.price=18;



        System.out.println(flower2.price);

            flower2.bloom();
            flower2.smell();
            flower2.grow();
            //flower2.stinks error -since method
        //doesn't declare this stinks

            Flower flower3=new Flower();
//variable i - is a local to it's block of code- loop
        for (int i =1 ; i <=3 ; i++) {
            System.out.println(i);

        }
        //System.out.println(i);error- since i is not visible outside of loop



    }
}
