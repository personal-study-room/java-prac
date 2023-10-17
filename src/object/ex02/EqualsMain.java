package object.ex02;

public class EqualsMain {
    public static void main(String[] args) {
        // equals
//        public boolean equals(Object obj) {
//            return (this == obj);
//        }
        //1.  equals 도 재정의 전에는 단순 == 비교와 동일하다.
        //2.  인스턴스 내용을 비교하려면 클래스마다 오버라이드해야 함.

        Click click1 = new Click(123, 456, 5323487);
        Click click2 = new Click(123, 456, 5323487);
        Click click3 = new Click(123, 456, 2693702);
        Click click4 = new Click(234, 567, 93827345);

        boolean bool1 = click1 == click1; // equals 재정의 전: true, 후: true
        boolean bool2 = click1 == click2; // equals 재정의 전: false, 후: false
        boolean bool3 = click1 == click3; // equals 재정의 전: false, 후: false
        boolean bool4 = click1 == click4; // equals 재정의 전: false, 후: false

        boolean boolA = click1.equals(click1); // equals 재정의 전: true, 후: true
        boolean boolB = click1.equals(click2); // equals 재정의 전: false, 후: true
        boolean boolC = click1.equals(click3); // equals 재정의 전: false, 후: true
        boolean boolD = click1.equals(click4); // equals 재정의 전: false, 후: false
    }
}
