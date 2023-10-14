package 원시vs참조;

public class Ex01 {
    public static void main(String[] args) {
        //  🧪 디버깅해서 결과를 볼 것
        //  ⭐ 원시 자료형은 값 자체를 복사 - 별개의 값이 됨

        boolean bool1 = true;
        boolean bool2 = false;
        bool2 = bool1;
        bool1 = false;

        int int1 = 1;
        int int2 = 2;
        int2 = int1;
        int2 = 3;

        char ch1 = 'A';
        char ch2 = 'B';
        ch2 = ch1;
        ch1 = '가';

        // 원시 자료형은 값의 복사 되었을 때, 그 값이 복사된 상태로 저장된다.
    }
}
