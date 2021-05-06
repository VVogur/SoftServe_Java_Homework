package homework7;

import java.util.Scanner;

//Write a program with method sum(int n) which receives one parameter and return sum of its digits using recursion

public class TaskFiveSum {

    public static void main(String args[])
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("Write number: ");
        int num = scr.nextInt();
        int result = sum(num);
        System.out.println("Sum of digits in " +
                num + " is " + result);
    }


    public static int sum(int n)
    {
        if (n == 0)
            return 0;
        return (n % 10 + sum(n / 10));
    }
}
