package LinearSearch;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int val = new Scanner(System.in).nextInt();

        long timeBefore = System.nanoTime();
        System.out.println(linearSearch(arr, val));
        long timeAfter = System.nanoTime();
        System.out.println(timeAfter-timeBefore);
    }

    private static Boolean linearSearch(int[] arr, int val) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return true;
            }
        }
        return false;
    }
}
