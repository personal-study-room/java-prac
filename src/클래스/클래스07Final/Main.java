package 클래스.클래스07Final;

public class Main {
    public static void main(String[] args) {
//        String ycCreed = HongsChicken.CREED;
//        HongsChicken.CREED = "우리의 튀김옷은 바삭하다"; // ⚠️ 불가
        // 왜? final 필드는 수정 불가

        final HongsChicken store1 = new HongsChicken(3, "판교");

        //  ⚠️ 불가
//        store1 = new HongsChicken(17, "강남");

        //  💡 요소 변경은 가능
        store1.name = "선릉";


    }
}
