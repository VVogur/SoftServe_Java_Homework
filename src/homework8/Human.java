package homework8;

public class Human {
    private String name = "Oleg";
    private int weight = 80;
    private int height = 180;

    public Human(String name) {
        this.name = name;
    }

    public Human(int weight, int height) {
        this.weight = weight;
    }

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
