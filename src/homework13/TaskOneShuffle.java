package homework13;

//Create a List (try both ArrayList and LinkedList) and fill it with 5 countries.
// Sort the list and print it, then apply Collections.shuffle( ) to the list repeatedly,
// printing it each time so that you can see how the shuffle( ) method randomizes the list differently each time.

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TaskOneShuffle {
    public static void main(String[] args) {

        List<String> arrList = new ArrayList<>();
        List<String> linkList = new LinkedList<>();
        arrList.add("Ukraine");
        arrList.add("Russia");
        arrList.add("Egypt");
        arrList.add("Turkey");
        arrList.add("German");

        linkList.add("USA");
        linkList.add("France");
        linkList.add("Japan");
        linkList.add("China");
        linkList.add("Canada");

        System.out.println("arrList before shuffle: " + arrList);
        System.out.println("linkList before shuffle: " + linkList);
        System.out.println();

        for (int i = 1; i <= 3; i++) {
            Collections.shuffle(arrList);
            System.out.println("arrList after " + i + " shuffle: " + arrList);
            Collections.shuffle(linkList);
            System.out.println("linkList after " + i + " shuffle: " + linkList);
        }
    }

}
