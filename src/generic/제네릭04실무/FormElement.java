package generic.제네릭04실무;

import static generic.제네릭04실무.FormElement.MODE.LIGHT;

public abstract class FormElement {
    public enum MODE {LIGHT, DARK,}

    private static MODE mode = LIGHT;

    public void printMode() {
        System.out.println(mode);
    }

    abstract void func();

}
