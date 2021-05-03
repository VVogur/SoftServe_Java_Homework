package homework2;

import java.util.Scanner;

//Write a program which converts number from hex to decimal view (input in command line)

public class TaskThreeHexToDex {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Write a hex ");
        String hex = scr.nextLine();
        System.out.println(Integer.parseInt(hex, 16));

    }
}