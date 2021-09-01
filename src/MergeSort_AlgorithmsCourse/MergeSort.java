package MergeSort_AlgorithmsCourse;

public class MergeSort {

    int[] sort(int[] arr) {
        divide(arr, 0, arr.length - 1);

        return arr;
    }

    private void divide(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }

        int m = (l + r) / 2;

        divide(arr, l, m);
        divide(arr, m + 1, r);

        merge(arr, l, r, m);
    }

    private void merge(int[] arr, int l, int r, int m) {
        int[] temp = arr.clone();

        int i = l, j = m + 1, k = l;

        while (i <= m && j <= r) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= m) {
            arr[k] = temp[i];
            i++;
            k++;
        }

        while (j <= r) {
            arr[k] = temp[j];
            j++;
            k++;
        }
    }
}
