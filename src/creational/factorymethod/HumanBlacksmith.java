package creational.factorymethod;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class HumanBlacksmith implements Blacksmith {

    private static final Map<WeaponType, HumanWeapon> HUMARSENAL;

    static {
        HUMARSENAL = new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type -> HUMARSENAL.put(type, new HumanWeapon(type)));
    }

    @Override
    public Weapon createWeapon(WeaponType weaponType) { return HUMARSENAL.get(weaponType); }

    @Override
    public String toString() {
        return "the human blacksmith";
    }
}
