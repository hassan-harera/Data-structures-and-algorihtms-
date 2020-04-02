package SegmentTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SegmentTreeMinimum {

    static Node[] arr;
    static Node[] segs;
    static int c;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        StringBuilder sb = new StringBuilder();

        c = 0;
        int n = Integer.parseInt(in.readLine());

        segs = new Node[n * 2 - 1];

        arr = new Node[n];
        for (int i = 0; i < arr.length; i++) {
            int val = Integer.parseInt(in.readLine());
            arr[i] = new Node(i, i, val);
        }

        int q = Integer.parseInt(in.readLine());
        int[][] ques = new int[q][2];
        for (int i = 0; i < q; i++) {
            stk = new StringTokenizer(in.readLine());
            ques[i][0] = Integer.parseInt(stk.nextToken());
            ques[i][1] = Integer.parseInt(stk.nextToken());
        }
        buildSegTree(0, n - 1, 0);

        for (int i = 0; i < q; i++) {
            System.out.println(getMin(ques[i][0], ques[i][1], 0));
        }
        System.out.println(c);
    }

    private static int buildSegTree(int s, int e, int curr) {
        if (curr >= segs.length) {
            return Integer.MAX_VALUE;
        }

        if (s == e) {
            int c = arr[s].value;
            segs[curr] = new Node(s, e, c);
            return c;
        }
        int mid = (s + e) / 2;
        int min  = Integer.min(buildSegTree(s, mid, curr * 2 + 1) , buildSegTree(mid + 1, e, curr * 2 + 2));
        segs[curr] = new Node(s, e, min);

        return min;
    }

    private static int getMin(int cule, int curi, int curr) {
        c++;
        int l = segs[curr].left;
        int r = segs[curr].right;
        if (l >= segs.length || r >= segs.length) {
            return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;
        int mid = (l + r) / 2;

        if (l == r) {
            int c = arr[cule].value;
            return c;
        }
        if (cule == curi) {
            int c = arr[cule].value;
            return c;
        }

        if (l > curi || r < cule) {
            return Integer.MAX_VALUE;
        } else if (l >= cule && l <= curi && r >= cule && r <= curi) {
            return segs[curr].value;
        }
        if (mid <= r && mid >= l) {
            min = Integer.min(getMin(cule, curi, curr * 2 + 1) , min);
        }
        if (mid + 1 >= l && mid + 1 <= r) {
            min = Integer.min(getMin(cule, curi, curr * 2 + 2) , min);
        }
        return min;
    }
}
