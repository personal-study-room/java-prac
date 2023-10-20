package 컬렉션프레임워크.comparable_comparator.ex01;

import 게임예제.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // comparable & comparator 둘 다 인터페이스
        // comparable는 보통 대부분의 숫자 문자에서 구현되어 있음.
        // 객체처럼 순서를 잡아줄 수 없는 것들은? -> comparator 사용

        Integer int1 = Integer.valueOf(1);
        Integer int2 = Integer.valueOf(2);
        Integer int3 = Integer.valueOf(3);

        //  대상보다 작을 때: 음수, 같거나 클 때: 양수
        int _1_comp_3 = int1.compareTo(3);
        int _2_comp_1 = int2.compareTo(1);
        int _3_comp_3 = int2.compareTo(1);
        int _t_comp_f = Boolean.valueOf(true).compareTo(Boolean.valueOf(false));
        int _abc_comp_def = "ABC".compareTo("DEF");
        int _def_comp_abc = "efgh".compareTo("abcd");


        Integer[] nums = {3, 8, 1, 7, 4, 9, 2, 6, 5};
        String[] strs = {
                "fox", "banana", "elephant", "car", "apple", "game", "dice"
        };

        //  ⭐️ Arrays 클래스의 sort 메소드
        //  - 기본적으로 compareTo에 의거하여 정렬
        //  - 인자가 없는 생성자로 생성된 TreeSet, TreeMap도 마찬가지
        Arrays.sort(nums);
        Arrays.sort(strs);


        // 익명클래스 or lambda식
        Arrays.sort(nums, new IntDescComp());

        Arrays.sort(nums, new CloseToInt(5));

        Arrays.sort(strs, (o1, o2) -> o1.length() - o2.length());

        ArrayList<Integer> numsAry = new ArrayList<>(List.of(nums));
        numsAry.sort((o1, o2) -> o2 - o1);


        TreeSet<Unit> unitTSet = new TreeSet<>(new UnitSorter());
        for (var u : new Unit[] {
                new Knight(Side.BLUE),
                new Knight(Side.BLUE), // 중복
                new Swordman(Side.RED),
                new Swordman(Side.RED), // 중복
                new MagicKnight(Side.BLUE),
                new Swordman(Side.BLUE),
                new MagicKnight(Side.RED),
                new Knight(Side.RED)
        }) {
            unitTSet.add(u);
        } //  💡 구분되는 기준이 없는 인스턴스는 같은 것으로 인식되어 삽입 안 됨 (셋이므로)

    }
}
