import java.util.*;
public class longestCommonSubsequenceUsingMemoization {
	
	
	    public static int lcs(String X,String Y,int m,int n){
	        if(m==0||n==0){
	            return 0;
	        }
	        if(X.charAt(m-1) == Y.charAt(n-1)){
	            return lcs(X,Y,m-1,n-1)+1;
	        }else{
	            return   Math.max(lcs(X,Y,m-1,n),lcs(X,Y,m,n-1));
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	   
	        int m = sc.nextInt();
	     
	        String X = sc.next();
	    
	        int n = sc.nextInt();
	  
	        String Y= sc.next();
	        System.out.println(lcs(X,Y,m,n));
	    }
	}