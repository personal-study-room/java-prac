package 클래스.클래스08추상클래스.ex01;

/*
* 추상클래스
* - 스스로 인스턴스 생성 불가
* - 이를 상속받는 클래스들의 공통 분모를 모아두기 위함.
* - 다형성 적용 가능
* */
public abstract class HongsGroup {
    protected static final String CREED = "우리의 %s 얇다";

    // 클래스 메소드는 abstract 불가
    // 왜? 자식에서 구현을 해야하는데, 굳이 abstract를 만들 이유가 없다.
    // abstract static String getCreed();
    // 사유 : Illegal combination of modifiers: 'abstract' and 'static'

    protected final int no;
    protected final String name;

    public HongsGroup(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public String intro () {
        return "%d호 %s점입니다.".formatted(no, name);
    }

    // 해당 abstract 메서드는 상속받은 자식클래스에서 무조건 구현!
    public abstract void takeOrder ();
}
