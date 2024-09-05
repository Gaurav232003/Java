import java.util.*;
public class Container{
    public static int storeWater(ArrayList<Integer> height){
            int max=0;
            int lp=0;
            int rp=height.size()-1;

            while(lp<rp){
                int water = Math.min(height.get(lp),height.get(rp)) * (rp-lp);
                max = Math.max(max,water);
                if(height.get(lp)<height.get(rp)) lp++;
                else rp--;
            }

            return max;
        }
    public static void main(String args[]){
        
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}