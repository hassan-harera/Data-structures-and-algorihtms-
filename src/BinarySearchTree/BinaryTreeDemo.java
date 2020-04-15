package BinarySearchTree;


public class BinaryTreeDemo {

    public static void main(String[] args) {

        int [] arr = {50,60,70,65,55,57,30,20,40,10,45};
        
        BinaryTree bs = new BinaryTree();
        for (int i = 0; i < 11; i++) {
            bs.addNode(arr[i]);
        }
        System.out.println("---------");
        bs.inOrderTraversal();
        System.out.println("---------");
        bs.preOrderTraversal();
        System.out.println("---------");
        bs.postOrderTraversal();

    }

}
