package com.syntax.review7.rewatch;

public class OverLoading {
    private void hello(){
        System.out.println("hello");
    }

    private void hello(String name){
        System.out.println("hello "+name);
    }

    static void bye(){
        System.out.println("Bye");
    }

    static void bye(String name){
        System.out.println("Bye "+name);
    }
}
