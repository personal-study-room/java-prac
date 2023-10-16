package 클래스.클래스10싱글턴.ex02;

public class Tab {
    private Setting setting = null;

    public Tab() {
    }

    public Tab(Setting setting) {
        this.setting = setting;
    }

    public Setting getSetting() {
        return setting;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }
}
