import java.io.*;
import java.util.*;

public class maxSandGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        
        int mat[][] = new int[R][C];
        
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        
        int maxsum = 0;
        for(int r=0;r<=R-3;r++)
        {
            for(int c=0;c<=C-3;c++)
            {
                int s = mat[r][c] + mat[r][c+1] + mat[r][c+2] + mat[r+1][c+1] + mat[r+2][c] + mat[r+2][c+1] + mat[r+2][c+2];
                maxsum = Math.max(maxsum,s);
            } 
        }
        
         for(int r=0;r<=R-3;r++)
         {
            for(int c=0;c<=C-3;c++)
            {
                int s = mat[r][c] + mat[r][c+1] + mat[r][c+2] + mat[r+1][c+1] + mat[r+2][c] + mat[r+2][c+1] + mat[r+2][c+2];
                if(s==maxsum)
                {
                    System.out.println(mat[r][c]+" "+mat[r][c+1]+" "+mat[r][c+2]);
                    System.out.println("  "+mat[r+1][c+1]+" ");
                    System.out.println(mat[r+2][c]+" "+mat[r+2][c+1]+" "+mat[r+2][c+2]);
                    return;
                }
            }
         }
        System.out.println(-1);
    }
}
