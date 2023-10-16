package 클래스.클래스05상속.ex01;

public class Main {
    public static void main(String[] args) {
        HongsChickenDT dtStore1 = new HongsChickenDT(1, "철원");

        dtStore1.takeHallOrder();

        dtStore1.takeDTOrder();
        dtStore1.setDriveThruOpen(false);
        dtStore1.takeDTOrder();

        HongsChickenDT.classMethod(); // 정적 메소드도 가지고 가는 구나? 가능하구만?
        dtStore1.takeHallOrder(); // 부모 메서드도 가지고 온다는 점!
    }
}
