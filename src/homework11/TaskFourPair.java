package homework11;

import java.util.Random;
import java.util.Scanner;

//4. Write program which find all pairs on integer array whose sum is equal to given number

public class TaskFourPair {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Fill in a number");
        int sum = scr.nextInt();
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(100);

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] + arr[j] == sum) {
                    System.out.printf("arr[%d] = %d, arr[%d] = %d\n", i, arr[i], j, arr[j]);
                }
    }
}

