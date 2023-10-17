package 게임예제;

public enum Side {
    RED("레드"),
    BLUE("블루");

    private final String name;

    Side(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
