package com.syntax.review9.rewatch;

public class Bank {
    public static void main(String[] args) {
        CustomerEncap c=new CustomerEncap();
        c.setName("Leo Rami");
        System.out.println("customer name is "+c.getName());
        c.setSSN(15465563);
        System.out.println("SSN "+c.getSSN());


        //when we use constructor instead of setter so here we need only getter
        PrivateClient p=new PrivateClient("Nala",15454654);
        System.out.println("Name of customer "+p.getName());
        System.out.println("SSN "+p.getSSN());

    }
}
