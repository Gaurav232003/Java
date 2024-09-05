import java.util.*;
public class countbits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=15,c=0;
        while(n!=0)
        {
           // O(log n)
           c+= n&1;
           n=n>>1;
        }
        System.out.println(c);
    }
}