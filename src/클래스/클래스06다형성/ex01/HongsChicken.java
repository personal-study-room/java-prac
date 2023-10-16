package 클래스.클래스06다형성.ex01;

public class HongsChicken {
    // 해당 접근 제어자를 만약에 Private으로 바꾼다면? -> 자식에서도 사용은 못함.
    // 그러나 가지고는 있어!
    protected int no;
    protected String name;

    public HongsChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public static void classMethod() {
        System.out.println("HongsChicken method");
    }

    public void takeHallOrder() {
        System.out.printf("%d호 %s점 홀 주문 받음%n", no, name);
    }
}
