package 클래스.클래스04접근제어자.ex01;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        String pb = phone.powerButton; // default는 같은 패키지 내부에서
        String sd = phone.sdCardSlot; // public 은 어디에서나
//        String cpu = phone.cpu; // private은 해당 클래스 내부에서만 사용가능
    }
}
