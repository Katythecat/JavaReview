package com.syntax.review9;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        //The Integer class wraps a value of the primitive type int in an obj
        ArrayList<Integer> arrayList=new ArrayList<>();
        //to store value inside an arrayList
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);

        //how to find size of my arraylist
        int size=arrayList.size();
        System.out.println(size);//3

        //to access arraylist
        int firstEle=arrayList.get(0);
        System.out.println(firstEle);
        //replacing value of the 1 element
        arrayList.set(0,120);

        firstEle=arrayList.get(0);
        System.out.println(firstEle);

        //remove elements
        arrayList.remove(2);
        //printing list after the removal
        System.out.println(arrayList);

    }

}
