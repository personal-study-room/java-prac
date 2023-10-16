package 클래스.클래스02기초활용예제.ex02;

public class Main {

    public static void main(String[] args) {
        int[] ary1 = {3, 5, 9, 2, 8, 1, 4};
        int[] ary2 = {382, 194, 27, 915, 138};

        IntArrayInfo aryInf1 = new IntArrayInfo(ary1);
        IntArrayInfo aryInf2 = new IntArrayInfo(ary2);

        int ary1Max = aryInf1.max;
        double ary2Avg = aryInf2.average;
        int ary1n2Sum = aryInf1.sum + aryInf2.sum;

        /*
        - 배열을 생성자 인자로 받아, 그것의 정보를 필드들로 저장
        - 복잡한 과정을 거치는 생성자의 예시
        */
    }
}
