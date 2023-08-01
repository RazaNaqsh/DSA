package QueueDs;

import java.util.*;

/* In this question as well there are two ways, the push[O(n)] method,
 where push takes this tc and rest constant tc,

 and other one is pop[O(n)] way where popping and peek takes linear tc and 
 push takes constant
 */

public class StackUsing2Queues {
    // This is Pop[O(n)] method
    // static class Stack {
    // static Queue<Integer> q1 = new LinkedList<>();
    // static Queue<Integer> q2 = new LinkedList<>();

    // public static boolean isEmpty() {
    // return q1.isEmpty() && q2.isEmpty();
    // }

    // public static void push(int data) {
    // if (!q1.isEmpty()) {
    // q1.add(data);
    // } else {
    // q2.add(data);
    // }
    // }

    // public static int pop() {
    // int top = -1;
    // if (!q1.isEmpty()) {
    // while (!q1.isEmpty()) {
    // top = q1.remove();
    // if (q1.isEmpty()) {
    // break;
    // }
    // q2.add(top);
    // }
    // } else {
    // while (!q2.isEmpty()) {
    // top = q2.remove();
    // if (q2.isEmpty()) {
    // break;
    // }
    // q1.add(top);
    // }
    // }
    // return top;
    // }

    // public static int peek() {
    // int top = -1;
    // if (!q1.isEmpty()) {
    // while (!q1.isEmpty()) {
    // top = q1.remove();
    // q2.add(top);
    // }
    // } else {
    // while (!q2.isEmpty()) {
    // top = q2.remove();
    // q1.add(top);
    // }
    // }
    // return top;
    // }
    // }

    // * This is push[O(n)] method where push takes linear tc rest constant
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            q1.add(data);
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        public static int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return q1.remove();
        }

        public static int peek() {
            if (q1.isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
