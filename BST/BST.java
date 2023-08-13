package BST;

import java.util.ArrayList;

public class BST {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (root.data > key)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case 1 - leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 - single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 - both children
            Node IS = findIS(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findIS(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printRange(Node root, int k1, int k2) {
        if (root == null)
            return;
        if (root.data <= k2 && root.data >= k1) {
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printRange(root.right, k1, k2);
        } else {
            printRange(root.left, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int vals[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < vals.length; i++) {
            root = insert(root, vals[i]);
        }

        inorder(root);

        System.out.println();

        // if (search(root, 6)) {
        // System.out.println("Found");
        // } else {
        // System.out.println("Not found");
        // }

        // delete(root, 10);
        // inorder(root);
        // printRange(root, 5, 12);
        printRootToLeaf(root, new ArrayList<Integer>());
    }
}
