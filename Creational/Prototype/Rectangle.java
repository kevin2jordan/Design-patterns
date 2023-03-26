package DesignPatterns.Creational.Prototype;

public class Rectangle extends Shape{

    public Rectangle() {
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Inside rectangle class..");
    }
}
