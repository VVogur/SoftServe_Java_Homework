package homework4;


//Write a program called Tribonacci to print the first 20 Tribonacci numbers
//0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504 ....


public class TaskTwoTribonacci {


    public static void main(String args[]) {
        int n = 20;
        int a = 0;
        int b = 0;
        int c = 1;
        int i;
        for (i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
    }
}

