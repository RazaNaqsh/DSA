package HeapsPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCode {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); //works in asc order
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // works in desc order
        pq.add(3);
        pq.add(5);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }
}