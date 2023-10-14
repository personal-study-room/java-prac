package 원시vs참조;

public class Ex03 {
    public static void main(String[] args) {
        //  ⭐️ 문자열은 객체(참조형)지만 원시형처럼 다뤄짐
        String str1 = "코인 함";
        String str2 = "관심 없음";
        str2 = str1; // 🔴

        str1 = "고점에 익절";

        // String 은 참조형이지만, primitive type 처럼 사용할 수 있도록 구성되어 있다.
    }
}
