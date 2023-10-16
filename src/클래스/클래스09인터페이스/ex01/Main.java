package 클래스.클래스09인터페이스.ex01;

public class Main {
    public static void main(String[] args) {
        // 다형성 적용 가능
        PolarBear polarBear = new PolarBear();
        Mamal mamal = polarBear;
        Swimmer swimmer = polarBear;

        GlidingLizard glidingLizard = new GlidingLizard();
        Eagle eagle = new Eagle();

        Hunter[] hunters = {
                polarBear, glidingLizard, eagle
        };

        // interface 역시 다형성에 의해 자료형으로 작용 가능
        for (Hunter hunter : hunters) {
            hunter.hunt();
        }
    }
}
