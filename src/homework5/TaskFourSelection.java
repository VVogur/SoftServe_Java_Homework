package homework5;

//Write program which create an array from 20 integers with random values,
// write method with sort them in increase order, use Selection sort type
//This algorithm divides the lists into two parts: the left-sublist of items already sorted,
// and the right-sublist for the remaining items. Initially, the left-sorted-sublist is empty,
// while the right-unsorted-sublist is the entire list.
// The algorithm proceeds by finding the smallest (or largest) items from the right-unsorted-sublist,
// swapping it with the leftmost element of the right-unsorted-sublist, and increase the left-sorted-sublist by one.

import java.util.Arrays;
import java.util.Random;

public class TaskFourSelection {
    public static void main(String[] args) {

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 20));
        }


        System.out.println("\n" + Arrays.toString(array));
        array = arraySort(array);
        System.out.println("\n" + Arrays.toString(array));
    }

    private static int[] arraySort(int[] array) {

        int indexOfMin;
        for (int i = 0; i < array.length; i++) {
            indexOfMin = i;
            for (int j = i; j < array.length; j++)
                if (array[j] < array[indexOfMin]) indexOfMin = j;
            if (i != indexOfMin) {
                int forSwap = array[i];
                array[i] = array[indexOfMin];
                array[indexOfMin] = forSwap;
            }
        }
        return array;
    }

}


