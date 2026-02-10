package creational.factorymethod;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class UndeadBlacksmith implements Blacksmith {
    private static final Map<WeaponType, Weapon> UndeadARSENAL;

    static {
        UndeadARSENAL = new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type -> UndeadARSENAL.put(type, new UndeadWeapon(type)));
    }

    @Override
    public Weapon createWeapon(WeaponType weaponType) {
        return UndeadARSENAL.get(weaponType);
    }

    @Override
    public String toString() {
        return "The undead blacksmith";
    }
}
