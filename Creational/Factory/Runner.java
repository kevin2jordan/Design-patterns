package DesignPatterns.Creational.Factory;

public class Runner {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(ShapeType.CIRCLE);
        shape.draw();
        Shape shape1 = shapeFactory.getShape(ShapeType.SPHERE);
        shape1.draw();
    }
}
