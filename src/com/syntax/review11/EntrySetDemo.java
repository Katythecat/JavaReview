package com.syntax.review11;

import java.util.*;

public class EntrySetDemo {
    public static void main(String[] args) {
        Map<String,Double>fruitMap=new HashMap<>();
        fruitMap.put("Apple",12.5);
        fruitMap.put("Banana",4.9);
        fruitMap.put("Dragon fruit",5.6);
        fruitMap.put("Pear",16.5);
        fruitMap.put("Orange",15.5);
        fruitMap.put("Mango",10.6);
//print only those elements which contain the letter a and e and price is more than 8 $
        Set<Map.Entry<String,Double>>entrySet=fruitMap.entrySet();
        for(Map.Entry<String,Double> entry:entrySet){
            if((entry.getKey().contains("a")||entry.getKey().contains("e")) && entry.getValue()>8) {
                //if we use and operation java consider read && first can fix by use extra parenthesis
                /*
                Pear 8.85
                Grape 7.59
                Mango 11.85
                Orange 12.86
                Banana 6.85
                 */
                System.out.println(entry);
                }
            }
        }
    }

