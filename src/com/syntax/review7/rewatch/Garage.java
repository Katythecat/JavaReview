package com.syntax.review7.rewatch;

public class Garage {
    public static void main(String[] args) {
        Tesla tesla=new Tesla("Tesla","s",2022,380,"electric",true);

        tesla.start();//from super class
        tesla.drive(100);//from super class

        tesla.haveAutoPilot();// from tesla class itself

        tesla.drive("Miami",120);





    }
}
