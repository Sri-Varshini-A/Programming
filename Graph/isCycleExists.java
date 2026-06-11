//UNDIRECTED GRAPH

import java.util.*;
class Pair{
  int node;
  int parent;

  Pair(int node,int parent){
    this.node=node;
    this.parent=parent;
  }
}

public class Main {
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
      boolean check=isCycle(1,ver,graph);
      if(check){
        System.out.print("Cycle exists");
      }
      else{
        System.out.print("No cycle exists");
      }
    }

    public static boolean isCycle(int start, int v,ArrayList<ArrayList<Integer>> adj){
      boolean[] vis=new boolean[v+1];
      Queue<Pair> q=new LinkedList<>();
      q.offer(new Pair(start,-1));
      vis[start]=true;
      while(!q.isEmpty())
      {
        Pair curr=q.poll();
        for(int neighbor:adj.get(curr.node))
        {
          if(neighbor==curr.parent)
          {
            continue;
          }
          if(!vis[neighbor])
          {
            vis[neighbor]=true;
            q.offer(new Pair(neighbor,curr.node));
          }
          else
          {
            return true; //cycle exists
          }
        }
      }
      return false;
    }
      
}
