package DesignPatterns.Creational.AbstractFactory;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(ShapeType type) {
        switch (type) {
            case SQUARE:
                return new RoundedSquare();
            case RECTANGLE:
                return new RoundedRectangle();
            default:
                return null;
        }

    }
}
