package behavioral.observer;

public abstract class Enemy {
    String name;
    boolean active;

    public String getName() {
        return name;
    }

    abstract void attack();
    abstract void setActive();
}
