package BinarySearch;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int val = new Scanner(System.in).nextInt();

        long timeBefore = System.nanoTime();
        System.out.println(binarySearch(arr, val));
        long timeAfter = System.nanoTime();
        System.out.println(timeAfter-timeBefore);
        
    }

    public static Boolean binarySearch(int[] arr, int val) {

        return binarySearch(arr, val, 0, arr.length - 1);

    }

    public static Boolean binarySearch(int[] arr, int val, int start, int end) {
        if(start == end && arr[start]!= val){
            return false;
        }
        
        int mid = (start + end) / 2;

        if (val > arr[mid]) {
            return binarySearch(arr, val, mid + 1, end);
        } else if (val < arr[mid]) {
            return binarySearch(arr, val, start, mid);
        } else {
            return true;
        }
    }
}
