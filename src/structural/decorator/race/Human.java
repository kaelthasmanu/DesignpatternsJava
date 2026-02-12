package structural.decorator.race;

import structural.decorator.IEnemy;

public class Human implements IEnemy {
    @Override
    public void attack() {
        System.out.println("The human strikes with a sword!");
    }
}
