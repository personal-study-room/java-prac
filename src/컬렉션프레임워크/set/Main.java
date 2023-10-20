package 컬렉션프레임워크.set;

import 게임예제.Side;
import 게임예제.Swordman;

import java.util.*;

public class Main {
    /*
    Set
        정의
            중복되지 않는 요소의 집합

        주요 클래스
         - HashSet
            장점 : 성능이 빠르고 메모리 적게 사용
            단점 : 순서 관련 기능 없음
         - LinkedHashSet
            장점 : 요소들을 입력 순서대로 정렬
            단점 : HashSet보다는 성능 떨어짐
         - TreeSet
            장점 : 요소들을 특정 기준대로 정렬(오름 / 내림)
            단점 : 데이터 추가/삭제에 시간이 더 소모
    */

    public static void main(String[] args) {
        Set<Integer> intHSet1 = new HashSet<>();
        intHSet1.add(1);
        intHSet1.add(1);
        intHSet1.add(2);
        intHSet1.add(3);

        List<Integer> ints1 = new ArrayList<>(List.of(1, 1, 2, 2, 3, 3, 4, 5, 6, 7));

        Set<Integer> intHSet2 = new HashSet<>(ints1);


        //  💡 for-each문 사용 가능
        for (var i : intHSet1) {
            System.out.println(i);
        }

        // ArrayList를 중복을 제거하는 방법
        ints1.clear();
        ints1.addAll(intHSet2);

        //  포함 여부
        boolean has2 = intHSet1.contains(2);
        boolean has4 = intHSet1.contains(4);

        //  요소 삭제, 있었는지 여부 반환
        boolean rm3 = intHSet1.remove(3);
        boolean rm4 = intHSet1.remove(4);

        //  다른 콜렉션 기준으로 내용 삭제
        intHSet2.removeAll(intHSet1);

        //  💡 그 외 size, isEmpty, clear, clone 등의 메소드들 확인
        intHSet1.size();
        intHSet1.isEmpty();
        intHSet1.clear();

        Set<Swordman> swordmenSet = new HashSet<>();
        Swordman swordman = new Swordman(Side.RED);

        swordmenSet.add(swordman);
        swordmenSet.add(swordman);
        swordmenSet.add(new Swordman(Side.RED));
        swordmenSet.add(new Swordman(Side.RED));

        swordmenSet.remove(swordman); // 실행해보기
    }
}
