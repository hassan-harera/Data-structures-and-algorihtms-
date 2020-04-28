package MiniAndMax;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Describe a method for finding both the minimum and maximum of n numbers using
 * fewer than 3n/2 comparisons. (Hint: First construct a group of candidate
 * minimums and a group of candidate maximums.)
 */
public class Solution {

    public static void main(String[] args) {
        Random rand = new Random();
        
        int arr[] = new int[rand.nextInt(5) + 15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20)+20;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int min = arr[0];
        int max = arr[0];

        // O(n)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < max) {
                min = Integer.min(min, arr[i]);
            } else {
                max = Integer.max(max, arr[i]);
            }
        }
        System.out.println("\n" + min);
        System.out.println(max);
    }

}
