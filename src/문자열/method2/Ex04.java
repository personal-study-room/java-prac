package 문자열.method2;

public class Ex04 {
    public static void main(String[] args) {

        String emptyStr = "";
        String nullStr = null;

        boolean boo1 = emptyStr == nullStr;

        //  💡 문자열을 외부로부터 받아올 경우 등...
        String defaultStr =
                (nullStr != null && !nullStr.isEmpty())
                        ? nullStr : "(기본값)";

        //  💡 초기화되지 않은 변수와 비교
        String notInitStr;
        String nullStr2 = null;

        //  ⚠️ 컴파일 오류 발생
//        System.out.println(notInitStr);

        //  코드에 따라 정상실행 또는 런타임 오류
        System.out.println(nullStr2);

        //  ⭐️ 이 외에도 참조 자료형의 인스턴스는 null 가능
        Object obj = null;
        System sys = null;

        //  ⭐️ 원시값들도 참조 자료형의 인스턴스로는 null 가능
        // Wrapper class 는 null을 담을 수 있다.
        Integer nullInt1 = null;
        Double nullDbl1 = null;
        Boolean nullBool1 = null;
        Character nullChr1 = null;

        //  ⚠️  원시값은 불가
        //int nullInt2 = null;
        //double nullDbl2 = null;
        //boolean nullBool2 = null;
        //char nullChr2 = null;
    }
}
