package generic.제네릭02클래스;

public class Pocket<T1, T2, T3> {

    private T1 fieldA;
    private T2 fieldB;
    private T3 fieldC;

    public Pocket(T1 fieldA, T2 fieldB, T3 fieldC) {
        this.fieldA = fieldA;
        this.fieldB = fieldB;
        this.fieldC = fieldC;
    }

    public T1 getFieldA() {
        return fieldA;
    }

    public void setFieldA(T1 fieldA) {
        this.fieldA = fieldA;
    }

    public T2 getFieldB() {
        return fieldB;
    }

    public void setFieldB(T2 fieldB) {
        this.fieldB = fieldB;
    }

    public T3 getFieldC() {
        return fieldC;
    }

    public void setFieldC(T3 fieldC) {
        this.fieldC = fieldC;
    }
}
