package com.syntax.review10;


import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
            //set is a collection of unique element
            Set<String> qaJobs=new HashSet<>();//does not maintain insertion order
            //adding object / elements to the collection
            qaJobs.add("Automation Engineer");
            qaJobs.add("Manual Tester");
            qaJobs.add("SDET");
            qaJobs.add("QA Analyst");
            qaJobs.add("Api Tester");
            qaJobs.add("Database Tester");
            System.out.println(qaJobs);//[Api Tester, Automation Engineer, QA Analyst, SDET, Manual Tester]

            qaJobs.remove("Manual Tester");
            System.out.println("Removed an element "+qaJobs);//[Api Tester, Automation Engineer, QA Analyst, SDET]
            qaJobs.add("Api Tester");
            qaJobs.add("Api Tester");//even we tye to add duplicate but it didn't print

            System.out.println("Added duplicates "+qaJobs);//[Api Tester, Automation Engineer, QA Analyst, SDET]

                // creating an obj and passing collection as a parameter to invoke parameterized constructor
            Set<String> lset=new LinkedHashSet<>(qaJobs);//maintain insertion order
            System.out.println("LinkedHashSet="+lset);//[Api Tester, Automation Engineer, QA Analyst, SDET]

            Set<String> tSet=new TreeSet<>();
            tSet.addAll(qaJobs);

            System.out.println("TreeSet="+tSet );//[Api Tester, Automation Engineer, Database Tester, QA Analyst, SDET]










    }
}
