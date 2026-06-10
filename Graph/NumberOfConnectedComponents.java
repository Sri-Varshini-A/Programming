import java.util.*;

public class Main {
    public static int connectedComponent(ArrayList<ArrayList<Integer>> graph,int vertex){
      boolean vis[]=new boolean[graph.size()];
      int count=0;
      for(int i=0;i<vertex;i++){
        if(!vis[i]){
          DFS(graph,vis,i); //mark visited for all nodes in that component
          count++;
        }
      }
      return count;
    }
    public static void DFS(ArrayList<ArrayList<Integer>> graph,boolean[] vis,int start){
      vis[start]=true;
      for(int i:graph.get(start)){
        if(!vis[i]){
          DFS(graph,vis,i);
        }
      }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int ver=sc.nextInt();
      int e=sc.nextInt();
      ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
      for(int i=0;i<=ver;i++){
        graph.add(new ArrayList<>());
      }
      for(int i=0;i<e;i++){
        int u=sc.nextInt();
        int v=sc.nextInt();
        graph.get(u).add(v);
        graph.get(v).add(u);  
      }
      System.out.print(connectedComponent(graph,ver));
    }
}
