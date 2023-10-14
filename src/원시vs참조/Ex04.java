package 원시vs참조;

public class Ex04 {
    public static void main(String[] args) {
        //  상수 배열의 경우
        final int[] NUMBERS = {1, 2, 3, 4, 5};

        // -> NUMBERS = 배열 주소값 (변경 금지!)

        //  ⚠️ 다른 배열을 할당하는 것은 불가
//        NUMBERS = new int[] {2, 3, 4, 5, 6};

        // -> 변수에 담긴 주소값을 변경이 불가함!

        //  ⭐️ 배열의 요소를 바꾸는 것은 가능
        NUMBERS[0] = 11;
    }
}
