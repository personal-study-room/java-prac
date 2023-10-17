package 게임예제;

public class MagicKnight extends Knight{

    public int mana = 60;
    public final int MANA_USAGE = 4;


    public MagicKnight(Side side) {
        super(side);
        // hp : 80 + 40 = 120
    }

    public void lighteningAttack(Unit[] targets) {
        for (Unit target : targets) {
            if(target instanceof MagicKnight) continue; // 마법 스킬에 면역
            if(mana < MANA_USAGE) break;
            System.out.printf("전기 공격 -> %s\n", target);
            target.hp -= 8;
            mana -= MANA_USAGE;
        }
    }

    @Override
    public String toString() {
        return side.toString() + " 진영 마법기사";
    }
}
