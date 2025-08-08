// import java.util.*;
// public class Main3 {
//     static class Pair {
//         char vertex, parent;
//         int weight;
//         Pair(char v, char p, int w) {
//             vertex = v;
//             parent = p;
//             weight = w;
//         }
//     }
//     public static void main(String[] args) {
//         int V = 6;
//         Map<Character, List<Pair>> graph = new HashMap<>();
//         for (char c = 'a'; c < 'a' + V; c++) {
//             graph.put(c, new ArrayList<>());
//         }
//         addEdge(graph, 'p', 'q', 4);
//         addEdge(graph, 'q', 'r', 1);
//         addEdge(graph, 's', 't', 2);
//         addEdge(graph, 't', 'u', 3);
//         prim(graph, 'p');
//     }
//     static void addEdge(Map<Character, List<Pair>> graph, char u, char v, int w) {
//         graph.get(u).add(new Pair(v, u, w));
//         graph.get(v).add(new Pair(u, v, w));  
//     }
//     static void prim(Map<Character, List<Pair>> graph, char start) {
//         Set<Character> visited = new HashSet<>();
//         PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.weight));
//         pq.offer(new Pair(start, '-', 0));
//         int totalCost = 0;
//         while (!pq.isEmpty()) {
//             Pair curr = pq.poll();
//             if (visited.contains(curr.vertex)) {
//                 continue;
//             }
//             visited.add(curr.vertex);
//             if (curr.parent != '-') {
//                 System.out.println(curr.parent + " - " + curr.vertex + " : " + curr.weight);
//                 totalCost += curr.weight;
//             }
//             for (Pair neighbor : graph.get(curr.vertex)) {
//                 if (!visited.contains(neighbor.vertex)) {
//                     pq.offer(new Pair(neighbor.vertex, curr.vertex, neighbor.weight));
//                 }
//             }
//         }
//         System.out.println("Total Minimum Cost: " + totalCost);
//     }
// }


//prims algorithm
import java.util.*;
class Main{
    static class pair{
        char vertex;
        char parent;
        int weight;
        pair(char v,char p,int w){
            vertex=v;
            parent=p;
            weight=w;
        }
    } 
    public static void prim(Map<Character,List<Integer>graph,char c){
        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.comparingInt(a->a,w));
        pq.add(new pair('a',))
    }
    public void addedge(Map<Character,List<
    )
    public static void main(String[]args){
        int V=5;
        Map<Character,List<Integer>>graph=new Hashmap<>();
        for(char c='a';c<'a'+V;c++){
            graph.add(c,new ArrayList<>());
        }
         addEdge(graph, 'p', 'q', 4);
         addEdge(graph, 'q', 'r', 1);
         addEdge(graph, 's', 't', 2);
         addEdge(graph, 't', 'u', 3);
         prim(graph, 'p');
    }
}
