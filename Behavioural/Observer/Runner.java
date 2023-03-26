package DesignPatterns.Behavioural.Observer;

public class Runner {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change ");
        subject.setState(15);
        System.out.println("Second state change");
        subject.setState(10);
        subject.setState(30);
    }
}
