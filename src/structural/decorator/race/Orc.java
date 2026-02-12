package structural.decorator.race;

import structural.decorator.IEnemy;

public class Orc implements IEnemy {
    @Override
    public void attack() {
        System.out.println("The orc swings his axe!");
    }
}
