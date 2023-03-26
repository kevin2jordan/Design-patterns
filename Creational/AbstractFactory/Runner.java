package DesignPatterns.Creational.AbstractFactory;

public class Runner {
    public static void main(String[] args) {
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory1.getShape(ShapeType.SQUARE);
        shape1.draw();
        Shape shape2 = shapeFactory1.getShape(ShapeType.RECTANGLE);
        shape2.draw();

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory2.getShape(ShapeType.SQUARE);
        shape3.draw();
        Shape shape4 = shapeFactory2.getShape(ShapeType.RECTANGLE);
        shape4.draw();



    }
}
