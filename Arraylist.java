import java.util.*;
public class Arraylist{
    public static void main(String args[]){
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(1,5);
       
        // System.out.println(list.size());
        // for(int i=list.size()-1;i>=0;i--)
        // System.out.print(list.get(i)+" ");
        // System.out.println();
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l2.add(3);
        l2.add(4);
        mainList.add(l1);
        mainList.add(l2);
        // System.out.println(mainList);
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> cur = mainList.get(i);
            for(int j=0;j<cur.size();j++)
            System.out.print(cur.get(j)+" ");
            System.out.println();
        }
    }
}