import java.util.*;
public class OOPS{
    public static void main(String args[]){
    Pen p1 = new Pen("Yellow");
    System.out.println(p1.getColor());
    p1.Setcolor("RED");
    System.out.println(p1.getColor());
    }f
}
 class Pen{
   private  String color;
   private int tip;
    Pen(String color){
    this.color = color;
    }
    String getColor(){
         return this.color;
    }
    void Setcolor(String color){
        this.color = color;
    }
    
    
}