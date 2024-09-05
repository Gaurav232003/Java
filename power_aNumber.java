import java.util.*;
public class power_aNumber{
    public static void main(String args[]){
        int a=3,n=2,ans=1;
        while(n>0){
            //O(log n)
            if((n&1)==1)
            ans*=a;
            a*=a;
            n=n>>1;
        }
        System.out.println(ans);
    }
}