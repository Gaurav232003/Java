import java.util.*;
public class test{
    public static void solve(int n)
    {
       if(n==1) {System.out.println("1");return;}
       else{
           solve(n-1);
           System.out.println(n);
           
       }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        solve(n);
    }
}