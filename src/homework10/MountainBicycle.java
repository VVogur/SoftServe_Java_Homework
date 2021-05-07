package homework10;

public class MountainBicycle extends Bicycle {

    private int seatHeight;

    int getSeatHeight() {
        return seatHeight;
    }

    void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
    @Override
    public void move() {
        System.out.println("Mountain Bicycle is moving");
    }
}
