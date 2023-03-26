package DesignPatterns.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observers = new ArrayList<>();
    int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllUsers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllUsers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }
}
