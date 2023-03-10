package com.syntax.review9;

public class Bank {
    public static void main(String[] args) {
        Customer c=new Customer();
        c.setName("Leo");
        System.out.println("Name of the customer is "+c.getName());
        c.setSsn(1546542154);
        System.out.println("SSN of the customer is "+c.getSsn());

        PrivateClient pc=new PrivateClient("Nala",65453654);
        System.out.println(pc.getName());
        System.out.println(pc.getSsn());

    }
}
