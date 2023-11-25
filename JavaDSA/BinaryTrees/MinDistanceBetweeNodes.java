package BinaryTrees;

public class MinDistanceBetweeNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }
        return root;
    }

    public static int lcaDist(Node root, int n) {
        if (root == null)
            return -1;

        if (root.data == n)
            return 0;

        int leftDis = lcaDist(root.left, n);
        int rightDis = lcaDist(root.right, n);

        if (leftDis == -1 && rightDis == -1) {
            return -1;
        } else if (rightDis == -1) {
            return leftDis + 1;
        } else {
            return rightDis + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2) {
        Node lcaNode = lca(root, n1, n2);
        int dist1 = lcaDist(lcaNode, n1);
        int dist2 = lcaDist(lcaNode, n2);

        return dist1 + dist2;
    }

    public static void main(String[] args) {
        /*
         * tree
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(minDist(root, 4, 7));
    }
}
