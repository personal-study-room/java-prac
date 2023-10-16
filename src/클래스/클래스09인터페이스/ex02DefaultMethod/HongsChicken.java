package 클래스.클래스09인터페이스.ex02DefaultMethod;

public class HongsChicken implements FoodSafety{
    @Override
    public void cleanKitchen() {
        System.out.println("매일 주방 청소");
    }

    @Override
    public void employeeEducation() {
        System.out.println("직원 위생 교육");
    }
}
