package homework9;

public class Vehicle {
    int speed;
    private String model;

    void speedUp(int value) {
        speed += value;
        System.out.println("Speed increase by" + value);
    }

    void applyBrake(int value) {
        speed -= value;
        System.out.println("Speed decrease by" + value);
    }

    void setModel(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

    public void move() {
        System.out.println("Venicle is moving");
    }

    final void stop() {
        speed = 0;
        System.out.println("Venicle stopped");
    }

    @Override
    public String toString() {
        return "RoadBicycle{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }
}
