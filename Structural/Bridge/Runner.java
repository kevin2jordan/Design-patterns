package DesignPatterns.Structural.Bridge;

public class Runner {

    public static void main(String[] args) {
        Shape redCircle = new Circle(10,10,10,new RedCircle());
        redCircle.draw();

        Shape greenCircle = new Circle(5,5,5,new GreenCircle());
        greenCircle.draw();
    }
}
