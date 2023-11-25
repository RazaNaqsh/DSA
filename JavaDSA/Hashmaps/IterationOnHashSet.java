package Hashmaps;

import java.util.*;

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Ranchi");
        cities.add("Jamshedpur");

        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
