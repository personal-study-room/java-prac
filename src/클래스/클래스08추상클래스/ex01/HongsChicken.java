package 클래스.클래스08추상클래스.ex01;

public class HongsChicken extends HongsGroup{

    protected static int LAST_NO = 0;
    public HongsChicken(String name) {
        super(++LAST_NO, name);
    }

    public static String getCreed() {
        return CREED.formatted("튀김옷은");
    }

    // 반드시 구현!!! 왜? abstract method 이니까
    @Override
    public void takeOrder() {
        System.out.printf("hongsChicken %s 치킨을 주문해주세요.\n", super.intro());
    }
}
