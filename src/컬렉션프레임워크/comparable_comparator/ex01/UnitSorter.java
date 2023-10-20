package 컬렉션프레임워크.comparable_comparator.ex01;

import 게임예제.*;

import java.util.Comparator;

public class UnitSorter implements Comparator<Unit> {
    @Override
    public int compare(Unit o1, Unit o2) {
        var result = getClassPoint(o2) - getClassPoint(o1);

        // 제거하고 실행해 볼 것 - 내용이 같은 인스턴스들이 있을시
        // set 자료형에서는 결과가 0 이 나온 친구들을 없앤다.
        if (result == 0) {
            result = o1.hashCode() - o2.hashCode();
        }

        return result;
    }

    private int getClassPoint(Unit u) {
        int result = u.getSide() == Side.RED ? 10 : 0;

        if(u instanceof Swordman) result += 1;
        if (u instanceof Knight) result += 2;
        if(u instanceof MagicKnight) result += 3;

        return result;
    }


}
