package structural.decorator.decorator;

import structural.decorator.IEnemy;

public class EnemyDecorator implements IEnemy {
    protected IEnemy decoratedEnemy;

    public EnemyDecorator(IEnemy decoratedEnemy) {
        this.decoratedEnemy = decoratedEnemy;
    }

    @Override
    public void attack() {
        decoratedEnemy.attack();
    }
}
