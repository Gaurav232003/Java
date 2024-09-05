import java.util.*;
public class largeststring{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String arr[] = {"apple","Banana","Grapes"};
        String largest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(largest.compareToIgnoreCase(arr[i])<0)
            largest = arr[i];
        }
        System.out.println(largest);
    }
}