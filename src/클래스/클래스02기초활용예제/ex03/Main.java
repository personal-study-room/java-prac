package 클래스.클래스02기초활용예제.ex03;

public class Main {
    public static void main(String[] args) {
        ChickenMenu[] menus = {
                new ChickenMenu("후라이드", 10000),
                new ChickenMenu("양념치킨", 12000),
                new ChickenMenu("화덕구이", 15000, "bake"),
        };

        ChickenStore store1 = new ChickenStore(1, "판교", menus);

        ChickenMenu order1 = store1.orderMenu("양념치킨");
        ChickenMenu order2 = store1.orderMenu("오븐치킨");

        // 1. 원시 자료형은 각자가 다른 값을 가지게 된다
        // 2. 참조 자료형은 메모리에 올라온 객체를 바라보게 만든다.
        // menus 배열과 ChickenStore의 인스턴스인 store1의 menus와 동일한 값을 가리킨다.
        // 그리고 order1과 menus의 1번째는 동일한 인스턴스 이다.

        int int1 = 1;
        int int2 = int1;
        int1 = 2;

        ChickenMenu menu1 = new ChickenMenu("불닭", 10000);
        ChickenMenu menu2 = menu1;
        menu1.price = 1200;
        // menu2의 가격은? 둘다 1200원으로 바뀌었다.

        int avgChickenPrice = 12000;
        ChickenMenu chickenMenu1 = new ChickenMenu("양념치킨", 12000);

        raisePrice(avgChickenPrice, chickenMenu1, 1000);
    }

    public static void raisePrice (int avg, ChickenMenu menu, int amount) {
        avg += amount;
        menu.price += amount;
    }
}
