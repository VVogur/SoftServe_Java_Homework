package homework7;

import java.util.Scanner;

//Write a program which verify whether String is a valid shuffle of other String.

public class TaskFourStringShuffle {

    static class Main {

        static boolean shuffleCheck(String first, String second, String result) {

            if (first.length() + second.length() != result.length()) {
                return false;
            }
            int i = 0, j = 0, k = 0;

            while (k != result.length()) {

                if (i < first.length() && first.charAt(i) == result.charAt(k))
                    i++;

                else if (j < second.length() && second.charAt(j) == result.charAt(k))
                    j++;

                else {
                    return false;
                }

                k++;
            }

            if (i < first.length() || j < second.length()) {
                return false;
            }

            return true;
        }

        public static void main(String[] args) {

            Scanner scr = new Scanner(System.in);
            System.out.println("Write first string: ");
            String first = scr.nextLine();
            System.out.println("Write second string: ");
            String second = scr.nextLine();
            System.out.println("Write first shuffle string: ");
            String a = scr.nextLine();
            System.out.println("Write second shuffle string: ");
            String b = scr.nextLine();

            //String first = "XY";
            //String second = "12";
            String[] results = {a, b};

            for (String result : results) {
                if (shuffleCheck(first, second, result) == true) {
                    System.out.println(result + " is a valid shuffle of " + first + " and " + second);
                } else {
                    System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
                }
            }
        }
    }

}
