package com.syntax.review7.rewatch;

public class Methods {
    // user defined : with return type and without(void)
     //             : with parameters and without

    void hello(){
        System.out.println("Hello");
    }

    void sayHello(String name){
        System.out.println("Hello "+ name);
    }

    //create a method that return the largest number between given 2 integer values
    int findLargest(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    //create a methods that return an average value of 2 decimal values
    double findAverage(double num1,double num2){
        return (num1+num2)/2;
    }

    //create a method reverse string from the given
     private String reverse(String str){
       return new StringBuilder(str).reverse().toString();
    }

    protected String reverse1(String s ) {
        String emp = "";
        for (int i = s.length()-1 ; i >=0; i--) {
             emp += s.charAt(i);
        }
        return emp;
    }

    //create a method that will return a minimum value from given array
    public static int minArray(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        String name="Leo";
        int characters=name.length();
        System.out.println(characters);

        Methods obj=new Methods();

        obj.sayHello(name);
        System.out.println("------------");

        int largest=obj.findLargest(100,200);
        System.out.println("the largest number is "+largest);

        System.out.println("An average of two decimal number is "+obj.findAverage(10,15.5));

        System.out.println(obj.reverse("Hakunamatata"));

        System.out.println(obj.reverse1("Seattle"));

        String myString="Batch15";
        boolean str1 = myString.toUpperCase().isEmpty();

        char c=myString.trim().charAt(2);

        int[] array={15,7,4,9,3};
        System.out.println(Methods.minArray(array));
        System.out.println(minArray(array));

        System.out.println(minArray(new int[]{15, 12, 5, 4}));


    }


}
