import java.util.*;
public class binaryString{
    public static void str(int n , int lp, String ss){
        if(n==0)
        {System.out.println(ss);
        return;}
    if(lp==0)
    str(n-1,1,ss+"1");
    str(n-1,0,ss+"0");
    }
    public static void main(String args[]){
        str(4,0,"");
    }
}