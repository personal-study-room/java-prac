package 게임예제;

public class Knight extends Swordman {

    private enum Weapon {SWORD, SPEAR}

    private Weapon weapon = Weapon.SWORD;

    public Knight(Side side) {
        super(side); // 진영, 체력80
        hp += 40;  // 기사는 검사에 비해 체력이 조금 더 높음
    }

    public void switchWeapon() {
        weapon = weapon == Weapon.SWORD ? Weapon.SPEAR : Weapon.SWORD;
    }

    private void spearAttack(Unit target) {
        target.hp -= 14;
    }

    @Override
    public void defaultAttack(Unit target) {
        if (weapon == Weapon.SWORD) {
            super.defaultAttack(target);
        } else {
            spearAttack(target);
        }
    }

    @Override
    public String toString() {
        return side.toString() + " 진영 기사";
    }
}
