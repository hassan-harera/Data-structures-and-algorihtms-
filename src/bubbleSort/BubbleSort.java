package bubbleSort;

public class BubbleSort {

    private int[] ar;

    public void bubbleSort(int[] arr) {
        ar = arr;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(i, j);
                }
            }
        }
    }

    private void swap(int a, int b) {

        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;

    }

    public void printSortedArray() {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

}
