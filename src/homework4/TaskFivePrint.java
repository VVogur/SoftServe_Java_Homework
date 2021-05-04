package homework4;


import java.util.Scanner;


//Write program which print out next image using loops:
//    *
//   * *
//  * * *
// * * * *
//* * * * *

public class TaskFivePrint {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Write size: ");
        int rows = scr.nextInt();
        int k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}

