package QueueDs;

import java.util.*;

public class Reversal {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

    }

    public static void main(String[] args) {
        Integer[] values = { 1, 2, 3, 4, 5 };
        Queue<Integer> originalQueue = new LinkedList<>(Arrays.asList(values));
        reverse(originalQueue);

        while (!originalQueue.isEmpty()) {
            System.out.print(originalQueue.remove() + " ");
        }
    }
}
