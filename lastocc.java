import java.util.*;
public class lastocc{
    public static int solve(int arr[],int key,int i){
      if(i==-1) return -1;
      if(arr[i] == key) return i;
      return solve(arr,key,i-1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,4,1,7,4,3};
        System.out.println(solve(arr,4,arr.length-1));
            
    }
}