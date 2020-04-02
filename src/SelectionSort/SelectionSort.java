package SelectionSort;

public class SelectionSort {

    private int[] ar;

    public void selectionSort(int[] arr) {
        ar = arr;
        Boolean sorted = true;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
                swap(min, j);
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
