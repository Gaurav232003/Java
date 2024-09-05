import java.util.*;
public class trappingrainwater{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        if(n<=2){
        System.out.println("0");
        return;
        }
        int c=0,d=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]) c++;
            if(arr[i]<arr[i+1]) d++;
        }
        if(c==n-1 || d==n-1 ){
            System.out.println("0");
            return;
        }
         int ans=0;
        for(int i=1;i<n-1;i++)
        {
            int left=Integer.MIN_VALUE,right=Integer.MIN_VALUE;
            for(int j=0;j<i;j++)
            left=Math.max(left,arr[j]);
            for(int j=i+1;j<n;j++)
            right=Math.max(right,arr[j]);
            ans=Math.min(right,left) - arr[i] >=0? ans +Math.min(right,left) - arr[i]:ans;
        }
        System.out.println(ans);
    }
}