package Tries;

public class ShortestUniquePrefix {
    public static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int lvl = 0; lvl < word.length(); lvl++) {
            int idx = word.charAt(lvl) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static String findShortestUniquePrefix(String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();
        for (int lvl = 0; lvl < word.length(); lvl++) {
            int idx = word.charAt(lvl) - 'a';
            prefix.append(word.charAt(lvl));
            if (curr.children[idx] != null && curr.children[idx].freq == 1) {
                return prefix.toString();
            }
            curr = curr.children[idx];
        }
        return ""; // No unique prefix found.
    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "duck", "dove" };

        for (String word : arr) {
            insert(word);
        }

        for (String word : arr) {
            String shortestUniquePrefix = findShortestUniquePrefix(word);
            System.out.println("Shortest unique prefix for " + word + ": " + shortestUniquePrefix);
        }
    }
}
