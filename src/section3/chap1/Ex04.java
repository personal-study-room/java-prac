package section3.chap1;

public class Ex04 {
    public static void main(String[] args) {
        // 복합 대입 연산자

        int a = 100;
        System.out.println("a = " + a);
        a += 3;
        System.out.println("a = " + a);

        // overflow
        byte b = 127;
        System.out.println("b = " + b); // 127
        b += 1;
        System.out.println("b = " + b); // -128

        // underflow
        byte c = -128;
        System.out.println("c = " + c); // -128
        c -= 1;
        System.out.println("c = " + c); // 127


        // 단항 연산자
        int int1 = +1;
        System.out.println("int1 = " + int1);
        int1 = -1;
        System.out.println("int1 = " + int1);

        int1 = 100;
        int changeInt1 = ++int1;
        System.out.println("changeInt1 = " + changeInt1);

    }
}
