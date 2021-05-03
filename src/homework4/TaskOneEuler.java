package homework4;

//Write a program to compute the value of Eiler number, using the following series expansion.
//Use the maximum denominator as the terminating condition. Try maxDenominator of 1000, 10000, 100000,
//HINT: e=1/0!+1/1!+1/2!+1/3!+1/4!+1/5!+1/6!+...
//https://en.wikipedia.org/wiki/Euler_number

import java.math.BigInteger;

public class TaskOneEuler {
    public static void main(String[] args) {

        double e = 0;
        int i = 0;
        while (getFactorial(i) < 1000) {
            e += 1.0 / getFactorial(i);
            i++;
        }
        System.out.println("Euler number < 1000: " + e);

        e = 0;
        i = 0;
        while (getFactorial(i) < 10000) {
            e += 1.0 / getFactorial(i);
            i++;
        }
        System.out.println("Euler number < 10000: " + e);

        e = 0;
        i = 0;
        while (getFactorial(i) < 100000) {
            e += 1.0 / getFactorial(i);
            i++;
        }
        System.out.println("Euler number < 100000: " + e);

    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
