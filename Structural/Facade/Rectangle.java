package DesignPatterns.Structural.Facade;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape :: Rectangle");
    }
}
