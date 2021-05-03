package homework2;

import java.util.Scanner;

//Write a program which count the volume of cylinder and print result in console. Radius and height user input from console

public class TaskTwoCylinder {
        public static void main(String[] args) {

            Scanner scr = new Scanner(System.in);
            System.out.println("Write radius number");
            double a = scr.nextDouble();
            System.out.println("Write height number");
            double b = scr.nextDouble();
            System.out.println("Result " + ((a*a) * b * Math.PI));
        }
    }

