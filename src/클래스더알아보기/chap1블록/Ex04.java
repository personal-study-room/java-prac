package 클래스더알아보기.chap1블록;

public class Ex04 {

    public static void main(String[] args) {
        new Ex04().printKings();
    }

    // field
    String king = "사자";

    void printKings () {
        //method 내부 변수
        String king = "여우"; // 💡 그럼 이건 뭔가요??

        //  ⭐️ 인스턴스의 필드는 다른 영역으로 간주
        System.out.printf(
                "인스턴스의 왕은 %s, 블록의 왕은 %s%n",
                this.king, king
        );
    }
}
