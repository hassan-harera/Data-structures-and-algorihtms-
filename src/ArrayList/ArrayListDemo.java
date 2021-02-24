package ArrayList;

import MergeSort.MergeSort;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        MergeSort mergeSort = new MergeSort();
        mergeSort.setArr(new int [] {1,5,6,2,3,8,5});
        mergeSort.sort();
        int arr [] = mergeSort.getArr();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        ArrayList<Integer> list = new ArrayList<>(in.nextInt());

        int n = in.nextInt();

        while (n-- > 0) {
            list.add(in.nextInt());
        }
        int d = in.nextInt();

        while (d-- > 0) {
            list.delete(in.nextInt());
        }
        list.printArrayList();

    }

}
