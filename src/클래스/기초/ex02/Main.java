package 클래스.기초.ex02;

public class Main {
    public static void main(String[] args) {
        Brand store1 = new Brand();
        store1.name = "판교";
        store1.no = 1;


        Brand store2 = new Brand();
        store2.no = 2;
        store2.name = "수원";

        int store1No = store1.no;
        String store2Name = store2.name;

        String store1Intro = store1.intro();
        String store2Intro = store2.intro();

    }
}
