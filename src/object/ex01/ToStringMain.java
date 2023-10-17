package object.ex01;



public class ToStringMain {
    public static void main(String[] args) {
        //    public String toString() {
        //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //    }
        // 1.  기본적으로는 클래스명과 해시값을 반환

        Button button1 = new Button("엔터", Button.Mode.DARK, 3);

        //  💡 메소드를 ctrl/command + 클릭하여 Object 클래스 사양 살펴보기
        System.out.println(button1); // ⭐️ toString() 을 붙인 것과 같음
        // toString 재정의 전,
        // 결과 : object.제네릭01메소드.Button@279f2327

        // toString 재정의 후,
        // 결과 : 다크 엔터버튼 (3칸 차지)
    }
}
