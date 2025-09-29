import java.io.*;
import java.util.*;

public class minKmNeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int grid[][] = new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                grid[i][j] = sc.nextInt();
            }
        }
        int dp[][] = new int[R][C];
        dp[0][0] = grid[0][0];
        
        for(int i=1;i<R;i++)
        {
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }
        
        for(int i=1;i<C;i++)
        {
            dp[0][i] = grid[0][i] + dp[0][i-1];
        }
        
        for(int i=1;i<R;i++)
        {
            for(int j=1;j<C;j++)
            {
                dp[i][j] = Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]) + grid[i][j];
            }
        }
       
        System.out.println(dp[R-1][C-1]);
    }
}
