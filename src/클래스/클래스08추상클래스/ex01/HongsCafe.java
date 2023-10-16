package 클래스.클래스08추상클래스.ex01;

public class HongsCafe extends HongsGroup{
    public static String getCreed () {
        return CREED.formatted("원두향은");
    }
    protected static int lastNo = 0;

    private boolean isTakeout;

    public HongsCafe(String name, boolean isTakeout) {
        super(++lastNo, name);
        this.isTakeout = isTakeout;
    }

    //  💡 반드시 구현 - 제거해 볼 것
    @Override
    public void takeOrder () {
        System.out.printf("얄코카페 %s 음료를 주문해주세요.%n", super.intro());
        if (!isTakeout) System.out.println("매장에서 드시겠어요?");
    }
}
