package QueueDs;

import java.util.*;
/* Queue can be implemented using 2 stacks, in 2 ways. One is to 
make a queue of 2 stacks where add operation takes O(n) and rest operations O(1).
Other way is where remove and peek takes O(n) and add takes O(1)  */

public class QueueUsing2Stacks {
    // * This is where add takes O(n) TC and rest O(1).
    // static class Queue {
    // static Stack<Integer> s1 = new Stack<>();
    // static Stack<Integer> s2 = new Stack<>();

    // public static boolean isEmpty() {
    // return s1.isEmpty();
    // }

    // public static void add(int data) {
    // while (!s1.isEmpty()) {
    // s2.push(s1.pop());
    // }
    // s1.push(data);
    // while (!s2.isEmpty()) {
    // s1.push(s2.pop());
    // }
    // }

    // public static int remove() {
    // if (s1.isEmpty()) {
    // System.out.println("Queue is Empty");
    // return -1;
    // }
    // return s1.pop();
    // }

    // public static int peek() {
    // if (s1.isEmpty()) {
    // System.out.println("Queue is Empty");
    // return -1;
    // }
    // return s1.peek();
    // }
    // }

    // * This one is where remove and peek takes O(n) and add O(1).
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            s1.push(data);
        }

        public static int remove() {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int result = s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return result;
        }

        public static int peek() {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int result = s2.peek();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
