package com.syntax.review9;


import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<String > computer=new ArrayList<>();
        computer.add("Macbook Pro");
        computer.add("HP");
        computer.add("Lenovo");
        computer.add("Dell");

        System.out.println(computer);

        for(int i=0;i<computer.size();i++){
            String s=computer.get(i);
            if(s.equals("HP")){
                System.out.println("I have HP");
            }
            System.out.println(s+" ");
        }

        System.out.println("--------------");

        for(String computers:computer){
            System.out.print(computers+" ");
        }



    }
}
