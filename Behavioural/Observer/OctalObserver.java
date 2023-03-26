package DesignPatterns.Behavioural.Observer;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("Octal String: " + subject.getState());
    }
}
