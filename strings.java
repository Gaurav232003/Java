import java.util.*;
public class strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String ss=sc.nextLine();
        System.out.println(ss);
        String aa="";
        for(int i=0;i<ss.length();i++)
        {
            aa = ss.charAt(i) + aa;
        }
        System.out.println(aa);
    }
}