import java.util.*;
import java.lang.*;
public class allPossiblePaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m=sc.nextInt();
        System.out.println("Enter number of columns");
        int n=sc.nextInt();
        int[][] dp=new int[m][n];
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        System.out.println(dp[m-1][n-1]);
    

    }
}
