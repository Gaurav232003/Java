import java.util.*;
public class spiralmatrix{
    public static void solve(int arr[][],int x,int n)
    {
       int i,j;
       for(i=x;i<n-x;i++)
       System.out.print(arr[x][i]+" ");
       for(j=x+1;j<n-x;j++)
       System.out.print(arr[j][i-1]+" ");
       for(int k=n-x-2;k>=x;k--)
       System.out.print(arr[n-x-1][k]+" ");
       for(int k=n-x-2;k>=x+1;k--)
       System.out.print(arr[k][x]+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[][] = new int[n][n];
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     arr[i][j] = sc.nextInt();
        // }
        // 1  2  3  4
        // 5  6  7  8
        // 9  10 11 12
        // 13 14 15 16
        int n=4,c=1;
        int arr[][]= new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            arr[i][j] = c++;
        }
        for(int i=0;i<n/2;i++)
        solve(arr,i,n);
        if(n%2!=0)
        System.out.print(arr[n/2 +1][n/2 +1]);
    }
}