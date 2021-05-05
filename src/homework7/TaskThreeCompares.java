package homework7;

import java.util.Scanner;

//Write a program which compares 2 strings by symbols and print whether they contain the same symbols or not.
// If not print difference. (Big and small symbol consider like the same)
//Output >>
//First string: Body_moving
//Second string: My body is fat
//Result: Strings contain different symbols.
//1st doesn’t contain ‘s’,’f’,’a’,t’
//2nd doesn’t contain ‘_’,’v’,’n’,d’

public class TaskThreeCompares {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Write first string: ");
        String firstString = scr.nextLine();
        firstString = firstString.toLowerCase();
        System.out.println("Write second string: ");
        String secondString = scr.nextLine();
        secondString = secondString.toLowerCase();
        if (firstString.compareToIgnoreCase(secondString) != 0) {
            System.out.println("Result: Strings contain different symbols.");
            System.out.print("1st doesn’t contain: ");
            for (int i = 0; i < firstString.length(); i++) {
                boolean flag = false;
                for (int j = 0; j < secondString.length(); j++) {
                    if (firstString.charAt(i) == secondString.charAt(j)) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    System.out.print("\'" + firstString.charAt(i) + "\' ");
                }
            }
            System.out.println();
            System.out.print("2st doesn’t contain: ");
            for (int i = 0; i < secondString.length(); i++) {
                boolean flag = false;
                for (int j = 0; j < firstString.length(); j++) {
                    if (secondString.charAt(i) == firstString.charAt(j)) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false && secondString.charAt(i) != ' ') {
                    System.out.print("\'" + secondString.charAt(i) + "\' ");
                }
            }
        } else {
            System.out.println("2 strings contain the same symbols");
        }
    }

}
