package creational.abstractFactory;

public class HeavyArmor implements Armor{
    @Override
    public void protect() {
        System.out.println("Heavy armor provides excellent protection but reduces mobility.");
    }
}
