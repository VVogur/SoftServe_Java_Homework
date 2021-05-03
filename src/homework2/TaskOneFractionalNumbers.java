package homework2;

import java.util.Scanner;

//Write a program which divide 2 fractional numbers and print results in console

public class TaskOneFractionalNumbers {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Write first number");
        double a = scr.nextDouble();
        System.out.println("Write second number");
        double b = scr.nextDouble();
        System.out.println("Result " + a / b);
    }
}
