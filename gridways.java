import java.util.*;
public class gridways{
     static int count = 0;
    public static void printGrid(int arr[][],int n,int m){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        System.out.println("--------- \n");
    }
    public static void grid(int arr[][], int n,int m,int x,int y){
       
           if(x==n-1 && y==m-1)
           {
               count++;
               arr[x][y]=1;
               printGrid(arr,n,m);
               return;
           }
           if(y!=m-1){
               arr[x][y]=1;
               grid(arr,n,m,x,y+1);
               arr[x][y]=0;
           }
           if(x!=n-1){
               arr[x][y]=1;
               grid(arr,n,m,x+1,y);
               arr[x][y]=0;

           }
    }
    public static void main(String args[]){
        int n=3,m=3;
        int arr[][] =new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            arr[i][j]=0;
        }
        
        grid(arr,n,m,0,0);
        System.out.print(count);
    }
}