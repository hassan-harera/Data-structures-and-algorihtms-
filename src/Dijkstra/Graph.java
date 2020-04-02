package Dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {

    List<edge>[] graph;
    int n;
    int[] costs;

    public Graph(int n) {

        this.n = n;
        graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        costs = new int[n];
        Arrays.fill(costs, Integer.MAX_VALUE);
        costs[0] = 0;

    }

    public void addEdge(int s, int d, int c) {
        graph[s].add(new edge(c, d));
        graph[d].add(new edge(c, s));
    }

    public void Dijkstra(int s) {
        Queue<Integer> q = new LinkedList();
        q.add(s);
        Boolean visit[] = new Boolean[n];
        Arrays.fill(visit, false);
        visit[s] = true;
        while (!q.isEmpty()) {
            int x = q.poll();
            for (edge e : graph[x]) {
                if (!visit[e.dest]) {
                    costs[e.dest] = Integer.min(costs[e.dest], costs[x]+e.cost);
                    q.add(e.dest);
                    visit[e.dest] = true;
                }
            }
        }

    }

}

class edge {

    int cost;
    int dest;

    public edge(int c, int d) {
        dest = d;
        cost = c;
    }

}
