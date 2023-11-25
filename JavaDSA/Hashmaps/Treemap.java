package Hashmaps;

import java.util.*;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("Tea", 10);
        tm.put("Coffee", 50);
        tm.put("Cappuccino", 100);
        tm.put("Latte", 150);

        System.out.println(tm);

    }

}
