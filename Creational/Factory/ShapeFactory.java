package DesignPatterns.Creational.Factory;

public class ShapeFactory {
    public Shape getShape(ShapeType shapeType) {

        switch(shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            case SPHERE:
                return new Sphere();
            default:
                return null;
        }
    }
}
