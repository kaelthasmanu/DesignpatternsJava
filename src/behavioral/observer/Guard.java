package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Guard extends Enemy implements MyObservable{

    List<MyObserver> observers = new ArrayList<MyObserver>();

    public Guard(String name) {
        this.name = name;
        this.active = true;
    }

    @Override
    public void addObserver(MyObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(MyObserver o) {
        observers.remove(o);
    }

    @Override
    public void broadcastMessage(String message) {
        for (MyObserver observer : observers) {
            observer.update(message);
        }
    }

    @Override
    void attack() {
        if (active) {
            System.out.println(name + " defends the area with a shield!");
        } else {
            System.out.println(name + " is active and can attack.");
        }
    }

    @Override
    void setActive() {

    }
}
