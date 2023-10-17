package 클래스더알아보기.chap7레코드.ex01;

public class Main {
    public static void main(String[] args) {
        ChildRecord child1 = new ChildRecord("홍승현", 1994, Gender.MALE);

        String childStr = child1.toString();

        ChildRecord[] children = {
                new ChildRecord("홍승현", 1994, Gender.MALE),
                new ChildRecord("홍순영", 1990, Gender.FEMALE),
                new ChildRecord("홍광우", 1999, Gender.MALE)
        };

        for (ChildRecord child : children) {
            System.out.printf(
                    "%s %d년생 %s 어린이\n",
                    child.gender().getEmoji(),
                    child.birthYear(),
                    child.name()
            );
        }
    }
}
