import java.util.*;

public class minimumCostPathUsingMemoization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = sc.nextInt();
        System.out.println("Enter number of columns");
        int n = sc.nextInt();
        int[][] c = new int[m][n];
        System.out.println("Enter array elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        System.out.println("Minimum cost: " + minCostPath(c, m, n));
    }

    public static int minCostPath(int[][] c, int m, int n) {
        return minCostHelper(c, m - 1, n - 1);
    }

    private static int minCostHelper(int[][] c, int i, int j) {
        if (i == 0 && j == 0) 
            return c[0][0];
        else if (i == 0) 
            return minCostHelper(c, i, j - 1) + c[i][j];
        else if (j == 0) 
            return minCostHelper(c, i - 1, j) + c[i][j];
        else
            return Math.min(Math.min(minCostHelper(c, i - 1, j), minCostHelper(c, i, j - 1)),
                            minCostHelper(c, i - 1, j - 1)) + c[i][j];
    }
}
