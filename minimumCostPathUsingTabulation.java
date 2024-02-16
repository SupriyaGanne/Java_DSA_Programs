import java.util.*;
import java.lang.*;
public class minimumCostPathUsingTabulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m=sc.nextInt();
        System.out.println("Enter number of columns");
        int n=sc.nextInt();
        int[][] c=new int[m][n];
        System.out.println("Enter array elements");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i][j]=sc.nextInt();
            }
        }
        int[][] dp=new int[m][n];
        dp[0][0]=c[0][0];
        for(int i=1;i<n;i++){
            dp[0][i]=dp[0][i-1]+c[0][i];
        }
        for(int i=1;i<n;i++){
            dp[i][0]=dp[i-1][0]+c[i][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + c[i][j];
            }
        }
        System.out.println(dp[m-1][n-1]);
        
        
    }
}
