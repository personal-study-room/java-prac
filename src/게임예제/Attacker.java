package 게임예제;

public interface Attacker {
    // 모든 유닛이 공격 능력을 가지고 있지는 않다.
    // 즉, 특정 유닛에 공격기능을 '장착'하기 위해 인터페이스를 구현하였다.
    void defaultAttack(Unit target);
}
