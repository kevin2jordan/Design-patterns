package DesignPatterns.Structural.Bridge;

public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("drawing red circle..");
    }
}
