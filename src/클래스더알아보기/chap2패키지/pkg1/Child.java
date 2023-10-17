package 클래스더알아보기.chap2패키지.pkg1;

public class Child extends Parent {
    //  Parent와 같은 패키지
    //  int aa = a; // ⚠️ 불가
    int bb = b;
    int cc = c; // 💡 protected - 같은 패키지, 상속관계
    int dd = d;
}
