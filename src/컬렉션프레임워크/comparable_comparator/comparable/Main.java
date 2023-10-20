package 컬렉션프레임워크.comparable_comparator.comparable;

import java.util.TreeSet;

import static 컬렉션프레임워크.comparable_comparator.comparable.PersonComp.*;
import static 컬렉션프레임워크.comparable_comparator.comparable.PersonComp.SortBy.*;
import static 컬렉션프레임워크.comparable_comparator.comparable.PersonComp.SortDir.*;

public class Main {
    public static void main(String[] args) {
        TreeSet[] treeSets = {
                new TreeSet<>(),
                new TreeSet<>(new PersonComp(NO, DESC)),
                new TreeSet<>(new PersonComp(AGE, ASC)),
                new TreeSet<>(new PersonComp(HEIGHT, DESC))
        };

        for (var p : new Person[] {
                new Person("홍길동", 20, 174.5),
                new Person("전우치", 28, 170.2),
                new Person("임꺽정", 24, 183.7),
                new Person("황대장", 32, 168.8),
                new Person("붉은매", 18, 174.1),
        }) {
            for (var ts: treeSets) {
                ts.add(p);
            }
        }

        for (var ts: treeSets) {
            for (var p : ts) {
                System.out.println(p);
            }
            System.out.println("\n- - - - -\n");
        }
    }
}
