import java.util.*;
public class nQueens{
    public static boolean isSafe(char arr[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(arr[i][col]=='Q') return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(arr[i][j]=='Q') return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<arr.length;i--,j++)
        {
            if(arr[i][j]=='Q') return false;
        }
        return true;
    }
    public static void Queens(char arr[][],int row){
        if(row==arr.length){
            printBoard(arr);
            return;
        }
        for(int j=0;j<arr.length;j++){
            if(isSafe(arr,row,j)){
            arr[row][j]='Q';
            Queens(arr,row+1);
            arr[row][j]='X';
            }
            
        }
    }
    public static void printBoard(char arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++)
            System.out.print(arr[i][j]);
            System.out.println();
        }
        System.out.println("---------");
    }
    public static void main(String args[]){
        int n=8;
        char arr[][] = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            arr[i][j]='X';
        }
        Queens(arr,0);
    }
}