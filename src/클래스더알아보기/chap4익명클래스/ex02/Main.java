package 클래스더알아보기.chap4익명클래스.ex02;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button("Enter");
        Button button2 = new Button("CapsLock");
        Button button3 = new Button("ShutDown");

        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("줄바꿈");
                System.out.println("커서를 다음 줄에 위치");
            }
        });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("기본입력 대소문자 전환");
            }
        });

        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("작업 자동 저장");
                System.out.println("프로그램 종료");
            }
        });

        for (var button : new Button[] {button1, button2, button3}) {
            button.func();
        }

        // 보통 익명 클래스를 만들기 위해서는 우선적으로
        // 1. 구현이 되어야할 인터페이스를 필드로 가지는 클래스가 존재해야한다.
        // 2. 내부에서 이를 세팅하는 메서드가 별도로 존재
        // 3. 구현체를 클래스를 따로 만들어서 관리하는 것이 아니라, 그때그때 만들어서 관리.
    }
}
