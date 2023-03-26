package DesignPatterns.Structural.Decorator;

public class Runner {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        Shape greenCircle = new GreenShapeDecorator(new Circle());
        Shape greenRectangle = new GreenShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
        greenCircle.draw();
        greenRectangle.draw();
    }
}
