package Kruskal_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Graph {

    List<Edge>[] graph;
    int n;
    int totalCost = 0;
    int [] parent;

    
    public Graph(int n) {
        this.n = n;
        parent = new int [n+1];
        graph = new List[n + 1];
        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < n+1 ; i++) {
            parent[i] = i;
        }

    }

    public void addEdge(int s, int d, int c) {
        graph[s].add(new Edge(c, s, d));
        graph[d].add(new Edge(c, d, s));
    }

    public void kruscal() {
        PriorityQueue<Edge> q = new PriorityQueue<>();

        for (List<Edge> list : graph) {
            for (Edge edge : list) {
                q.add(edge);
            }
        }
        
        while (!q.isEmpty()) {
            Edge x = q.poll();
            if(find(x.dest) != find(x.from)){
                totalCost += x.cost;
                parent[find(x.dest)] = x.from;
            }
        }
    }
    
    public int find (int n){
        if(parent[n] == n){
            return n;
        }
        return parent[n] = find(parent[n]);
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
