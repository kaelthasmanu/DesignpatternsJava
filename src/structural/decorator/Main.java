package structural.decorator;

import structural.decorator.decorator.MageEnemyDecorator;
import structural.decorator.decorator.WarriorEnemyDecorator;
import structural.decorator.race.Human;

public class Main {
    void main (){
        IEnemy humanWarrior = new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();
        IEnemy humanWarriorMage = new WarriorEnemyDecorator(new MageEnemyDecorator( new Human()));
        humanWarriorMage.attack();
    }
}
