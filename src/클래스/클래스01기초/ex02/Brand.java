package 클래스.클래스01기초.ex02;


// 브랜드 코드
public class Brand {

    //  인스턴스가 가질 필드(field)들
    int no;
    String name;

    //기본 생성자가 default로 붙음

    //  인스턴스가 가질 메소드 - 💡 static을 붙이지 않음
    String intro() {
        return "안녕하세요, %s호 %s점 입니다.".formatted(no, name);
    }
}
