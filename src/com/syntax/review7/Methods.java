package com.syntax.review7;

public class Methods {
    // user defined : with return type and without
    //              : with parameters and without

    void hello() {
        System.out.println("Hello");
    }

    void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    //create a method that return a largest number between between given 2 integer

    int findLargest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //create a methods that return an average value of 2 decimal values

    double average(double a, double b) {
        return (a + b) / 2;
    }

    //returns reverse String from a given string
    String reverse(String a) {
        String newstr = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            newstr = newstr + a.charAt(i);
        }
        return newstr;
    }

    String rev1(String a){
        return new StringBuilder(a).reverse().toString();
    }

    StringBuilder rev(String str) {
        StringBuilder sb = new StringBuilder(str).reverse();
        return sb;
    }

    //create a method that will return a minimum value from given array
    public static int minimum(int[] num) {
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i] ;
            }
        }
        return min;
    }


        public static void main (String[]args){
            String name = "Leonale";
            int characters = name.length();
            System.out.println(characters);

            Methods md = new Methods();
            md.sayHello(name);

            int largest = md.findLargest(5, 9);
            System.out.println("The largest number is " + largest);


            System.out.println("An average number is " + md.average(15.55, 13.25));

            System.out.println(md.reverse("Toyota"));

            StringBuilder str = md.rev("Hello");
            System.out.println(str);

            System.out.println(md.rev1(" Bahamas"));
            
            String myString="Batch 15";
            boolean empty=myString.toUpperCase().isEmpty(); //false
            char character=myString.trim().charAt(2);// t
            System.out.println(character);


            System.out.println("-------------");
            int[] array={10,50,15,12};
            System.out.println(Methods.minimum(array));
            int mini=minimum(array);
            System.out.println(mini);


            System.out.println(minimum(new int[]{15,12,5}));

        }

    }

