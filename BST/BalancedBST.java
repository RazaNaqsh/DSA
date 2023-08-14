package BST;

public class BalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node createBalancedBst(int arr[], int st, int ed) {
        if (st > ed)
            return null;

        int mid = (st + ed) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBalancedBst(arr, st, mid - 1);
        root.right = createBalancedBst(arr, mid + 1, ed);
        return root;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        Node root = createBalancedBst(arr, 0, arr.length - 1);
        preOrder(root);
    }
}
