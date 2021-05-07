package homework10;

public abstract class Bicycle extends Vehicle {
    public final int id;
    protected int gear;

    public Bicycle() {
        id = 22;
    }

    public Bicycle(int id, int gear) {
        this.id = id;
        this.gear = gear;
    }

    public Bicycle(int id, int gear, int speed) {
        this.id = id;
        this.gear = gear;
        super.speed = speed;
    }

    public void changeGear(int value) {
        gear = value;
    }

    @Override
    public void move() {
        System.out.println("Bicycle is moving");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "id=" + id +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
