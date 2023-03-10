package com.syntax.review8;

public class InsuranceTester {
    public static void main(String[] args) {
        //can I create an object of Insurance class - no it is an abstract
        Insurance carPolicy=new CarPolicy("I56","Sam Smith",200,22);
        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());

        Insurance petPolicy=new PetPolicy("I7646376","Katy",20,2);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());

        Insurance[] insurances={new CarPolicy("I56","Sam Smith",200,22),
                new PetPolicy("I7646376","Katy",20,2),
        new PetPolicy("I4657476","Leo",25,3)};
        for(Insurance i:insurances){
            System.out.println(i.calculateCoverage());
            i.getInsurance();


        }
    }
}
