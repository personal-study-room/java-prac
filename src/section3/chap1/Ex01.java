package section3.chap1;

import java.io.ByteArrayInputStream;

public class Ex01 {

    public static void main(String[] args) {
        // 1bit = 0 과 1을 표현 가능한 크기
        // 1 byte = 8 bit = 2^8
        System.out.println("byte");
        byte byteMaxValue = Byte.MAX_VALUE;
        byte byteMinValue = Byte.MIN_VALUE;
        String byteRange = String.format("byte :  %d ~ %d", byteMinValue, byteMaxValue);
        int exponent = Math.getExponent(byteMaxValue - byteMinValue + 1);
        System.out.println("exponent = " + exponent);
        System.out.println(byteRange);


        // 1 short = 2 byte = 16 bit = 2^16
        System.out.println("\nshort");
        short shortMaxValue = Short.MAX_VALUE;
        short shortMinValue = Short.MIN_VALUE;

        String shortRange = String.format("short : %d ~ %d", shortMinValue, shortMaxValue);
        int exponentShort = Math.getExponent(shortMaxValue - shortMinValue + 1);
        System.out.println("exponentShort = " + exponentShort);
        System.out.println(shortRange);

        // 1 int = 4 byte = 32 bit = 2^32
        System.out.println("\nint");
        int intMaxValue = Integer.MAX_VALUE;
        int intMinValue = Integer.MIN_VALUE;

        String intRange = String.format("int : %d ~ %d", intMinValue, intMaxValue);
        double v = (double) intMaxValue - (double) intMinValue + 1;
        int exponentInt = Math.getExponent(v);
        System.out.println("exponentInt = " + exponentInt);
        System.out.println(intRange);


        long maxValue = Long.MAX_VALUE;
        double maxValue1 = Double.MAX_VALUE;
        System.out.println("maxValue1 = " + maxValue1);
        System.out.println("maxValue = " + maxValue);

    }
}
