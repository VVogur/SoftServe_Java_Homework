package homework2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class task4_incrementDecrement {
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

