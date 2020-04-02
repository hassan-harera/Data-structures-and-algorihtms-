package PrimAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Graph {

    List<Edge>[] graph;
    int n;
    int totalCost = 0;

    public Graph(int n) {

        this.n = n;
        graph = new List[n + 1];
        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

    }

    public void addEdge(int s, int d, int c) {
        graph[s].add(new Edge(c, s, d));
        graph[d].add(new Edge(c, d, s));
    }

    public void Prim(int s) {
        PriorityQueue<Edge> q = new PriorityQueue<>();

        for (Edge edge : graph[s]) {
            q.add(edge);
        }

        Boolean visit[] = new Boolean[n + 1];
        Arrays.fill(visit, false);

        visit[s] = true;

        while (!q.isEmpty()) {
            Edge x = q.poll();
            if (!visit[x.dest]) {
                totalCost += x.cost;
            }
            visit[x.dest] = true;
            for (Edge e : graph[x.dest]) {
                if (!visit[e.dest]) {
                    q.add(e);
                }
            }
        }
    }
}

class Edge implements Comparable<Edge> {

    int cost;
    int from;
    int dest;

    public Edge(int cost, int from, int dest) {
        this.cost = cost;
        this.from = from;
        this.dest = dest;
    }

    @Override
    public int compareTo(Edge o) {
        return cost - o.cost;
    }

}
