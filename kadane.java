import java.util.*;
public class kadane{
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int c=0,min=Integer.MIN_VALUE;
        // corner case to check if all numbers are -ve or not. If yes, print the min value of the array.
        for(int i=0;i<arr.length;i++)
        {
            c=arr[i]<0?c+1:0;
            min=Math.max(min,arr[i]);
        }
        if(c==arr.length){
            System.out.println("Max = "+min);
            return;
        }
        // Kadane Logic
        int cur=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            cur = cur+arr[i]>=0? cur+arr[i] : 0;
            max=Math.max(max,cur);
        }
        System.out.println("Max = "+max);
    }
}