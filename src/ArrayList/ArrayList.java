package ArrayList;

import java.util.Arrays;

public class ArrayList<Type extends Object> {

    private Type[] arrayList;
    private int curr;

    public ArrayList() {
        arrayList = (Type[]) new Object[1];
        curr = 0;
    }

    public ArrayList(int n) {
        arrayList = (Type[]) new Object[n];
        curr = 0;
    }

    public void add(Type value) {
        if (isFull()) {
            AddSize();
        }
        arrayList[curr] = value;
        curr++;
    }

    private Boolean isEmpty() {
        return curr <= 0;
    }

    private Boolean isFull() {
        return curr >= arrayList.length;
    }

    private void AddSize() {
        Type[] newArrayList = Arrays.copyOf(arrayList, arrayList.length * 2);
        arrayList = newArrayList;
    }

    public Boolean delete(int index) {
        if (index < 0 || index >= arrayList.length) {
            return false;
        }

        if (isEmpty()) {
            return false;
        }
        int i;
        for (i = index; i < arrayList.length-1; i++) {
            if(arrayList[i] == null){
                break;
            }
            arrayList[i] = arrayList[i+1];
        }
        arrayList[i-1] = null;
        --curr;
        return true;
    }

    public Type get(int index) {
        if (arrayList[index] == null) {
            return null;
        }

        return arrayList[index];
    }

    public void printArrayList() {
        for (Type type : arrayList) {
            if (type == null) {
                break;
            }
            System.out.println(type);
        }
    }

}
