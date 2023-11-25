package Hashmaps;

import java.util.*;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();

        hm.put("Tea", 10);
        hm.put("Coffee", 50);
        hm.put("Cappuccino", 100);
        hm.put("Latte", 150);

        System.out.println(hm);
    }
}