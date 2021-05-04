package homework5;

//Write program which create an array from 20 integers with random values, write method with sort them in
// increase order, use Insertion sort type
//Similar to the selection sort, but extract the leftmost element from
// the right-unsorted-sublist, and insert into the correct location of the left-sorted-sublist.

import java.util.Arrays;

public class TaskFiveInsertion {
    public static void main(String[] args) {

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 20));
        }

        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
