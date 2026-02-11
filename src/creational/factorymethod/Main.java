package creational.factorymethod;

public class Main {
    void main(){
        Blacksmith blacksmith = new UndeadBlacksmith();
        Weapon weapon = blacksmith.createWeapon(WeaponType.SPEAR);
        System.out.println("%s %s".formatted(blacksmith, weapon));
        weapon = blacksmith.createWeapon(WeaponType.AXE);
        System.out.println("%s %s".formatted(blacksmith, weapon));


        blacksmith = new HumanBlacksmith();
        weapon = blacksmith.createWeapon(WeaponType.SPEAR);
        System.out.println("%s %s".formatted(blacksmith, weapon));
        weapon = blacksmith.createWeapon(WeaponType.AXE);
        System.out.println("%s %s".formatted(blacksmith, weapon));
    }
}
