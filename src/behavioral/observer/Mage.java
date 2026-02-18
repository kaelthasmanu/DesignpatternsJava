package behavioral.observer;

public class Mage extends Enemy implements MyObserver{
    public Mage(String name) {
        this.name = name;
        this.active = false;
    }



    @Override
    void attack() {
        if (active) {
            System.out.println(name + " casts a powerful spell!");
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
