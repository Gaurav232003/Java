import java.util.*;
public class StackwithQueues{
    static public class StackwQ{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
           return q1.isEmpty();
        }
        public static void push(int data){
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(data);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }
        public static int pop(){
            if(q1.isEmpty())
            return -1;
            return q1.remove();
        }  
        public static int peek(){
             if(q1.isEmpty())
            return -1;
            return q1.peek();
        }
    }
    public static void main(String args[]){
        StackwQ s = new StackwQ();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}