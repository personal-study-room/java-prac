package 게임예제;

public abstract class Unit {
    // 앞으로 생성될 유닛에 대한 공통 코드를 모아놓은 추상 클래스

    // 이후 실습의 편의를 위해 일부 필드를 public으로 진행
    // - 실무에서는 private로 만들고 Getter/setter 권장
    public Side side;
    public int hp;

    public Unit(Side side, int hp) {
        this.side = side;
        this.hp = hp;
    }

    public Side getSide() {
        return side;
    }
}
