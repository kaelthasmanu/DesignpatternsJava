package creational.abstractFactory;

public class Sword implements Weapon{
    @Override
    public void damage() {
        System.out.println("Sword deals 10 damage!");
    }
}
