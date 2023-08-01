package QueueDs;

import java.util.*;

public class QueueJFC {
    public static void main(String[] args) {
        // Since queue in itself is not a class, its kind of an interface
        // which is implemented using these below 2 classes.
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }
}
