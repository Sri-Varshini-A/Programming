import java.util.*;
public class withoutChar {
	 public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter String:");
	      String s = sc.nextLine();
	      System.out.println("Enter target:");
	      char target = sc.next().charAt(0);
	      StringBuilder sb = new StringBuilder();
	      System.out.println(transform(s,s.length(),target,0,sb));
	 }
	 public static String transform(String s, int n, char target, int i, StringBuilder sb){
	        if(i==n)
	        {
	          return new String(sb);
	        }
	        if(s.charAt(i)!=target)
	        {
	          sb.append(s.charAt(i));
	        }
	        return transform(s,n,target,i+1,sb);
	 }
}
