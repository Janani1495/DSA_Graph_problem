import java.util.*;
public class Main1 {
    static class Pair {
        char vertex, parent;
        int weight;
        Pair(char v, char p, int w) {
            vertex = v;
            parent = p;
            weight = w;
        }
    }
    public static void main(String[] args) {
        int V = 6;
        Map<Character, List<Pair>> graph = new HashMap<>();
        for (char c = 'a'; c < 'a' + V; c++) {
            graph.put(c, new ArrayList<>());
        }
        addEdge(graph, 'a', 'b', 2);
        addEdge(graph, 'a', 'c', 3);
        addEdge(graph, 'b', 'c', 1);
        addEdge(graph, 'b', 'd', 4);
        addEdge(graph, 'c', 'd', 5);
        addEdge(graph, 'c', 'e', 6);
        addEdge(graph, 'd', 'e', 7);
        prim(graph, 'a');
    }
    static void addEdge(Map<Character, List<Pair>> graph, char u, char v, int w) {
        graph.get(u).add(new Pair(v, u, w));
        graph.get(v).add(new Pair(u, v, w));  
    }
    static void prim(Map<Character, List<Pair>> graph, char start) {
        Set<Character> visited = new HashSet<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.weight));
        pq.offer(new Pair(start, '-', 0));
        int totalCost = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            if (visited.contains(curr.vertex)) {
                continue;
            }
            visited.add(curr.vertex);
            if (curr.parent != '-') {
                System.out.println(curr.parent + " - " + curr.vertex + " : " + curr.weight);
                totalCost += curr.weight;
            }
            for (Pair neighbor : graph.get(curr.vertex)) {
                if (!visited.contains(neighbor.vertex)) {
                    pq.offer(new Pair(neighbor.vertex, curr.vertex, neighbor.weight));
                }
            }
        }
        System.out.println("Total Minimum Cost: " + totalCost);
    }
}
