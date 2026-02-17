package creational.abstractFactory;

public class Robe implements Armor{
    @Override
    public void protect() {
        System.out.println("Robe provides minimal protection but increases mobility.");
    }
}
