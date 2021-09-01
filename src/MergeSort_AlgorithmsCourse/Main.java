package MergeSort_AlgorithmsCourse;

import java.util.Scanner;

public class Main {

    static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
