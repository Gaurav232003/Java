import java.util.*;
public class sum_rec{
    public static int sum(int n)
    {
        if(n==1) return 1;
        else
        return n +sum(n-1);
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(sum(n));
    }
}