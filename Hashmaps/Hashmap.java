package Hashmaps;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - o(1)
        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("Japan", 30);

        System.out.println(hm);

        // Get - o(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("China"));
    }
}
