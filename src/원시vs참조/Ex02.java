package 원시vs참조;

public class Ex02 {
    public static void main(String[] args) {
        //  ⭐ 참조 자료형은 값 주머니의 주소를 복사
        //  두 변수가 같은 주머니를 가리키게 됨

        boolean[] boolAry1 = { true, true, true };
        boolean[] boolAry2 = { false, false, false };
        boolAry2 = boolAry1; // 🔴
        boolAry1[0] = false;

        int[] intAry1 = { 1, 2, 3 };
        int[] intAry2 = { 4, 5 };
        intAry2 = intAry1;
        intAry2[1] = 100;

        char[] chAry1 = { 'A', 'B', 'C' };
        char[] chAry2 = { 'a', 'b', 'c', 'd', 'e' };
        chAry2 = chAry1;
        chAry1[2] = '다';

        // 참조 자료형의 경우는 주소값을 대입하기 때문에 주소값 안의 내용을 바꿔주면 2개 모두 변경된다.
    }
}
