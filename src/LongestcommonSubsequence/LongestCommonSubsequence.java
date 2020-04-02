package LongestcommonSubsequence;

import java.util.Arrays;

public class LongestCommonSubsequence {

    int[][] matx;
    char[] str1, str2;
    int r, c;

    public LongestCommonSubsequence(String s1, String s2) {
        str1 = s1.toCharArray();
        str2 = s2.toCharArray();
        r = str1.length;
        c = str2.length;
        matx = new int[r + 1][c + 1];
        for (int i = 0; i < matx[0].length; i++) {
            Arrays.fill(matx[0], 0);
        }
    }

    public int calculat() {
        return find(r + 1, c + 1);
    }

    private int find(int i, int j) {

        for (int k = 0; k < j; k++) {
            for (int l = 0; l < i; l++) {
                if (k == 0 || l == 0) {
                    matx[l][k] = 0;
                }
                else if (str1[l - 1] == str2[k - 1]) {
                    matx[l][k] = 1 + matx[l - 1][k - 1];
                } else {
                    matx[l][k] = Integer.max(matx[l - 1][k], matx[l][k - 1]);
                }
            }
        }
        return matx[r][c];
    }
}
