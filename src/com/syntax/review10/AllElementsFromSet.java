package com.syntax.review10;
import java.util.*;

public class AllElementsFromSet {
    public static void main(String[] args) {
        Set<String> qaJobs=new LinkedHashSet<>();

        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api Tester");
        qaJobs.add("Database Tester");
        System.out.println(qaJobs);

        //how to retrieve all value from a set
        //1 enhance for loop
        for(String qaJob:qaJobs){
            System.out.print(qaJob+" ");
        }

        System.out.println();
        //2 iterator()
        //Iterator Interface has 3 methods : hasNext(), next(), remove()
        Iterator<String> iterator= qaJobs.iterator();
        while(iterator.hasNext()){
            String qa= iterator.next();
            System.out.print(qa+" ");
        }

    }
}
