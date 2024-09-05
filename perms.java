import java.util.*;
public class perms{
    public static void perm(String ss, String ans){
        if(ss.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ss.length();i++)
        {
            perm(ss.substring(0,i)+ss.substring(i+1),ans+ss.charAt(i));
        }
    }
    public static void main(String args[]){
        String ss="abc";
        perm(ss,"");
    }
}