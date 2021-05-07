package homework10;

public class RoadBicycle extends Bicycle {

    private int rudderDepth;

    int getRudderDepth() {
        return rudderDepth;
    }

    void setRudderDepth(int rudderDepth) {
        this.rudderDepth = rudderDepth;
    }

    @Override
    public void move() {
        System.out.println("Road bicycle is moving");
    }
}
