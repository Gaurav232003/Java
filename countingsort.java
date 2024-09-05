import java.util.*;
public class countingsort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int range = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        int arr2[] = new int[range +1];
        for(int i=0;i<n;i++)
        arr2[arr[i]]++;
        int c=0;
        for(int i=0;i<=range;i++)
        {
          while(arr2[i]>0)
          {
              arr[c++] = i;
              arr2[i]--;    
          }
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i] + " ");
    }
}