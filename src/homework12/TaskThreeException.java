package homework12;

//Write our own type of exception (with message) and add usage of it in main method

public class TaskThreeException {

    public static void main(String[] args) {

        try {
            throw new Car();
        } catch (Car e) {
            System.out.println("It is my car");
        }
    }
}
