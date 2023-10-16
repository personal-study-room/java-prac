package 클래스.클래스05상속.ex03;

public class Slime {
    protected double hp = 50;
    protected int attack = 8;
    protected double defence = 0.2;

    public void attack(Slime enemy) {
        enemy.hp -= this.attack * (1 - enemy.defence);
    }
}
