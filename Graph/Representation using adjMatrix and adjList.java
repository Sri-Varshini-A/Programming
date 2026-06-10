import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int vertex=sc.nextInt();
      int edge=sc.nextInt();
      //adj matrix
      int graph[][]=new int[vertex+1][vertex+1];
      for(int row=0;row<edge;row++){
        int vertex1=sc.nextInt();
        int vertex2=sc.nextInt();
        graph[vertex1][vertex2]=1;
        graph[vertex2][vertex1]=1;
      }
      //print adj matrix
      for(int i=1;i<=vertex;i++){
          for(int j=1;j<=vertex;j++){
            System.out.print(graph[i][j]+" ");
          }
          System.out.println();
      }

      //adj list
      // ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
      // for(int ind=0;ind<vertex+1;ind++){
      //   graph.add(new ArrayList<>());
      // }
      // for(int ind=0;ind<edge; ind++){
      //   int u=sc.nextInt();
      //   int v=sc.nextInt();
      //   graph.get(u).add(v);
      //   graph.get(v).add(u);
      // }
      // //print adj list
      // for(int i=0;i<vertex+1;i++){
      //   System.out.print(i+"->");
      //   for(int v:graph.get(i)){
      //     System.out.print(v+" ");
      //   }
      //   System.out.println();
      //}
    }
}
