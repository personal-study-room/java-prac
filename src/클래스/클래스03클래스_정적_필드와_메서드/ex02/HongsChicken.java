package 클래스.클래스03클래스_정적_필드와_메서드.ex02;

public class HongsChicken {

    static String brand = "홍스치킨";
    static int lastNo = 0; // **

    static String contact() {
        return "%s입니다. 무엇을 도와드릴까요?".formatted(brand);
    }

    int no;
    String name;

    public HongsChicken(String name) {
        this.no = ++lastNo;
        this.name = name;
    }

    String intro() {
        return "안녕하세요, %s %d호 %s호점입니다."
                .formatted(brand, no, name);
    }
}
