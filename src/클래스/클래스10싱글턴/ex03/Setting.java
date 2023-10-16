package 클래스.클래스10싱글턴.ex03;

public class Setting {
    // singleton 으로 만들기
    // step 1. 자기 자신을 필드로 가진다.
    private static Setting setting;

    // step 2. 생성자는 private으로 만든다.

    private Setting() {
    }

    // step 3. 공유하는 Setting instance를 만들고 반환 하는 정적메서드를 만든다
    public static Setting getInstance() {
        if (setting == null) {
            setting = new Setting();
        }
        return setting;
    }

    private int volume = 5;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void incVolume() {
        volume++;
    }

    public void decVolume() {
        volume--;
    }
}
