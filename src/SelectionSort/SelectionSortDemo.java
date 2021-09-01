package SelectionSort;

public class SelectionSortDemo {

    public static void main(String[] args) {
        SelectionSort b = new SelectionSort();

        int[] arr = new int[]{566, 333, 450, 850, 365};
        b.selectionSort(arr);
        b.printSortedArray();
    }
}