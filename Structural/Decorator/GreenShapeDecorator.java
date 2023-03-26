package DesignPatterns.Structural.Decorator;

public class GreenShapeDecorator extends ShapeDecorator{
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorderColor();
    }
    public void setBorderColor() {
        System.out.println("Border color : Green..");
    }
}
