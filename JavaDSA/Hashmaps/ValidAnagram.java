package Hashmaps;

import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        // step 1- add s data in map
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // step 2 - remove data when matched with t
        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1)
                    map.remove(ch);
                else
                    map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) { // o(n)
        String s = "knee";
        String t = "keen";

        System.out.println(isAnagram(s, t));
    }
}
