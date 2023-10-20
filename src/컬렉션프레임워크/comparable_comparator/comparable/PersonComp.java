package 컬렉션프레임워크.comparable_comparator.comparable;

import java.util.Comparator;

public class PersonComp implements Comparator<Person> {

    public enum SortBy {NO, NAME, AGE, HEIGHT,}

    public enum SortDir {ASC, DESC,}

    private final SortBy sortBy;
    private final SortDir sortDir;

    public PersonComp(SortBy sortBy, SortDir sortDir) {
        this.sortBy = sortBy;
        this.sortDir = sortDir;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int result = 0;
        switch (sortBy) {
            case NO -> result = o1.getNo() > o2.getNo() ? 1 : -1;
            case NAME -> result = o1.getName().compareTo(o2.getName());
            case AGE -> result = o1.getAge() > o2.getAge() ? 1 : -1;
            case HEIGHT -> result = o1.getHeight() > o2.getHeight() ? 1 : -1;
        }
        return result * (sortDir == SortDir.ASC ? 1 : -1);
    }
}
