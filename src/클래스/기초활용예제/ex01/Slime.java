package 클래스.기초활용예제.ex01;

public class Slime {
    // 클래스 속성
    double hp = 50;
    int attack = 8;
    double defense = 0.2;

    // 인스턴스에서 사용될 메서드
    void attack(Slime enemy) { // 다른 슬라임 인스턴스를 인자로 받음
        enemy.hp -= attack * (1 - enemy.defense);
    }
}
