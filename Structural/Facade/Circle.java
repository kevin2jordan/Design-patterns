package DesignPatterns.Structural.Facade;

public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape :: Circle");
    }
}
