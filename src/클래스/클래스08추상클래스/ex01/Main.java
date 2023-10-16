package 클래스.클래스08추상클래스.ex01;

public class Main {
    public static void main(String[] args) {
        //  ⚠️ 불가
//        HongsGroup yalcoGroup = new HongsGroup(1, "서울");

        HongsChicken hscStore1 = new HongsChicken("판교");
        HongsChicken hscStore2 = new HongsChicken("강남");

        HongsCafe hsfStore1 = new HongsCafe("울릉", true);
        HongsCafe hsfStore2 = new HongsCafe("강릉", false);

        HongsGroup[] ycStores = {
                hscStore1, hscStore2,
                hsfStore1, hsfStore2
        };

        for (HongsGroup hsStore : ycStores) {
            hsStore.takeOrder();
        }

        System.out.println("\n- - - - -\n");

        System.out.println(HongsChicken.getCreed());
        System.out.println(HongsCafe.getCreed());
    }
}
