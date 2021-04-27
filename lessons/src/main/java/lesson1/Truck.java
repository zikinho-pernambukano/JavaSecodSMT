package lesson1;

public class Truck extends Barrier{
    private int distance = 0;

    public Truck(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
