package 클래스.기초.ex03_생성자;


// 브랜드 코드
public class Brand {

    //  인스턴스가 가질 필드(field)들
    int no;
    String name;

    // 생성자 : 인스턴스를 만드는 메소드
    // this : 생성될 인스턴스를 가리킴
    public Brand(int no, String name) {
        this.no = no;
        this.name = name;
    }

    //  인스턴스가 가질 메소드 - 💡 static 붙이지 않음
    String intro() {
        return "안녕하세요, %s호 %s점 입니다.".formatted(no, name);
    }
}
