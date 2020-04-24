package RearrangeOddEven;

import java.util.Random;

public class Solution {

    /*
        Write a short recursive Java method that will rearrange an array of int values
       so that all the even values appear before all the odd values. 
     */
    static int[] arr;
    static int[] rearranged;

    public static void main(String[] args) {

        Random ran = new Random();
        int n = ran.nextInt(10) + 10;

        arr = new int[n];
        rearranged = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ran.nextInt(10) + 10;
        }

        solve(0, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(rearranged[i]);
        }
    }

    /*
         O(n) time O(n) memory
    */
    public static void solve(int curr, int i, int j) {
        if (curr >= arr.length) {
            return;
        }
        if (arr[curr] % 2 == 0) {
            rearranged[i] = arr[curr];
            i++;
        } else {
            rearranged[j] = arr[curr];
            j--;
        }
        solve(curr + 1, i, j);

    }
}
