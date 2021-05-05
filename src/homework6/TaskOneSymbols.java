package homework6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Write program which print out how much times each character is in initial string

public class TaskOneSymbols {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Write text: ");
        String a = scr.nextLine();
        parseString(a);


    }

    public static char parseString(String s) {
        Map<String, Integer> values = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String t = (s.substring(i, i + 1));
            values.computeIfPresent(t, (k, v) -> v + 1);
            values.putIfAbsent(t, 1);
        }

        for (Map.Entry<String, Integer> entry : values.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Letter " + key + " appears " + value + " times.");
        }
        return 0;
    }


}

