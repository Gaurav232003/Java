import java.util.*;
public class S1{
    public static void solve(Stack<Integer> s, int data){
        
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        solve(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        solve(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    } 
};