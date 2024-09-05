import java.util.*;
public class dectobin{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n=10;
        int a=0,c=0,x=0;
        while(n!=0)
        {
           a=(n%2)*(int)Math.pow(10,x++) + a;
           n/=2;
        }
        System.out.print(a);
    }
}