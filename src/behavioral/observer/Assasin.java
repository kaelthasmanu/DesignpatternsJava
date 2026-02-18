package behavioral.observer;

public class Assasin extends Enemy implements MyObserver{
    public Assasin(String name) {
        this.name = name;
        this.active = false;
    }

    @Override
    void attack() {
        if (active) {
            System.out.println(name + " strikes swiftly from the shadows!");
        } else {
            System.out.println(name + " is inactive and cannot attack.");
        }
    }

    @Override
    void setActive() {
        this.active = true;
        System.out.println(name + " is now active.");
    }

    @Override
    public void update(String message) {
        setActive();
        attack();
    }
}
