package homework7;

//Write a program which print out 2dimensional array depending on the size which user set via console:
//Output ->
//Enter the size: 3
//[[5, 4, 3],
//[6, 9, 2],
//[7, 8, 1]]
//
//Output ->
//Enter the size: 5
//[[11, 10, 9, 8, 7, 6],
//[12, 27, 26, 25, 24, 5],
//[13, 28, 35, 34, 23, 4],
//[14, 29, 36, 33, 22, 3],
//[15, 30, 31, 32, 21, 2],
//[16, 17, 18, 19, 20, 1]]

import java.util.Scanner;

public class TaskSixDimensionalArray {
    public static void main(String args[]) {
        System.out.println("Enter The Value For N :");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] spiral = new int[n][n];

        int value = 1;

        int minCol = 0;

        int maxCol = n - 1;

        int minRow = 0;

        int maxRow = n - 1;

        while (value <= n * n) {
            for (int i = minRow; i <= maxRow; i++) { //вниз
                spiral[i][minCol] = value;

                value++;
            }

            for (int i = minCol + 1; i <= maxCol; i++) { //вправо
                spiral[maxRow][i] = value;

                value++;
            }

            for (int i = maxRow - 1; i >= minRow; i--) { //вверх
                spiral[i][maxCol] = value;

                value++;
            }

            for (int i = maxCol - 1; i >= minCol + 1; i--) { //влево
                spiral[minRow][i] = value;

                value++;
            }

            minCol++;

            minRow++;

            maxCol--;

            maxRow--;
        }


        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral.length; j++) {
                System.out.print(spiral[i][j] + "\t");
            }

            System.out.println();
        }
    }
}