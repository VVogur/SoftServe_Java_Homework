package homework8;

//1. Create class Worker with next fields: String name, int age, String position, int salary.
// Give some default values to these fields and add constructor which add new values to them.
// Add getters and setters. Use all of methods in main in other class.

//2. Add method toString() to Worker class. Add usage of toString() to main in other class.

//3. Create new class Dog, which has one static method and one static field.
// Print out value of this variable, add usage of static method in main

public class MainForTasks {
    public static void main(String args[]) {

        //Task1-2
        System.out.println("Task 1-2");
        Worker first = new Worker();
        Worker second = new Worker("Dima", 20, "Programmer", 1500);
        System.out.println(first);
        System.out.println(second);

        first.setName("Andrey");
        first.setAge(30);
        first.setPosition("Java Developer");
        first.setSalary(2000);
        System.out.println(first);
        //
        System.out.println("");
        //
        //Task3
        System.out.println("Task 3");
        System.out.println(Dog.name);
        Dog.dogName();
        //
        System.out.println("");
        //
        //Task4
        System.out.println("Task 4");
        Human q = new Human();
        Human w = new Human("Fedya");
        Human e = new Human(50,150);
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        //
        System.out.println("");
        //
        //Task5
        System.out.println("Task 5");

        Cat a = new Cat ("Murka", "Black");
        Cat b = new Cat ("Milya", "White");
        Cat c = a;

        System.out.println("Use '==' :");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == b);

        System.out.println("Use '.equals' :");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(b));

        Mouse z = new Mouse ("small", "grey");
        Mouse x = new Mouse ("big", "black");
        Mouse y = x;

        System.out.println("Use '==' :");
        System.out.println(z == x);
        System.out.println(z == y);
        System.out.println(y == x);

        System.out.println("Use '.equals' :");
        System.out.println(z.equals(x));
        System.out.println(z.equals(y));
        System.out.println(y.equals(x));
    }
}
