package homework12;

//Write program which have variable which is null.
// Call toString() for this variable. Use try/catch to handle NullPointerException.

public class TaskOneNull {
    public static void main(String[] args) {

        TaskOneNull example = null;

        try {
            String str = example.toString();
        } catch (NullPointerException e) {
            System.out.println("Exception is caught");
        }

    }
}
