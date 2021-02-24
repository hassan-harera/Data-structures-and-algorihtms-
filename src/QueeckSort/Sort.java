/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueeckSort;

/**
 *
 * @author Harera
 */
public class Sort {

    static int[] arr;

    public static void main(String[] args) {
        arr = new int[]{1, 30, 80, 60, 5, 6};
        sort(0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void sort(int l, int h) {
        if (l >= h) {
            return;
        }

        int pi = arr[(l + h) / 2];
        int i = l;
        int j = h;
        while (i < j) {
            while (arr[i] < pi) {
                i++;
            }

            while (arr[j] > pi) {
                j--;
            }

            if (i < j) {
                int te = arr[j];
                arr[j] = arr[i];
                arr[i] = te;
                i++;
                j--;
            }
        }
        sort(l, j);
        sort(j + 1, h);
    }
}
