package structural.decorator.decorator;

import structural.decorator.IEnemy;

public class WarriorEnemyDecorator extends EnemyDecorator{
    public WarriorEnemyDecorator(IEnemy decoratedEnemy) {
        super(decoratedEnemy);
    }

    @Override
    public void attack() {
        decoratedEnemy.attack();
        System.out.println("The warrior lets out a fierce battle cry!");
    }
}
