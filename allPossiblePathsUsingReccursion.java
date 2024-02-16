import java.util.Scanner;

public class allPossiblePathsUsingReccursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = sc.nextInt();
        System.out.println("Enter number of columns");
        int n = sc.nextInt();
        System.out.println("Number of paths: " + countPaths(m, n));
    }

    public static int countPaths(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        
        return countPaths(m - 1, n) + countPaths(m, n - 1);
    }
}
