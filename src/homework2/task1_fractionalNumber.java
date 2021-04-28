package homework2;

import java.util.Scanner;

public class task1_fractionalNumber {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Write first number");
        double a = scr.nextDouble();
        System.out.println("Write second number");
        double b = scr.nextDouble();
        System.out.println("Result " + a / b);
    }
}
