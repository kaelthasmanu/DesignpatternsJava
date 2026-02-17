package creational.abstractFactory;

public abstract class EnemyAbstractFactory {
    public abstract Enemy createEnemy();
    public abstract Weapon createWeapon();
    public abstract Armor createArmor();
}
