import java.util.*;
public class SumPair{
     public static boolean sum(ArrayList<Integer> list , int target){
            int lp = 0;
            int rp = list.size()-1;
            while(lp<rp){
                if(list.get(lp)+list.get(rp) == target){
                    System.out.println(list.get(lp) +" + "+list.get(rp) +" = "+target );
                    return true;
                }
                if(list.get(lp)+list.get(rp) > target){
                    if(list.get(lp)>list.get(rp)) lp++;
                    else rp--;
                }
                else{
                    if(list.get(lp)<list.get(rp)) lp++;
                    else rp--;
                }
            }
            return false;
        }
    public static void main(String args[]){
       
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(10);
        list.add(8);
        list.add(9);
        list.add(6);
        int target=16;
        System.out.println(sum(list,target));
    }
}