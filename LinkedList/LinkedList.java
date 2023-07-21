package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // Create new node
        Node newNode = new Node(data);

        // if linked list was empty then initialize it with the new node
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // point new node to next node which was currenthead
        newNode.next = head;

        // Now change the head to the currentnode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) { // tail == null can also be used, but its convention
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();

        ll.addLast(3);
        ll.addLast(4);
        ll.print();

    }
}
