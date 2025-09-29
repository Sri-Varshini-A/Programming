import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String s1[] = sc.nextLine().split(" ");
        int days[] = new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            days[i] = Integer.parseInt(s1[i]);
        }
        
        int cost[] = new int[3];
        for(int p=0;p<3;p++)
        {
            cost[p] = sc.nextInt();
        }
        
        int maxElement = Integer.MIN_VALUE;
        for(int i=0;i<days.length;i++)
        {
            maxElement = Math.max(maxElement, days[i]);
        }
  
        int dp[] = new int[maxElement+1];
        dp[0] = 0;
        
        HashSet<Integer> h = new HashSet<>();
        for(int d=0;d<days.length;d++)
        {
            h.add(days[d]);
        }
        
        for(int i=1;i<maxElement+1;i++)
        {
            if(!h.contains(i))
            {
                dp[i] = dp[i-1];
            }
            else
            {
                int one = dp[i-1] + cost[0];
                int seven = (i-7<0)? dp[0]+cost[1] : dp[i-7]+cost[1];
                int thirty = (i-30<0)? dp[0]+cost[2] : dp[i-30]+cost[2];
                
                dp[i] = Math.min(Math.min(one,seven),thirty);
            }
        }
        
        System.out.println(dp[maxElement]);
    }
}
