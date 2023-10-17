package 클래스더알아보기.chap4익명클래스.ex01;

import 클래스.클래스08추상클래스.ex01.*;

public class Main {
    public static void main(String[] args) {
        HongsChicken store1 = new HongsChicken("울산");
        HongsCafe store2 = new HongsCafe("창원", true);

        HongsGroup store3 = new HongsGroup(1, "포항") {
            @Override
            public void takeOrder() {
                System.out.printf(
                        "%s 떡볶이를 주문해 주세요\n",
                        super.intro()
                );
            }

            public void makeRice() {
                System.out.println("쌀로 떡 만들기");
            }
        };

        String store3Intro = store3.intro();
        store3.takeOrder();
        // store3.makeRice(); // 사용 불가

        System.out.println("\n- - - - -\n");

        for (var store : new HongsGroup[] {store1, store2, store3}) {
            store.takeOrder();
        }
    }
}
