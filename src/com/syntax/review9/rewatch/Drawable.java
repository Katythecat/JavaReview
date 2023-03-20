package com.syntax.review9.rewatch;

//interface is a collection of public static final variables
//and public abstract methods

public interface Drawable {
    String TOOL="pencil"; // this is constant method public static final by default
    void draw();//unimplemented method by default this method is public abstract
    //cannot have constructor bc we don't have instance variable

    //above is how Interface used to be before java 8
    //after java 8 static and default and private methods were added to the Interface
    // static and default to provide the flexibility
    default void print(){//concrete method
        System.out.println("We are drawing object using "+TOOL);
    }

    static void erase(){
        System.out.println("All drawings are erasable");
    }
}
abstract class Shape{
    public String color;
    protected double width, length;
    Shape(String color, double width, double length){
        this.width=width;
        this.color=color;
        this.length=length;
    }

    public abstract double calculateArea();//inside abstract can have implement and unimplemented
}


class Rectangle extends Shape implements Drawable{

    Rectangle(String color, double width, double length){
        super(color, width, length);
    }

    public double calculateArea() {
        return width*length;
    }

    //need to implement the method from parent class or change to abstract class
    public void draw(){
        System.out.println("I am drawing rectangle");
    }

}


class Square implements Drawable{

    public void draw(){
        System.out.println("I am drawing square");
    }
}