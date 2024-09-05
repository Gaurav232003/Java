import java.util.*;
public class checksort_rec{
    public static boolean solve(int arr[] , int i){
        if(i==arr.length -1)
        {
            return true; 
        }
        if(arr[i]>arr[i+1])
        return false;
       return solve(arr,i+1);

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6 ,7,8,3};
        if(solve(arr,0)){
            System.out.println("Sorted");
        }
        else System.out.println("NOT SORTED");
        
    }
}