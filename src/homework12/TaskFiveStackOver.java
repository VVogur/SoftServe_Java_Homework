package homework12;

//Create program which will result StackOverflowException

public class TaskFiveStackOver {

    static int i = 0;

    public static int printNumber(int x) {

        i = i + 2;
        System.out.println(i);
        return i + printNumber(i + 2);
    }

    public static void main(String[] args) {
        // Recursive call without any
        // terminating condition
        TaskFiveStackOver.printNumber(i);
    }
}

