package FindSumTwoNumbers;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Suppose you are given an n-element array A containing distinct integers that
 * are listed in increasing order. Given a number k, describe a recursive
 * algorithm to find two integers in A that sum to k, if such a pair exists.
 * What is the running time of your algorithm?
 */
public class Solution {

    static Map<Integer, Integer> n;

    public static void main(String[] args) {
        n = new HashMap();
        Random rand = new Random();
        int arr[] = new int[rand.nextInt(10) + 5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            n.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int k = rand.nextInt(80)+1;
        System.out.println(k);
        System.out.println(solve(arr, k, 0));
    }
// O(n)
    public static Boolean solve(int[] arr, int k, int curr) {
        if (curr >= arr.length) {
            return false;
        }
        if (n.containsKey(k - arr[curr])) {
            return true;
        }
        
        return solve(arr, k, curr+1);
    }

}
