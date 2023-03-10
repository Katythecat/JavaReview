package com.syntax.review10;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Double> grocery=new HashMap<>();//hashmap no order
        grocery.put("Milk",5.99);
        grocery.put("eggs",4.58);
        grocery.put("bread",7.99);
        grocery.put("apple",1.99);
        grocery.put("fries",4.59);
        grocery.put("eggs",7.99);//does not allow duplicate kay so the value will update
        grocery.put("Tomato",4.59);//allow duplicate value


        double price=grocery.get("Milk");//pass the key and return the value
        System.out.println(price);

        System.out.println(grocery);

        int size=grocery.size();
        System.out.println("Number of entry objects "+size);//6


        Map<String ,Double> lmap=new LinkedHashMap<>();
        lmap.put("Milk",5.99);
        lmap.put("eggs",4.58);
        lmap.put("bread",7.99);
        lmap.put("apple",1.99);
        lmap.put("fries",4.59);
        lmap.put("eggs",7.99);
        lmap.put("Tomato",4.59);

        System.out.println("Order is preserved "+lmap);

        Map<String ,Double> tmap=new TreeMap<>();
        tmap.putAll(grocery);
        tmap.putAll(lmap);

        System.out.println("Size"+tmap.size());//6 no duplicate allow so still 6
        System.out.println("Sorted Order "+tmap);//6










    }
}
