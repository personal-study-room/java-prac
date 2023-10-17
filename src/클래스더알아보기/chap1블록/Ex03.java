package 클래스더알아보기.chap1블록;

public class Ex03 {
    String str = "필드";

    {
        String str = "블록변수";
    }

    public static void main(String[] args) {
        String str = "메인메서드의 변수";
        {
//            String str = "메인메서드 안의 변수"; // ⚠️ 불가
        }

        while (true) {
//            String str = "메인메서드 안의 변수"; // ⚠️ 불가
        }
    }
}
