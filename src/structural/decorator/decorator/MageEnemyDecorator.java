package structural.decorator.decorator;

import structural.decorator.IEnemy;

public class MageEnemyDecorator extends EnemyDecorator{
    public MageEnemyDecorator(IEnemy decoratedEnemy) {
        super(decoratedEnemy);
    }

    @Override
    public void attack() {
        decoratedEnemy.attack();
        System.out.println("The mage casts a powerful spell!");
    }
}
