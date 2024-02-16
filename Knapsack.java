import java.util.*;
import java.lang.*;
public class Knapsack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        System.out.println("enter knapsack capacity");
        int W=sc.nextInt();
        System.out.println("Enter values i.e profits");
        int[] values=new int[n];
        for(int i=0;i<n;i++){
            values[i]=sc.nextInt();

        }
        System.out.println("enter weights");
        int[] weights=new int[n];
        for(int i=0;i<n;i++){
            weights[i]=sc.nextInt();
        }
        int res=knap(values,weights,n,W);
        System.out.println(res);
        

        
    }
    public static int knap(int[] val,int[] wei,int n,int W){
        int[][] dp=new int[n+1][W+1];
        for(int i=0;i<=W;i++){
            dp[0][i]=0;
        }
        for(int j=0;j<=n;j++){
            dp[j][0]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                if(wei[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wei[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
}
