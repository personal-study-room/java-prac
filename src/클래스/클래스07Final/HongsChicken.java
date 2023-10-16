package 클래스.클래스07Final;

public class HongsChicken {
    protected static final String CREED = "우리의 튀김옷은 얇다";

    private final int no;
    public String name;

    // final 필드는 생성자에서 초기화를 해주어야한다.
    public HongsChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void changeFinalField() {
        // final은 초기화 동시에 변경 불가
//        this.no++;
    }

    public final void fryChicken() {
        System.out.println("염지, 반죽힙히기, 튀김");
    }
}
