package homework5;

//Write program which create an array from 20 integers with random values,
// write method with shuffle elements of array in random order

public class TaskThreeMassive {
    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 20));
            System.out.print(array[i] + " ");
        }
    }
}



