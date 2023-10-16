package 클래스.클래스10싱글턴.ex03;

public class Main {
    public static void main(String[] args) {
        Tab tab1 = new Tab();
        Tab tab2 = new Tab();
        Tab tab3 = new Tab();

        extracted(tab1, tab2, tab3);

        System.out.println("\n- - - - -\n");

        tab1.getSetting().incVolume();
        tab1.getSetting().incVolume();

        extracted(tab1, tab2, tab3);

        //  🎉 외부에서 각 사용처들을 신경쓸 필요 없음
    }

    private static void extracted(Tab... tabs) {
        for (Tab tab : tabs) {
            System.out.println(tab.getSetting().getVolume());
        }
    }
}
