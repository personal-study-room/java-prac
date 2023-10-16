package 클래스.클래스10싱글턴.ex03;

public class Tab {
    private Setting setting = Setting.getInstance();

    public Setting getSetting() {
        return setting;
    }
}
