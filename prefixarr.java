import java.util.*;
public class prefixarr{
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++)
        prefix[i]=prefix[i-1]+arr[i];
        for(int i=0;i<arr.length;i++)
        {int cur=0;
            for(int j=1;j<arr.length;j++)
            cur =i==0?prefix[j]: prefix[j] - prefix[i-1];
            max=Math.max(cur,max);
            min=Math.min(min,cur);
        }
        System.out.println("Max = "+max+"\nMin = "+min);
    }
}