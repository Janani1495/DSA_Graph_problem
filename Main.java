// import java.util.*;
// class Main{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int mon=sc.nextInt();
//         int banana=sc.nextInt();
//         int peanut=sc.nextInt();
//         int tot_banana=sc.nextInt();
//         int tot_peanut=sc.nextInt();
//         int count=0;
//         while(tot_banana>0){
//             tot_banana-=banana;
//             count++;
//         }
//         while(tot_peanut>0){
//             tot_peanut-=peanut;
//             count++;
//         }
//         if(banana==0 || peanut==0 || tot_banana==0 || tot_peanut==0){
//             System.out.print("Invalid input");
//         }
//         System.out.print(count);

//     }
// }

// import java.util.*;
// class Main{
//     public static void main(String[]args){
//         int V=5;
//         Graph g=new Graph();
//         g.addedge('a','B');
//         g.addedge('a','c');
//         g.addedge('B','d');
//         g.bfs('d');
//     }
// }
// class Graph{
//     int V;
//    Map<Character,List<Character>>list=new HashMap<>();
    
//     public void addedge(char u,char v){
//         if(!list.containsKey(u)){
//             list.put(u,new ArrayList<>());
//         }list.get(u).add(v);
//         if(!list.containsKey(v)){
//             list.put(v,new ArrayList<>());
//         }list.get(v).add(u);
//     }
//     public void bfs(char c){
//         HashSet<Character>visited=new HashSet<>();
//         Queue<Character>q=new LinkedList<>();
//         List<Character>l=new ArrayList<>();
//         q.add(c);
//         visited.add(c);
//         while(!q.isEmpty()){
//             char cur=q.poll();
//             System.out.print(cur+" ");
//            l.add(cur);
//            for(char arr:list.get(cur)){
//               if(!visited.contains(cur)){
//                   q.add(cur);
//                   visited.add(cur);
//               }
//             System.out.print(arr+" ");
//            }
//         }
//     }
//  }

 import java.util.*;
 class Main{
    public static void main(String[]args){
        int V=5;
        Map<Character,List<Integer>>map=new HashMap<>();

    }
 }