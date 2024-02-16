import java.util.*;
import java.lang.*;
public class editDistanceUsingTabulation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1");
        String s1=sc.nextLine();
        System.out.println("Enter string 2");
        String s2=sc.nextLine();
        int m=s1.length();
        int n=s2.length();
        int res=edit(s1,s2,m,n);
        System.out.println(res);        
        
    }
    public static int edit(String s1,String s2,int m,int n){
        int[][] dp=new int[m+1][n+1];
        dp[0][0]=0;
        for(int i=1;i<=m;i++){
            dp[i][0]=dp[i-1][0]+1;
        }
        for(int i=1;i<=n;i++){
            dp[0][i]=dp[0][i-1]+1;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }
            }
        }
        return dp[m][n];
    }
}
