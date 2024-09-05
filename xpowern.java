import java.util.*;
public class xpowern{
    public static int solve(int x,int n){
        if(n==1) return x;
        else return x*solve(x,n-1);
    }
    public static void main(String args[]){
        int x=5,n=3;
        System.out.println(solve(x,n));
    }
}