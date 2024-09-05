import java.util.*;
public class binomialcoeff{
    public static int fact(int n)
    {
         int f=1;
         for(int i=2;i<=n;i++)
         f*=i;  
         return f;
    }
    public static void main(String args[]){
        int n=5,r=2;
       System.out.println(fact(n)/(fact(r)*fact(n-r)));
    }
}