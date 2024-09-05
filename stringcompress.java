import java.util.*;
public class stringcompress{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String ss = sc.next();
        int c=0;
       for(int i=0;i<ss.length()-1;i++)
       {
           if(ss.charAt(i) == ss.charAt(i+1))
           c++;
           else
           {
               if(c==0)
               System.out.print(ss.charAt(i));
               else{
                   System.out.print(ss.charAt(i) + c+1);
               }
               c=0;
           }
       }
        if(ss.charAt(ss.length()-1) == ss.charAt(ss.length()-2))
        {
            System.out.print(ss.charAt(ss.length()-1) + c+1);
        }
        else{
            System.out.print(ss.charAt(ss.length()-1) );System.out.print(ss.charAt(ss.length()-1) + c+1);
        }
    }
}