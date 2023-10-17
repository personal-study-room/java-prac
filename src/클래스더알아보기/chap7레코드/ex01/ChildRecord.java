package 클래스더알아보기.chap7레코드.ex01;

public record ChildRecord(
        String name,
        int birthYear,
        Gender gender
) {
    // 1. 필드가 자동으로 private final
    // 2. 기본적으로 getter가 만들어져 있음.
    // 3. final class -> 상속이 안됨
}
