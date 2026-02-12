package structural.decorator.race;

import structural.decorator.IEnemy;

public class Elf implements IEnemy {
    @Override
    public void attack() {
        System.out.println("The elf shoots an arrow!");
    }
}
