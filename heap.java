import java.util.*;
public class heap{
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;
            int par = (x-1)/2;
            while(arr.get(x)<arr.get(par)){  //O(log n)
                //swap 
                int t = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,t);
                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            if(arr.size()>0)
            return arr.get(0);
            else return -1;
        }
        public void print(){

            for(int i=0;i<arr.size();i++)
            {
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }

        private void heapify(int i){

            int left = 2*i +1;
            int right = 2*i + 2;
            int m = i;
            if(left<arr.size() && arr.get(m)>arr.get(left))
            m=left;
            if(right<arr.size() && arr.get(m)>arr.get(right))
            m = right;

            if(m!=i){
            int t = arr.get(i);
            arr.set(i,arr.get(m));
            arr.set(m,t);
            heapify(m);
            }
            
        
        }
        public int remove(){
            int x = arr.get(0);
            int t = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,t);
            arr.remove(arr.size()-1);

            heapify(0);
            return x;
        }
    }
    

    public static void main(String args[]){
        Heap h1 = new Heap();
        h1.add(3);
        
        h1.add(4);
      
        h1.add(1);
        
        h1.add(5);
        for(int i=0;i<4;i++){
            System.out.println(h1.peek());
            h1.remove();
        }
    }
}
