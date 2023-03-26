package DesignPatterns.Creational.AbstractFactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType type) {
        switch(type) {
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }
}
