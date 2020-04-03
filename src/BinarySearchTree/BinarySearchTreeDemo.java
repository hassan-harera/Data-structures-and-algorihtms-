package BinarySearchTree;

import java.util.Scanner;

public class BinarySearchTreeDemo {

    public static void main(String[] args) {

        BinarySearchTree bs = new BinarySearchTree();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            bs.addNode(in.nextInt());
        }

        int r = in.nextInt();
        while (r-- > 0) {
            bs.deleteNode(in.nextInt());
        }
        
        bs.printTree();
        
    }

}
