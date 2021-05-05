package homework6;

import java.util.Scanner;

//Write a Java program to read a string and an int from console, return a string without the character with described index
//The initial strings is: Hello buddy
//The numbers is: 3
//The new string is: Helo buddy

public class TaskFiveReadString {
    public static class Main {
        public String nTwice(String str, int pos) {
            return str.substring(0, pos) + str.substring(pos + 1);
        }

        public static void main(String[] args) {
            Main m = new Main();
            Scanner scr = new Scanner(System.in);
            System.out.println("Write text: ");
            String str1 = scr.nextLine();
            System.out.println("Write number from 0 to the end of the line: ");
            int n1 = scr.nextInt();

            System.out.println("The given strings is: " + str1);
            System.out.println("The given numbers is: " + n1);
            System.out.println("The new string is: " + m.nTwice(str1, n1));
        }
    }

}
