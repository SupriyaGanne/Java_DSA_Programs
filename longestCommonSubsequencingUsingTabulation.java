import java.util.*;

public class longestCommonSubsequencingUsingTabulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string X length");
        int m = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter String X");
        String X = sc.nextLine();
        System.out.println("Enter string Y length");
        int n = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter String Y");
        String Y = sc.nextLine();
        
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) != Y.charAt(j - 1)) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }
        System.out.println(dp[m][n]);
        int i = m, j = n;
        StringBuilder lcs = new StringBuilder();
        while (i > 0 && j > 0) {
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                lcs.insert(0, X.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        
        System.out.println("Longest Common Subsequence: " + lcs.toString());
        }
         
    }

