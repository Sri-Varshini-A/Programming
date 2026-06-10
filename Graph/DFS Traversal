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
      System.out.println("DFS Traversal");
      boolean vis[] = new boolean[vertex+1];
      DFS(graph, vis, 1);
    }

    public static void DFS(ArrayList<ArrayList<Integer>> graph, boolean visited[], int start)
    {
        visited[start] = true;
        System.out.println(start+" ");
        for(int ind: graph.get(start))
        {
            if(!visited[ind])
            {
              DFS(graph, visited, ind);
            }
        }
    }
}
