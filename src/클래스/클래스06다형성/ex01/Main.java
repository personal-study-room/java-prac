package 클래스.클래스06다형성.ex01;

public class Main {
    public static void main(String[] args) {
        HongsChicken[] hsChicken = {
                new HongsChicken(3, "판교"),
                new HongsChicken(3, "강남"),
                new HongsChickenDT(100, "수원")
        };

        for (HongsChicken store : hsChicken) {
            if (store instanceof HongsChickenDT) {
                // 자식 클래스의 기능을 사용하려면 명시적으로 타입을 맞춰주어야 한다. (downcasting)
                ((HongsChickenDT) store).takeDTOrder();
            }else {
                store.takeHallOrder();
            }
        }
    }
}
