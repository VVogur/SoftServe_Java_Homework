package homework11;

import java.util.Scanner;

//Write class which contains just 1 method which returns the result of multiplication of all doubles which it receives.
// It can receive any amount of double numbers. Add usage of it in main in other class

public class TaskFiveDouble {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Write number a: ");
        double a = scr.nextDouble();
        System.out.println("Write number b: ");
        double b = scr.nextDouble();
        System.out.println("Write number c: ");
        double c = scr.nextDouble();
        System.out.println("Write number d: ");
        double d = scr.nextDouble();
        System.out.println(miltiplication(a, b, c, d));

    }

    static double miltiplication(double... d) {
        double result = 1.0;
        for (double number : d) {
            result *= number;
        }
        return result;
    }
}

