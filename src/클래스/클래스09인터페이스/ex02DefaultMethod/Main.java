package 클래스.클래스09인터페이스.ex02DefaultMethod;

public class Main {
    public static void main(String[] args) {
        // static method
        FoodSafety.announcement();

        HongsChicken store1 = new HongsChicken();

        // default method
        store1.regularInspection();

        // abstract method
//        store1.announcement();
        store1.cleanKitchen();
        store1.employeeEducation();
    }
}
