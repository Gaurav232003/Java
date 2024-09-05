import java.util.*;
public class sudoku{
    public static void printArr(int arr[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
            System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    public static boolean isSafe(int arr[][],int i,int j,int d){
        for(int k=0;k<9;k++){
            if(arr[i][k]==d || arr[k][j]==d)
            return false;
        }
         int sr=(i/3)*3,sc=(j/3)*3;
         for(int k=sr;k<sr+3;k++){
             for(int x=sc;x<sc+3;x++){
                 if(arr[k][x]==d) return false;
             }
         }
        return true;
    }
    public static boolean solve(int arr[][],int i,int j){


      if(i==9)
      return true;

       int newI=i,newJ=j+1;
       if(j+1==9){
        newI=i+1;
        newJ=0;
       }
       if(arr[i][j]!=0){
           return solve(arr,newI,newJ);
       }

        for(int d=1;d<=9;d++){
            if(isSafe(arr,i,j,d)){
                arr[i][j]=d;
                if(solve(arr,newI,newJ))
                return true;
            }
            arr[i][j]=0;
        }
        return false;
    } 
    public static void main(String args[]){
        int arr[][] = {{0,0,8,0,0,0,0,0,0},
                       {4,9,0,1,5,7,0,0,2},
                       {0,0,3,0,0,4,1,9,0},
                       {1,8,5,0,6,0,0,2,0},
                       {0,0,0,0,2,0,0,6,0},
                       {9,6,0,4,0,5,3,0,0},
                       {0,3,0,0,7,2,0,0,4},
                       {0,4,9,0,3,0,0,5,7},
                       {8,2,7,0,0,9,0,1,3}};
        System.out.println(solve(arr,0,0));
        printArr(arr);
    }
}