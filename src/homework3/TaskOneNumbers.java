package homework3;

import java.util.Scanner;

//Write a program which take four numbers from the user and print out just that few of them which divide by 3 or 5 without remainder

public class TaskOneNumbers {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int num1 = scr.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = scr.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = scr.nextInt();
        System.out.print("Input the 4rd number: ");
        int num4 = scr.nextInt();

        if (num1 % 3 == 0 && num1 % 5 == 0){
            System.out.println(num1 + " Without remainder");
        } else if (num2 % 3 == 0 && num2 % 5 == 0){
            System.out.println(num2 + " Without remainder");
        } else if (num3 % 3 == 0 && num3 % 5 == 0){
            System.out.println(num3 + " Without remainder");
        } else if (num4 % 3 == 0 && num4 % 5 == 0){
            System.out.println(num4 + " Without remainder");
        }

    }
}