package homework13;

//Write a method switchPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion.
// Your method should switch the order of the first two values, then switch the order of the next two,
// switch the order of the next two, and so on.
// For example, if the list initially stores these values: {"four", "score", "and", "seven", "years", "ago"}
// your method should switch the first pair, "four", "score", the second pair, "and", "seven", and the third pair,
// "years", "ago", to yield this list: {"score", "four", "seven", "and", "ago", "years"}
// If there are an odd number of values in the list, the final element is not moved.
// For example, if the original list had been: {"to", "be", "or", "not", "to", "be", "hamlet"}
// It would again switch pairs of values, but the final value,
// "hamlet" would not be moved, yielding this list: {"be", "to", "not", "or", "be", "to", "hamlet"}

import java.util.ArrayList;

public class TaskThreeSwitchPairs {
    public static void main(String[] args) {
        ArrayList<String> strList1 = new ArrayList<String>();
        strList1.add("to");
        strList1.add("be");
        strList1.add("or");
        strList1.add("not");
        strList1.add("to");
        strList1.add("be");
        strList1.add("hamlet");
        System.out.println("strList1\n" + "Before shuffle: " + strList1);
        swapPairs(strList1);
        System.out.println("After shuffle: " + strList1);

        ArrayList<String> strList2 = new ArrayList<String>();
        strList2.add("four");
        strList2.add("score");
        strList2.add("and");
        strList2.add("seven");
        strList2.add("years");
        strList2.add("ago");

        System.out.println("\nstrList2\n" + "Before shuffle: " + strList2);
        swapPairs(strList2);
        System.out.println("After shuffle: " + strList2);
    }

    public static void swapPairs(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }

}
