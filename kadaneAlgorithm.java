import java.util.*;
import java.lang.*;
public class kadaneAlgorithm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        System.out.println("Enter Array Elements");
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();

        }
        int res=largestsum(array,n);
        System.out.println("LargestSum is"+res);
        
        
    }
    public static int largestsum(int[] A,int n){
        
        int cmax=A[0];
        int max=A[0];
        for(int i=1;i<n;i++){
            cmax=Math.max(A[i],A[i]+cmax);
            max=Math.max(max,cmax);
        }
        return max;
    }
    
}
