package DesignPatterns.Structural.Facade;

public class ShapeMaker {

    private Shape cirle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        cirle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        cirle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

}
