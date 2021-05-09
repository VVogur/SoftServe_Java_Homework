package homework13;

//Write a program which measure time of inserting of new entry to hashmap and treemap,
// use different amounts of new entries (100, 1000, 10000, 1000000…)

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TaskFourMeasure {
    public static void main(String[] args) {
        System.out.println("HashMap time for 100 inserts " + getInsertTime(new HashMap<Integer, Object>(), 100));
        System.out.println("TreeMap time for 100 inserts " + getInsertTime(new TreeMap<Integer, Object>(), 100));

        System.out.println("HashMap time for 1000 inserts " + getInsertTime(new HashMap<Integer, Object>(), 1000));
        System.out.println("TreeMap time for 1000 inserts " + getInsertTime(new TreeMap<Integer, Object>(), 1000));

        System.out.println("HashMap time for 10000 inserts " + getInsertTime(new HashMap<Integer, Object>(), 10000));
        System.out.println("TreeMap time for 10000 inserts " + getInsertTime(new TreeMap<Integer, Object>(), 10000));

        System.out.println("HashMap time for 1000000 inserts " + getInsertTime(new HashMap<Integer, Object>(), 1000000));
        System.out.println("TreeMap time for 1000000 inserts " + getInsertTime(new TreeMap<Integer, Object>(), 1000000));
    }

    public static long getInsertTime(Map map, int n) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            map.put(i, new Object());
        }
        return System.currentTimeMillis() - start;
    }

}
