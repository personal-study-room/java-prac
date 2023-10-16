package 클래스.클래스08추상클래스.ex02;

public abstract class FormElement {

    protected int space;

    public FormElement(int space) {
        this.space = space;
    }

    abstract void func();
}
