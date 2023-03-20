package com.syntax.review9.rewatch;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<String> computers = new ArrayList<>();
        computers.add("Macbook Pro");
        computers.add("HP");
        computers.add("Lenovo");
        computers.add("Dell");

        System.out.println(computers);
        for (int i = 0; i < computers.size(); i++) {
            String c=computers.get(i);
            System.out.print(c+" ");
        }
        System.out.println();
        for(String s:computers){
            System.out.print(s+" ");
        }

        }
    }

