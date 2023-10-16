package 클래스.클래스09인터페이스.ex02DefaultMethod;

public interface FoodSafety {
    // static 제거해볼 것
    // static abstract는 역시 불가(추상 클래스도 동일)
    // static method도 결국 구현을 해놔야 한다.
    static void announcement() {
        System.out.println("식품안전 관련 공지");
    }

    // default method
    // 해당 인터페이스를 구현한 클래스의 인스턴스가 사용할 수 있는 메서드
    default void regularInspection() {
        System.out.println("정기 체크");
    }
    // ---- ↑ 기존의 인터페이스에 새로운 기능을 추가할 때!

    void cleanKitchen();
    void employeeEducation();
}
