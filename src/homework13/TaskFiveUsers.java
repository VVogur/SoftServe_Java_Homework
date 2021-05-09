package homework13;

//Create HashMap with 3 user defined objects Employee (id, name, city).
// Employee is separate class with described fields and overriden toString(), equals() and hashcode() methods.
// Compare these 3 objects of Employee as values of maps (they need to have different keys)

import java.util.HashMap;
import java.util.Map;

public class TaskFiveUsers {
    public static void main(String[] args) {

        Map<String, Employee> map = new HashMap<>();
        map.put("first", new Employee(22, "Grisha", "Petrov"));
        map.put("second", new Employee(23, "Alexey", "Diukarev"));
        map.put("third", new Employee(26, "Andrey", "Ivanov"));
        map.put("fourth", new Employee(26, "Andrey", "Ivanov"));


        System.out.println("First equals second = "
                + map.get("first").equals(map.get("second")));

        System.out.println("First equals third = "
                + map.get("first").equals(map.get("third")));

        System.out.println("Second equals third = "
                + map.get("second").equals(map.get("third")));

        System.out.println("Third equals fourth = "
                + map.get("third").equals(map.get("fourth")));
}}

