package homework2;

import java.util.Scanner;

public class task2_cylinder {
        public static void main(String[] args) {

            Scanner scr = new Scanner(System.in);
            System.out.println("Write radius number");
            double a = scr.nextDouble();
            System.out.println("Write height number");
            double b = scr.nextDouble();
            System.out.println("Result " + ((a*a) * b * Math.PI));
        }
    }

