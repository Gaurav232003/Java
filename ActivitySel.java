import java.util.*;
public class ActivitySel{
    public static void main(String args[]){
        int arr1[] = {1,3,0,5,8,5};
        int arr2[] = {2,4,6,7,9,9};
        int c=1,ce=0;
        System.out.print(0+" ");
        for(int i=1;i<arr2.length;i++){
           if(arr1[i]>=arr2[ce]){
              c++;
              ce=i;
              System.out.print(i+" ");
           }
        }
        System.out.println("\n"+c);
    }
}