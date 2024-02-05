import java.util.*;

public class duckNumber{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long n = sc.nextLong();
        String str = String.valueOf(n);
        boolean isDuck = false;
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == '0') {
                isDuck = true;
                break;
            }

        }
        if (isDuck && str.charAt(0) != '0') {
            System.out.println(" Duck number");
        } else {
            System.out.println("Not a duck number");
        }
    }
}
