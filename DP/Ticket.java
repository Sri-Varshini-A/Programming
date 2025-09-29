/*
In the magical land of Eldoria, a wise old wizard named Eldrin plans his journey to collect rare herbs and cast protective spells across the kingdom. His travel is critical to keep dark forces at bay. However, Eldrin doesn’t fly — he rides enchanted trains operated by the Council of Realms.
The council offers him three types of travel passes:
A 1-day pass (valid only for the exact travel day),
A 7-day pass (valid for 7 consecutive days from the date of purchase),
A 30-day pass (valid for 30 consecutive days from the date of purchase).
The passes are expensive (even for a wizard), so Eldrin wants to minimize his total travel cost.
You are entrusted with helping Eldrin. Given a list of days (from day 1 to 365) on which Eldrin must travel and the cost of each type of pass, find the minimum total cost Eldrin has to pay to complete his magical journey.

Input Format
Input: days = [1,4,6,7,8,20],
costs = [2,7,15]

Constraints
1 <= days.length <= 365
1 <= days[i] <= 365
days is in strictly increasing order.
costs.length == 3
1 <= costs[i] <= 1000

Output Format
1 ≤ days[i] ≤ 365 All days are strictly increasing 1 ≤ costs[i] ≤ 1000

Sample Input 0
1 4 6 7 8 20
2 7 15
Sample Output 0
11

*/

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
