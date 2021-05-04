package homework4;

import java.util.Scanner;

//Write 4 programs called TriangularPatternX (X = A, B, C, D) that prompts user for the size
// (a non-negative integer in int); and prints each of the patterns as shown on picture below
// https://prnt.sc/qu7uim

public class TaskThreeTriangular {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Write size: ");
        int rows = scr.nextInt();

        System.out.println("Write type in format A = 1, B = 2, C = 3, D = 4: ");
        int type = scr.nextInt();

        if (type == 1) {
            TriangularPatternA(rows);
        } else if (type == 2) {
            TriangularPatternB(rows);
        } else if (type == 3) {
            TriangularPatternC(rows);
        } else if (type == 4) {
            TriangularPatternD(rows);
        } else {
            System.out.println("Wrong type");
        }
    }

    public static void TriangularPatternA(int rows) {
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("#");
            }
            System.out.println();
        }
    }


    public static void TriangularPatternB(int rows) {
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("#");
            }
            System.out.println();
        }
    }


    public static void TriangularPatternC(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++)
                if (j >= i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            System.out.println();
        }
    }

    public static void TriangularPatternD(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++)
                if (j > rows - 2 - i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            System.out.println();

        }
    }
}