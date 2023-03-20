package com.syntax.review8.rewatch;

public class InsuranceTest {
    public static void main(String[] args) {
        //can I create an obj of Insurance class-no
        //why it's abstract
        //how to create then --> through the child class

        Insurance carPolicy=new CarPolicy("157653","George",200,30);
        carPolicy.getInsurance();
        System.out.println(carPolicy.calculateCoverage());


        Insurance petPolicy=new PetPolicy("156463435","Leo",4,250);
        petPolicy.getInsurance();
        System.out.println(petPolicy.calculateCoverage());

        Insurance[] insurances={
                new CarPolicy("156463435","Leo",4,250),
                new CarPolicy("156463435","Leo",4,250),
                new CarPolicy("156463435","Leo",4,250),
                new PetPolicy("156463435","Leo",4,250),
                new PetPolicy("156463435","Leo",4,250),
        };

        insurances[0].calculateCoverage();



    }
}
