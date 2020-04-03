package BinarySearchTree;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void addNode(int value) {
        this.root = addNode(this.root, value);
    }

    private Node addNode(Node root, int n) {

        if (root == null) {
            root = new Node(n, null, null);
        } else if (n > root.value) {
            root.right = addNode(root.right, n);
        } else if (n < root.value) {
            root.left = addNode(root.left, n);
        }
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

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

}
