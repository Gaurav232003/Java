import java.util.*;
public class fib_rec{
    public static int fib(int n){
        if(n==0 || n==1) return n;
        else return fib(n-1) + fib(n-2);
    }
    public static void main(String args[]){
        int t=7;
        System.out.println(fib(t));
    }
}