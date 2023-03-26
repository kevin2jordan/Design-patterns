package DesignPatterns.Structural.FlyWeight;

public class Circle implements Shape{
    private int x;
    private int y;
    private int raidus;
    private String color;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRaidus(int raidus) {
        this.raidus = raidus;
    }

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle " + "x = " + x + " y = " + y + " radius " + raidus);
    }
}
