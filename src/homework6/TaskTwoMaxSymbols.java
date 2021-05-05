package homework6;

import java.util.Scanner;

//Write a Java program to print out the maximum occurring character in initial string.
// If there are few of them -> print them all

public class TaskTwoMaxSymbols {

    public static class Main {
        static final int N = 256;

        static char MaxOccuringChar(String str1) {
            int ctr[] = new int[N];
            int l = str1.length();
            for (int i = 0; i < l; i++)
                ctr[str1.charAt(i)]++;
            int max = -1;
            char result = ' ';

            for (int i = 0; i < l; i++) {
                if (max < ctr[str1.charAt(i)]) {
                    max = ctr[str1.charAt(i)];
                    result = str1.charAt(i);
                }
            }

            return result;
        }

        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            System.out.println("Write text: ");
            String str1 = scr.nextLine();
            System.out.println("You write is: " + str1);
            System.out.println("Max occurring character in your text is: " + MaxOccuringChar(str1));
        }
    }


}
