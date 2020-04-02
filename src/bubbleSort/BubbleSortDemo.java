package bubbleSort;

import java.util.Scanner;

public class BubbleSortDemo {

    public static void main(String[] args) {

        BubbleSort b = new BubbleSort();
        Scanner in = new Scanner(System.in);

        int[] arr = new int [in.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        b.bubbleSort(arr);
        b.printSortedArray();
    }

}
