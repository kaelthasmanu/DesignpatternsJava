package creational.abstractFactory;

public class WarlockFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Warlock();
    }

    @Override
    public Weapon createWeapon() {
        return new Staff();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }
}
