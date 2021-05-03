package homework3;

import java.util.Scanner;

//Write the program which take name of color from user (red, blue, green, yellow, orange, black, white, pink)
// and print out length of this word. Use switch

public class TaskFiveColor {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Write any color: red, blue, pink, green, black, white, yellow or orange: ");
        String color = scr.nextLine();
        switch (color) {
            case "red":
                System.out.println(3);
                break;
            case "blue":
            case "pink":
                System.out.println(4);
                break;
            case "green":
            case "black":
            case "white":
                System.out.println(5);
                break;
            case "yellow":
            case "orange":
                System.out.println(6);
                break;
            default:
                System.out.println("You should choose a color from the presented");
                break;
        }
    }
}

