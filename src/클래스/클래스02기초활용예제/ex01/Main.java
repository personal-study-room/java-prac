package 클래스.클래스02기초활용예제.ex01;

public class Main {
    public static void main(String[] args) {
        Slime slime1 = new Slime();
        Slime slime2 = new Slime();

        slime1.attack(slime2);
        /*
            - ⭐️ 객체는 **참조형** - 인자로 전달될 시 내용이 변경될 수 있음
            - 같은 클래스의 인스턴스지만, 필드의 값은 각기 별개임 주목
        */
    }
}
