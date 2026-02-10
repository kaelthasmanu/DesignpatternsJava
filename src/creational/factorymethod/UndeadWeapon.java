package creational.factorymethod;

public record UndeadWeapon(WeaponType weaponType) implements Weapon {
    @Override
    public String toString() {
        return "an undead " + weaponType;
    }
}
