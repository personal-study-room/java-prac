package 클래스.클래스06다형성.ex01;

public class HongsChickenDT extends HongsChicken {
    // 부모의 필드도 가지고 있음
    private boolean driveThruOpen = true;

    public HongsChickenDT(int no, String name) {
        super(no, name);
    }
    // 부모의 메서드도 가지고 있음.
    public void setDriveThruOpen(boolean driveThruOpen) {
        this.driveThruOpen = driveThruOpen;
    }

    public void takeDTOrder() {
        System.out.printf(
                "%d호 %s점 드라이브스루 주문 %s%n",
                no, name,
                (driveThruOpen ? "받음" : "불가")
        );
    }
}
