package homework13;

//Write a Java program to compare two array lists. Each needs to contains at least 5 elements

import java.util.ArrayList;
import java.util.List;

public class TaskTwoCompare {
    public static void main(String[] args) {
        List<String> arrList1 = new ArrayList<>();
        List<String> arrList2 = new ArrayList<>();
        List<String> arrList3 = new ArrayList<>();

        arrList1.add("Ukraine");
        arrList1.add("Russia");
        arrList1.add("Egypt");
        arrList1.add("Turkey");
        arrList1.add("German");

        arrList2.add("USA");
        arrList2.add("France");
        arrList2.add("Japan");
        arrList2.add("China");
        arrList2.add("Canada");

        arrList3.add("Ukraine");
        arrList3.add("Russia");
        arrList3.add("Egypt");
        arrList3.add("Turkey");
        arrList3.add("German");

        boolean bool = arrList1.equals(arrList2);
        System.out.println("Compare arrList1 and arrList2 = " + bool);
        boolean bool1 = arrList1.equals(arrList3);
        System.out.println("Compare arrList1 and arrList3 = " + bool1);
    }
}