package homework2;

//Create your own example with increment/decrement, count it manually and then run program and verify your value.
// Example has to contain more then 5 increment operation,
// more then 5 decrement operations, *=, +=, -=, and more then 5 resetting of value for each variable.

public class TaskFourIncrementDecrement {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        x++;
        x--;
        x *= x++;
        x += x--;
        x -= --x;
        y++;
        y--;
        y *= y++;
        y += y--;
        y -= --y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

