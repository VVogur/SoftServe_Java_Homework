package homework2;

import java.util.Scanner;

public class task3_16to10 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Write a hex ");
        String hex = scr.nextLine();
        System.out.println(Integer.parseInt(hex, 16));
    }
}