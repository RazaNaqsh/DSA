package QueueDs;

import java.util.*;

public class Interleave2Halves {
    public static void interleaveQueue(Queue<Integer> originalQueue) {
        Queue<Integer> firstHalf = new LinkedList<>();

        // create half queue
        int size = originalQueue.size();
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(originalQueue.remove());
        }

        // while loop to interleave
        while (!firstHalf.isEmpty()) {
            originalQueue.add(firstHalf.remove());
            originalQueue.add(originalQueue.remove());
        }

        // print
        while (!originalQueue.isEmpty()) {
            System.out.print(originalQueue.remove() + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Queue<Integer> originalQueue = new LinkedList<>(Arrays.asList(values));
        interleaveQueue(originalQueue);
    }
}
