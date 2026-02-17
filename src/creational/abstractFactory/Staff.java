package creational.abstractFactory;

public class Staff implements Weapon{
    @Override
    public void damage() {
        System.out.println("Staff deals 5 damage!");
    }
}
