import java.util.*;
public class removeSubstring {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter String:");
	      String s = sc.nextLine();
	      System.out.println("Enter target substring:");
	      String target = sc.nextLine();
	      int len = target.length();
	      StringBuilder sb = new StringBuilder();
	      System.out.println(transform(s,s.length(),target,len,0,sb));
	 }
	 public static String transform(String s, int n, String target, int len, int i, StringBuilder sb){
	        if(i==n)
	        {
	          return new String(sb);
	        }
	        if(s.charAt(i)==target.charAt(0))
	        {
	        	if(s.substring(i,i+len).equals(target))
	        	{
	        		return transform(s,n,target,len,i+len,sb);
	        	}
	        }
        	sb.append(s.charAt(i));
        	return transform(s,n,target,len,i+1,sb);
	 }
}
