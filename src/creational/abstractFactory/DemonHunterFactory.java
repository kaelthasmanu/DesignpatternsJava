package creational.abstractFactory;

public class DemonHunterFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new DemonHunter();
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }
}
