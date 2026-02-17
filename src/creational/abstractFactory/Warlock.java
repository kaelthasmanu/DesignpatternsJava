package creational.abstractFactory;

public class Warlock implements Enemy{
    @Override
    public void attack() {
        System.out.println("Warlock attacks with dark magic!");
    }
}
