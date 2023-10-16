package 클래스.클래스06다형성.ex03;

import 클래스.클래스05상속.ex03.FireSlime;
import 클래스.클래스05상속.ex03.Slime;
import 클래스.클래스06다형성.ex00.Button;
import 클래스.클래스06다형성.ex00.ShutDownButton;
import 클래스.클래스06다형성.ex01.HongsChicken;

public class Main {
    public static void main(String[] args) {
        Object obj1 = new Object();

        //  ⭐️ IDE의 안내대로 다른 패키지의 클래스 임포트
        //  💡 해당 클래스의 생성자가 public 이어야 함
        Object obj2 = new HongsChicken(3, "판교");
        Object obj3 = new ShutDownButton();
        Object obj4 = new FireSlime();

        //  원시 자료형들도 Object의 인스턴스로... - 이후 자세히 배울 것
        Object obj5 = true;
        Object obj6 = 1;
        Object obj7 = "Hello";


        //  ⭐️ 모든 자료형을 포함할 수 있는 배열
        Object[] objs = {
                1, false, 3.45, '가', "안녕하세요", new Button("Space")
        };

        for (Object obj : objs) {
            System.out.println(obj);
        }
    }
}
