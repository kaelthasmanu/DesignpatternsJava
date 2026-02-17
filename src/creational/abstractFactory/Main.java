package creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        EnemyAbstractFactory factory = new DemonHunterFactory();
        Enemy enemy = factory.createEnemy();
        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();

        enemy.attack();
        weapon.damage();
        armor.protect();

        EnemyAbstractFactory factory2 = new WarlockFactory();
        Enemy enemy2 = factory2.createEnemy();
        Weapon weapon2 = factory2.createWeapon();
        Armor armor2 = factory2.createArmor();

        enemy2.attack();
        weapon2.damage();
        armor2.protect();
    }
}
