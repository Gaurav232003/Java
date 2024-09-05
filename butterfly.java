import java.util.*;
public class butterfly{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");
            // System.out.print("* ");
            // for(int k=1;k<=n;k++)
            // {
            //     if(i==1||i==n)
            // System.out.print("* ");
            // else
            // System.out.print("  ");
            // }
            // System.out.print("* ");
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}