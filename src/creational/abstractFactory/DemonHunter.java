package creational.abstractFactory;

public class DemonHunter implements Enemy{
    @Override
    public void attack() {
        System.out.println("Demon Hunter attacks with dual-wielding weapons!");
    }
}
