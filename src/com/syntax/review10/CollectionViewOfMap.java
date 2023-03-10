package com.syntax.review10;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class CollectionViewOfMap {
    public static void main(String[] args) {
        Map<String ,Double> lmap=new LinkedHashMap<>();
        lmap.put("Milk",5.99);
        lmap.put("eggs",4.58);
        lmap.put("bread",7.99);
        lmap.put("apple",1.99);
        lmap.put("fries",4.59);
        lmap.put("eggs",7.99);
        lmap.put("Tomato",4.59);
        System.out.println(lmap.get("eggs"));

        Set<String> keys=lmap.keySet();
        for(String key:keys){
            System.out.print(key+" = "+lmap.get(key));
        }

        System.out.println();

        Iterator<String> iterator=keys.iterator();
        while(iterator.hasNext()){
            String key= iterator.next();
            System.out.print(key+" = "+lmap.get(key));
        }
        System.out.println();
        Collection<Double> values=lmap.values();
        for(double value:values){ //can go with unwrap
            System.out.print(value+" ");
        }



    }
}
