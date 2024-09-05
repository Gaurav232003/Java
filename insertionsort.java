import java.util.*;
public class insertionsort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        for(int i=1;i<n;i++)
        {
            int cur = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > cur)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = cur;
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i] + " ");
    }
}