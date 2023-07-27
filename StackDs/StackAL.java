package StackDs;

import java.util.*;

public class StackAL {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            int lastEl = list.size() - 1;
            int top = list.get(lastEl);
            list.remove(lastEl);
            return top;
        }

        public static int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        // Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // while (!s.isEmpty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }

        // * this is accessing the static way
        Stack.push(1);
        Stack.push(2);

        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}