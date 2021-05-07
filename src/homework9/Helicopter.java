package homework9;

import java.util.Objects;

public class Helicopter extends Vehicle {

    int amountOfPassengers;
    int maxHeight;
    int tankSize;

    @Override
    public void move() {
        System.out.println("Helicopter is moving");
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "amountOfPassengers=" + amountOfPassengers +
                ", maxHeight=" + maxHeight +
                ", tankSize=" + tankSize +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Helicopter that = (Helicopter) o;
        return amountOfPassengers == that.amountOfPassengers && maxHeight == that.maxHeight && tankSize == that.tankSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfPassengers, maxHeight, tankSize);
    }
}
