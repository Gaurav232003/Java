import java.util.*;
public class subset{
    public static void subset(String ss,String ans,int i){
        if(i==ss.length()){
            System.out.println(ans);
            return;
        }
        subset(ss,ans+ss.charAt(i),i+1);
        subset(ss,ans,i+1);
    }
    public static void main(String args[]){
        String ss="abc";
        subset(ss,"",0);
    }
}