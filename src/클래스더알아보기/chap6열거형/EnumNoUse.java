package 클래스더알아보기.chap6열거형;

public class EnumNoUse {
    public static void main(String[] args) {
        //  문자열로 설정: 불안정함
        // 왜? -> 코드로 박아 넣었으니까
        {
            String mode = "LIGHT";
            mode = "DARK";

            mode = "lite"; // 실수를 간편히 방지할 방법이 없음
        }
        //  1: LIGHT, 2: DARK
        //  위 정보를 숙지해야 함 - 가독성 현저히 떨어짐
        {
            int mode = 1;
            mode = 2;

            //  타 변수에 사용되는 값들과 구분되지 않음
            //  잘못된 범위의 값 입력에 대응하기 번거로움
            int spaces = 3;

            mode = spaces; // 이러한 실수를 방지하기 어려움
        }
        /*
        우리는 왜 Enum class를 사용하는가?
        1. 위에서 처럼 정해진 값이 들어오는 자리에 매번 값을 literal로 입력해주면 실수가 발생할 수 있다.
        2. 번호를 매겨 우리가 관리할 수도 있지만, 이는 지속적으로 관리해야하고 잘못된 범위 값에 대해 대응하기 어렵다.
            if 번호가 변경된다면? 일일이 전부 코드를 수정...

        ※ 객체지향은 기본적으로 반복성, 재사용성, 가독성을 기준으로 클래스를 만들고 정의하는 것이 일반적⭐️

        -> 이렇게 정해진 값들을 관리하는 클래스 : enum class
        */
    }
}
