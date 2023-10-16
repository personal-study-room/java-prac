package 클래스.클래스07Final;

public final class HongsChickenDT extends HongsChicken {

    public HongsChickenDT(int no, String name) {
        super(no, name);
    }

    // final이 안 붙은 메서드는 overriding 가능
    @Override
    public void changeFinalField() {
        super.changeFinalField();
    }

//    overridden method is final
//    @Override
//    public final void fryChicken() {
//        System.out.println("overridden method is final");
//    }
}
