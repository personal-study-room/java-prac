package 클래스.클래스04접근제어자.ex03;

// getter & setter - command + N
public class Product {
    private static double DISCOUNT = 0.2;
    private static double INCREASE_LIMIT = 1.2;

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // getter & setter 는 클래스들의 일관성을 유지하기 좋음
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank()) return;
        this.name = name;
    }

    public int getPrice() {
        return (int) (price * (1 - DISCOUNT));
    }

    public void setPrice(int price) {
        // this 사용 주의
        int max = (int) (this.price * INCREASE_LIMIT);
        this.price = price < max ? price : max;
    }
}
