package 클래스더알아보기.chap2패키지.pkg2;

//  상단에 임포트 필요
import 클래스더알아보기.chap2패키지.pkg1.Parent;

public class Child extends Parent {
    //  Parent와 다른 패키지
    //  int aa = a; // ⚠️ 불가
    //  int bb = b; // ⚠️ 불가. 왜? default는 동일 패키지에서만 가능하므로
    int cc = c; // 💡 protected - 다른 패키지, 상속관계
    int dd = d;
}
