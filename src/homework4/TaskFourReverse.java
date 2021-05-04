package homework4;

import java.util.Scanner;

//Write a program to extract each digit from a double, in the reverse order.
//For example, if the double is 2522.43034,
// the output shall be " 4 3 0 3 4 . 2 2 5 2", with a space separating the digits.

public class TaskFourReverse {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Write number: ");
        double a = scr.nextDouble();

        String str = String.valueOf(a);
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
