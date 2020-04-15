package BinarySearchTree;

import java.util.Arrays;

public class BinaryTree {

    Node root;
    private int level;

    public BinaryTree() {
        level = 1;
        root = null;
    }

    public void addNode(int value) {
        this.root = addNode(this.root, value, 1);
    }

    private Node addNode(Node root, int n, int level) {

        if (root == null) {
            root = new Node(n);
        } else if (n > root.value) {
            root.right = addNode(root.right, n, level + 1);
        } else if (n < root.value) {
            root.left = addNode(root.left, n, level + 1);
        }
        this.level = Integer.max(level, this.level);
        return root;
    }

    public void deleteNode(int value) {
        root = deleteNode(root, value);
    }

    private Node deleteNode(Node root, int n) {
        if (root == null) {
            return this.root;
        }

        if (n > root.value) {
            root.right = deleteNode(root.right, n);
        } else if (n < root.value) {
            root.left = deleteNode(root.left, n);
        } else {
            if (root.right == null && root.left == null) {
                root = null;
            } else if (root.right == null) {
                root = root.left;
            } else if (root.left == null) {
                root = root.right;
            } else {
                root.value = searchMini(root.right, root.right.value);
                deleteNode(root.right, root.value);
            }
        }
        return root;
    }

    private int search(int value) {
        if (search(root, value)) {
            return value;
        } else {
            return -1;
        }
    }

    private Boolean search(Node root, int n) {
        if (root == null) {
            return false;
        }

        if (n > root.value) {
            return search(root.right, n);
        } else if (n < root.value) {
            return search(root.left, n);
        } else {
            return true;
        }
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        System.out.println(root.value);
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.value);

    }

    private int searchMini(Node root, int mini) {

        if (root == null) {
            return mini;
        }
        mini = Integer.min(mini, root.value);

        mini = Integer.min(searchMini(root.left, mini), searchMini(root.right, mini));

        return mini;
    }

    public void printTree() {
        printTree(this.root);
    }

    private void printTree(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.value);

        printTree(root.right);
        printTree(root.left);
    }
}

class Node {

    int value;
    Node left, right;

    public Node(int value) {

        this.value = value;
        this.left = null;
        this.right = null;
    }

}
