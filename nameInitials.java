import java.util.*;
public class nameInitials{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String str=sc.nextLine();
        int n=str.length();
        System.out.print(str.charAt(0)+" ");

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='\t' || ch==' '){
                System.out.println(str.charAt(i+1)+ " ");
            }
        }

    }
}