package 클래스.클래스02기초활용예제.ex03;

public class ChickenMenu {
    String name;
    int price;
    String cook = "fry";

    public ChickenMenu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 생성자 메서드의 overloading
    public ChickenMenu(String name, int price, String cook) {
        this.name = name;
        this.price = price;
        this.cook = cook;
    }


}
