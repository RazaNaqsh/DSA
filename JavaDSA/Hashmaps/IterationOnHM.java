package Hashmaps;

import java.util.*;

public class IterationOnHM {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("Tea", 10);
        hm.put("Coffee", 50);
        hm.put("Pizza", 200);
        hm.put("Burger", 50);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key=" + k + ", Value=" + hm.get(k));
        }
    }
}
