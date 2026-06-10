import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int vertex=sc.nextInt();
      int edge=sc.nextInt();

      //adj list
      ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
      for(int ind=0;ind<vertex+1;ind++){
        graph.add(new ArrayList<>());
      }
      for(int ind=0;ind<edge; ind++){
        int u=sc.nextInt();
        int v=sc.nextInt();
        graph.get(u).add(v);
        graph.get(v).add(u);
      }
      //print adj list
      System.out.println("Input ADJ LIST");
      for(int i=0;i<vertex+1;i++){
        System.out.print(i+"->");
        for(int v:graph.get(i)){
          System.out.print(v+" ");
        }
        System.out.println();
      }
      System.out.println("BFS Traversal"); 
      BFS(graph, 1);
    }

    //BFS 
    //we use a visited array & queue to get the next element
    public static void BFS(ArrayList<ArrayList<Integer>>graph,int start){
       boolean[] vis=new boolean[graph.size()];
       Queue<Integer> q=new LinkedList<>();
       vis[start]=true;
       q.add(start);
       while(!q.isEmpty()){
       int qpv=q.poll();
       //print BFS traversal
       System.out.println(qpv);
       for(int neigh: graph.get(qpv)){
         if(!vis[neigh]){
           vis[neigh]=true;
           q.add(neigh);
           }
         }
       }  
     }
}
