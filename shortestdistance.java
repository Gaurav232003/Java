import java.util.*;
public class shortestdistance{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String ss = sc.next();
        int arr[] = new int[2];
        for(int i=0;i<ss.length();i++)
        {
            if(ss.charAt(i)=='N') arr[0]++;
            if(ss.charAt(i)=='S') arr[0]--;
            if(ss.charAt(i)=='E') arr[1]++;
            if(ss.charAt(i)=='W') arr[1]--;
        }
        int dist =(int) Math.sqrt(Math.pow(arr[0],2) + Math.pow(arr[1],2));
        System.out.println(dist);
    }
}