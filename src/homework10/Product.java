package homework10;

public interface Product {
    int getCost();

    default void print() {
        System.out.println("Cost of a car" +  getCost());
    }
}
