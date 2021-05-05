package homework7;

//Write program that prompts user for the size (a non-negative integer in int) and prints pattern as shown:
//# # # # # # # # # # #
//# # # # #   # # # # #
//# # # #       # # # #
//# # #           # # #
//# #               # #
//#                   #
//# #               # #
//# # #           # # #
//# # # #       # # # #
//# # # # #   # # # # #
//# # # # # # # # # # #

import java.util.Scanner;

public class TaskOneRhomb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input size: ");
        int size = input.nextInt();
        int medium = size / 2;
        if (size < 1 || size % 2 == 0) {
            System.out.println("Enter an unpaired number");
        } else {
            for (int i = 0; i < size; i++) {
                if (i <= medium) {
                    for (int j = 0; j < size; j++) {
                        if (j > medium - i && j <= medium + i - 1) {
                            System.out.print("  ");
                        } else {
                            System.out.print(" #");
                        }
                    }
                } else {
                    for (int j = 0; j < size; j++) {
                        if (j > medium + i - size + 1 && j <= medium - i + size - 2) {
                            System.out.print("  ");
                        } else {
                            System.out.print(" #");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
