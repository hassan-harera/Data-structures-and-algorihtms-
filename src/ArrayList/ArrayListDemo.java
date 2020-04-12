package ArrayList;

import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

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
