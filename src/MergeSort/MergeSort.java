package MergeSort;

public class MergeSort {

    int arr[];

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void sort() {
        int l = 0, r = arr.length - 1;

        divide(l, r);

    }

    private void divide(int l, int r) {
        if (l == r) {
            return;
        }

        int mid = (l + r) / 2;
        divide(l, mid);
        divide(mid + 1, r);

        merge(l, mid, r);
    }

    private void merge(int l, int mid, int r) {
        int temp[] = arr.clone();

        int i = l, j = mid + 1;
        int c = l;

        while (i <= mid && j <= r) {
            if (temp[i] <= temp[j]) {
                arr[c] = temp[i];
                i++;
            } else {
                arr[c] = temp[j];
                j++;
            }
            c++;
        }

        while (i <= mid) {
            arr[c] = temp[i];
            i++;
            c++;
        }
        
        
        while (j <= r) {
            arr[c] = temp[j];
            j++;
            c++;
        }
    }

}

class Demo {

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        
        int [] arr = new int [] {1,5,3,7,6,4,2,8,9};
        ms.setArr(arr);
        
        ms.sort();
        arr = ms.getArr();
        
        for (int i : arr) {
            System.out.println(i);
        }
        
    }
}
