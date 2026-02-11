package creational.factorymethod;

public record HumanWeapon(WeaponType weaponType) implements Weapon {
    @Override
    public String toString() {
        return "an human " + weaponType;
    }
}
