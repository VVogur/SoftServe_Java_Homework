package homework7;

//Write program that prompts user for the size (a non-negative integer in int) and prints pattern as shown:
//              1
//            2 1
//          3 2 1
//        4 3 2 1
//      5 4 3 2 1
//    6 5 4 3 2 1
//  7 6 5 4 3 2 1
//8 7 6 5 4 3 2 1

import java.util.Scanner;

public class TaskTwoTriangle {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Write size: ");
        int rows = scr.nextInt();
        TriangularPatternD(rows);
    }

    public static void TriangularPatternD(int size) {

        if (size > 0) {
            for (int i = 0; i < size; i++) {
                for (int p = 1; p < size - i; p++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < (i + 1); j++) {
                    System.out.print((i - j + 1) + " ");
                }
                System.out.println();
            }
        }
    }
}

