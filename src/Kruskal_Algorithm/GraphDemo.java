package Kruskal_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GraphDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;

        int n = Integer.parseInt(in.readLine());
        Graph g = new Graph(n);

        int m = Integer.parseInt(in.readLine());
        while (m-- > 0) {
            stk = new StringTokenizer(in.readLine());
            int s = Integer.parseInt(stk.nextToken());
            int d = Integer.parseInt(stk.nextToken());
            int c = Integer.parseInt(stk.nextToken());
            g.addEdge(s, d, c);
        }
        
        g.kruscal();
        System.out.println(g.totalCost);
    }
}
