package SelectionSort;

import java.util.Scanner;

public class SelectionSortDemo {

    public static void main(String[] args) {

        SelectionSort b = new SelectionSort();
        Scanner in = new Scanner(System.in);

        int[] arr = new int[in.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        b.selectionSort(arr);
        b.printSortedArray();
    }

}
