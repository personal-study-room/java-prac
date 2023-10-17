package generic.제네릭03제한된자료형;

import 클래스.클래스09인터페이스.ex01.*;

public class Main {
    public static void main(String[] args) {
        var sum1 = add2Num(12, 34.56);
//        var sum2 = add2Num("1", true); //불가. 왜? Number를 상속받고 있어야 한다!

        descHuntingMamal(new PolarBear());
//        descHuntingMamal(new GlidingLizard()); // ⚠️ 불가
        // 사유 : reason: no instance(s) of type variable(s) exist so that GlidingLizard conforms to Mamal

        descFlyingHunter(new Eagle());
        descFlyingHunter(new GlidingLizard());
//        descFlyingHunter(new PolarBear()); // ⚠️ 불가
        // 사유 : reason: no instance(s) of type variable(s) exist so that PolarBear conforms to Flyer
    }



    // 제한된 제네릭
    //  💡 T는 Number를 상속한 클래스이어야 한다는 조건
    public static <T extends Number> double add2Num(T a, T b) {
        // Number에 있는 메서드를 사용할 수 있음!
        return a.doubleValue() + b.doubleValue();
    }
    //  ❓ 그냥 Number를 인자 자료형으로 하면 되지 않을까?



    // 상속받는 클래스와 구현하는 인터페이스들 모두 조건에 들어올 수 있음
    // 여기서는 implements를 사용하는게 아니고, 모두 extends를 쓰고 '&' 로 여러개를 쓸 수 있음.
    public static <T extends Mamal & Hunter & Swimmer> void descHuntingMamal(T animal) {
        // 조건에 해당하는 필드와 메서드 사용이 가능하다! 위에서 봤듯이~
        System.out.printf("겨울잠 %s%n", animal.hibernation ? "잡니다" : "안 잡니다");

        // <T extends ~ & Hunter & ~ > 로 되어 있으므로, Hunter 인터페이스의 메서드를 사용할 수 있음.
        animal.hunt();
        animal.swim();
    }

    public static <T extends Flyer & Hunter> void descFlyingHunter(T animal) {
        animal.fly(); // <T extends Flyer & ~ > 이므로 사용 가능
        animal.hunt(); // <T extends ~ & Hunter> 이므로 사용 가능
        // ❓❓그런데 아직 구현을 안했는데도?
        // ->> 애초에 모든 상속받은 클래스와 구현하는 인터페이스를 구현한 타입만 올 수 있다!!!!
    }
}
