package DesignPatterns.Structural.FlyWeight;

public class Runner {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {

        for(int i=0;i<10;i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(colors[getRandomNumber()]);
            circle.setX(getRandomNumber());
            circle.setY(getRandomNumber());
            circle.setRaidus(getRandomNumber());
            circle.draw();
        }
    }

    private static int getRandomNumber() {
        return (int)(Math.random()*100)%colors.length;
    }
}
