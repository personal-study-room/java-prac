package 클래스.클래스01기초.ex03_생성자;

public class Main {
    public static void main(String[] args) {

        // 클래스로 인스턴스 생성 - new 연산자 + 생성자 호출
        // 본사의 방침대로 매장을 내는 것
        Brand store1 = new Brand(1, "판교");
        Brand store2 = new Brand(2, "수원");
        Brand store3 = new Brand(3, "제주");


        String[] intros = {store1.intro(), store2.intro(), store3.intro()};

    }
}
