package com.syntax.review9;
//interface is collection of public static final variables and public abstract methods

public interface Drawable {
    String TOOL="Pencil";   //by default public static final
    // usually constant we write with upper case
    void draw();//by default this method is public abstract
    //above is how interface used to before java8
    //after java 8 static , default and private method were added
    default void print(){
        System.out.println("We are drawing object using "+TOOL);
    }
    static void erase(){
        System.out.println("All drawing are erasable");
    }
}

abstract class Shape{
    public String color;
    protected double width, length;
    Shape(String color, double width, double length){
        this.color=color;
        this.width=width;
        this.length=length;
    }
    public abstract double calculateArea();
}

class Rectangle extends Shape implements Drawable{

    Rectangle(String color, double width, double length){
        super(color, width, length);
    }

    public double calculateArea(){
        return length*width;
    }
    public void draw(){
        System.out.println("I am drawing rectangle");
    }
}

class Square implements Drawable{
    public void draw(){
        System.out.println("I am drawing square");
    }
}
