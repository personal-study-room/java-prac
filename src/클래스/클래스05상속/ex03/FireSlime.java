package 클래스.클래스05상속.ex03;

public class FireSlime extends Slime {
    private int fireAttack = 4;

    @Override
    public void attack(Slime enemy) {
        enemy.hp -= (attack + fireAttack) * (1 - enemy.defence);
    }
}
