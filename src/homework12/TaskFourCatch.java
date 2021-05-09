package homework12;

//Write program which has try-catch block inside of catch in try-catch block
// (with different exception other then we had in class)

import java.util.Scanner;

public class TaskFourCatch {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Fill in index of element");
        String[] arr = new String[5];
        try {
            arr[scr.nextInt()] = 1 + "";
            TaskFourCatch taskFourCatch = null;
            arr[1] = taskFourCatch.toString();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds exception");
        }
        catch (NullPointerException e) {
            System.err.println("null pointer exception");
        }
    }

}
