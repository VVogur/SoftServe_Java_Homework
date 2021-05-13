package homework14.task1;

//Write program which contains class with 3 generics, each is used as type of variable inside of class.
// Add usage of class with generics, use different types of variables for generic

public class Main {

    public static void main(String[] args) {
        Cat <String, String, Double> a = new Cat ("Snappy", "Black", 4.3);

        System.out.println(a);
    }
}
