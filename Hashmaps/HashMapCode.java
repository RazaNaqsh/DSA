package Hashmaps;

import java.util.*;

public class HashMapCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4]; // in some versions of java we cannot create a ll without
            // giving a type, thus java doesnt let us run the program without defining , so
            // we supress the warning
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;

        }

        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // nodes > add in bucket
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n / N;
        }

        public boolean containsKey(K key) {
            return false;
        }

        public V remove(K key) {
            return null;
        }

        public V get(K key) {
            return null;
        }

        public ArrayList<K> keySet() {
            return null;
        }
    }

    public static void main(String[] args) {

    }
}
