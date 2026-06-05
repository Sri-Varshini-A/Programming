import java.util.*;
public class targetIndices {
	 public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter length:");
	      int n=sc.nextInt();
	      int arr[]=new int[n];
	      for(int i=0;i<n;i++)
	      {
	        System.out.println("Enter num:");
	        arr[i]=sc.nextInt();
	      }
	      System.out.println("Enter target:");
	      int target=sc.nextInt();
	      int i=0;
	      ArrayList<Integer> ans=new ArrayList<>();
	      Check(arr,n,ans,target,i);
	      for(int a:ans)
	      {
	        System.out.print(a+" ");
	      }
	  }
      public static ArrayList<Integer> Check(int[] arr,int n, ArrayList<Integer> ans, int target,int i){
        if(i==n){
          return ans;
        }
        if(arr[i]==target){
          ans.add(i);
        }
        return Check(arr,n,ans,target,i+1);
      }
}
