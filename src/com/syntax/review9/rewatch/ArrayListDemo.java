package com.syntax.review9.rewatch;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //The Integer class wraps a value of the primitive type int in an object
        ArrayList<Integer> alist = new ArrayList<>();
        //to store values inside an arrayList
        alist.add(12);
        alist.add(13);
        alist.add(14);

        //how to find size of my arrayList
        int size=alist.size();
        System.out.println("size of alist is"+size);

        //to access
        Integer firstElement = alist.get(0);// specify index number
        System.out.println(firstElement);
        //replacing the value of the first element
        alist.set(0,120);

        firstElement=alist.get(0);
        System.out.println(firstElement);

        //remove elements
        alist.remove(2);
        //printing list after removing
        System.out.println(alist);

    }
}
