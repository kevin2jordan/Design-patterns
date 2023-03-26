package DesignPatterns.Structural.Bridge;

public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("drawing green circle...");
    }
}
