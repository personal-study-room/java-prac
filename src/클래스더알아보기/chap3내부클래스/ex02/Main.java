package 클래스더알아보기.chap3내부클래스.ex02;

public class Main {
    public static void main(String[] args) {
        HongsChicken.LaunchTF launchTF1 = new HongsChicken.LaunchTF("마산", "김영희");
        HongsChicken.LaunchTF launchTF2 = new HongsChicken.LaunchTF("영월", "이철수");

        HongsChicken store1 = launchTF1.launch();
        HongsChicken store2 = launchTF2.launch();

        HongsChicken.Gift [] gifts = {
                store1.getGift("홍길동"),
                store1.getGift("전우치"),
                store2.getGift("옥동자")
        };
    }
}
