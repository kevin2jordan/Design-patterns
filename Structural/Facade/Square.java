package DesignPatterns.Structural.Facade;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape :: Square");
    }
}
