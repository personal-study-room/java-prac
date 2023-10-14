package section3.chap2;

public class Ex01 {

    public static void main(String[] args) {

        // 부동 소수점
        double a = 0.1, b = 0.2;
        double result = a + b;
        System.out.println("result = " + result); // result = 0.30000000000000004


        //  float의 최대값과 최소값
        float fMin = -Float.MAX_VALUE;
        float fMax = Float.MAX_VALUE;

        //  double의 최대값과 최소값
        double dMin = -Double.MAX_VALUE;
        double dMax = Double.MAX_VALUE;

        //  최소 절대값
        float fAbsMin = Float.MIN_VALUE;
        double dAbsMin = Double.MIN_VALUE;

        // ⭐ double이 범위도 넓고, 정밀도도 높음 확인
        boolean bool1 = Float.MAX_VALUE < Double.MAX_VALUE;
        boolean bool2 = Float.MIN_VALUE > Double.MIN_VALUE;
    }
}
