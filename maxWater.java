import java.util.*;
public class maxWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of pillars");
        int n=sc.nextInt();
        System.out.println("Enter heights of pillars");
        int[] height=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int left=0,right=n-1;
        int maxwater=0;
        while(left<right){
            int width=right-left;
            int min=Math.min(height[left],height[right]);
            maxwater=Math.max(maxwater,width*min);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxwater);

        
    }
}
