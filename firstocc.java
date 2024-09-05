import java.util.*;
public class firstocc{
    public static int solve(int arr[],int key,int i){
      if(i==arr.length) return -1;
      if(arr[i] == key) return i;
      return solve(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        System.out.println(solve(arr,9,0));
        
    }
}