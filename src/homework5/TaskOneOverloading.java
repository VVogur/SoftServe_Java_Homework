package homework5;

//Write program with example of overloading with methods with variations of parameters:
// (int), (int, int), (double, int), (int, double), (int, float, String) and without parameters.
// Add case of usage types substitution from Type Promotion table (int → long → float → double)

public class TaskOneOverloading {
    public static void main (String[] args){

        int a = 123;
        int a1 = 321;
        double b = 123.321;
        float c = 12.21f;
        String str = "qwerty";

        overl(a);
        overl(a, a1);
        overl(a, b);
        overl(b, a);
        overl(a, c, str);
    }

    public static void overl(int a){
        System.out.println("Int: " + a);
    }
    public static void overl(int a, int a1){
        System.out.println("First int: " + a + " Second int: " + a1);
    }
    public static void overl(int a, double b){
        System.out.println("Int: " + a + " Double: " + b);
    }
    public static void overl(double b, int a){
        System.out.println("Double: " + b + " Int: " + a);
    }
    public static void overl(int a, float c, String str){
        System.out.println("Int: " + a + " Float: " + c + " String: " + str);
    }
}

