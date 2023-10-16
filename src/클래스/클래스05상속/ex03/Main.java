package 클래스.클래스05상속.ex03;

public class Main {
    public static void main(String[] args) {
        Slime slime = new Slime();
        FireSlime fireSlime = new FireSlime();

        slime.attack(fireSlime); // 다형성 적용
        fireSlime.attack(slime);
    }
}