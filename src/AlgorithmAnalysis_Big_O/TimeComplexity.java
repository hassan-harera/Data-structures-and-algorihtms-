package AlgorithmAnalysis_Big_O;

import java.util.Scanner;

public class TimeComplexity {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        timeOfFactorial(n);
//        System.out.println(timeOf2PowN(n));

    }

    static void timeOfN(int n) {
        for (int i = 0; i < n; i++) {
            if (n >= 1) {
                System.out.println(n);
            }
        }
    }

    static void timeOfNPow2(int n) {
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (n >= 1) {
                    System.out.println(n);
                }
            }
        }
    }

    static void timeOfNPow3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (n >= 1) {
                        System.out.println(n);
                    }
                }
            }
        }
    }

    static int timeOf2PowN(int n) {
        System.out.println("+1");
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return timeOf2PowN(n - 1) + timeOf2PowN(n - 2);
    }

    static void timeOfFactorial(int n) {
        if (n == 0) {
            return;
        }
        for (int k = 1; k < n; k++) {
            System.out.println(n);
            timeOfFactorial(k);
        }
    }

}
