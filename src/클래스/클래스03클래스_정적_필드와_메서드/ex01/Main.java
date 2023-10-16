package 클래스.클래스03클래스_정적_필드와_메서드.ex01;

public class Main {
    public static void main(String[] args) {
        String classBrand = HongsChicken.brand;
        String classContact = HongsChicken.contact();

        // 인스턴스 메소드는 불가
//        String someName = Brand.name;
//        String instanceMethod = Brand.intro();

        HongsChicken store1 = new HongsChicken(3, "판교");
        String store1Intro = store1.intro();

        // 인스턴스에서는 클래스의 필드와 메소드 사용 가능
        // 편의상 기능일 뿐, 권장하지 않음(혼란 초래. IDE에서 자동완성 안된다는 점 확인)
        String noRecommend1 = store1.brand;
        String noRecommend2 = store1.contact();
    }
}
