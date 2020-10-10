package HeapSort;

import static HeapSort.HeapSort.printSortedArray;
import java.util.Random;

public class HeapSort {

    private int[] arr;

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int n = arr.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapSort(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapSort(arr, i, 0);
        }
    }

    private static int[] heapSort(int[] arr, int n, int i) {
        int large = i;
        int left = large * 2 + 1;
        int right = large * 2 + 2;

        if (left < n && arr[left] > arr[large]) {
            large = left;
        }
        if (right < n && arr[right] > arr[large]) {
            large = right;
        }
        if (large != i) {
            int temp = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;
            heapSort(arr, n, large);
        }
        return arr;
    }

    public static void printSortedArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int arr[] = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(400);
        }
        System.out.println("before sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");

        HeapSort hs = new HeapSort();
        hs.setArr(arr);
        hs.sort();

        System.out.println("after sorting");
        printSortedArray(arr);

    }

}
