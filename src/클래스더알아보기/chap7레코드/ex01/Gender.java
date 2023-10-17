package 클래스더알아보기.chap7레코드.ex01;

public enum Gender {
    MALE("🙎‍"),
    FEMALE("👩");

    private String emoji;

    Gender(String emoji) {
        this.emoji = emoji;
    }

    public String getEmoji() {
        return emoji;
    }
}
