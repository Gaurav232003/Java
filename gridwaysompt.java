import java.util.*;
public class gridwaysompt{
    public static int fact(int n){
        int fact =1;
        for(int i=2;i<=n;i++)
        fact*=i;
        return fact;
    }
    public static void main(String args[]){
        int n=4,m=5;
        System.out.println(fact(n+m-2)/(fact(n-1)*fact(m-1)));
    }
}