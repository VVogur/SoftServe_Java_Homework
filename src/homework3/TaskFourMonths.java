package homework3;

import java.util.Scanner;

//Write a program which take number of month from user and print out name of season (summer, winter ...)

public class TaskFourMonths {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Write the month number");
        int a = scr.nextInt();

        if (a == 1 | a == 2 | a == 12) {
            System.out.println("Winter");
        } else if (a == 3 | a == 4 | a == 5) {
            System.out.println("Spring");
        } else if (a == 6 | a == 7 | a == 8) {
            System.out.println("Summer");
        } else if (a == 9 | a == 10 | a == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Wrong number");
        }
    }
}

