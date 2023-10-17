package generic.제네릭05와일드카드;

public class Horse<T extends Unit> {

    private T rider;

    public void setRider(T rider) {
        this.rider = rider;
    }
}
