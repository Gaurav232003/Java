import java.util.*;
public class selectionsort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        for(int i=0;i<n-1;i++)
        {
            int min=Integer.MAX_VALUE;int x=i;
            for(int j=i+1;j<n;j++)
            {
              if(arr[x]>arr[j])
              {
                x=j;
              }                
            }
            int t=arr[x];
            arr[x] = arr[i];
            arr[i] =t;
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }

}