package LinkedList;

public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(1);

        if (head == null) {
            head = tail = newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();

    }
}