package homework2;

import java.util.Scanner;
import static java.lang.Math.sqrt;

//Write a program which count x1, x2 for quadratic equation. Input a, b, c from console.

public class TaskFiveQuadratic {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Write number a ");
        double a = scr.nextDouble();
        System.out.println("Write number b ");
        double b = scr.nextDouble();
        System.out.println("Write number c ");
        double c = scr.nextDouble();
        double d = b * b - 4 * a * c;

        if (d < 0){
            System.out.println("No roots");
        } else if (d == 0) {
            System.out.println("There is exactly one root = " + (-b) / (2*a));
        } else if (d > 0) {
            System.out.println("Two roots " + "First root = " + (-b + sqrt(d)) / (2 * a) + " Second root = " + (-b - sqrt(d)) / (2 * a));
        }

    }
}

