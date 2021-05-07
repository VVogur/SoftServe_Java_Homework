package homework10;

public class Car extends Vehicle implements Product {
    static String carType;
    static String transmission;
    private int cost;

    public Car(int cost) {
        this.cost = cost;
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public int getCost() {
        return cost;
    }


}
