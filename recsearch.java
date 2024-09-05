import java.util.*;
public class recsearch{
    public static void search(int arr[],int index,int key,int n){
        if(n==index)
        return;

        if(arr[index]==key)
        System.out.print(index+ " ");
        search(arr,index+1,key,n);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,2,3,1,3,6,7,6};
        search(arr,0,3,11);
    }
}