import java.util.*;
public class calcClass{
    public static void main(String args[]){
    System.out.println("Enter 1 for add, 2 for sub or 3 for multiplication");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("Enter 2 Numbers");
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a==1)
    System.out.println(c+b);
    else if(a==2)
    System.out.println(b-c);
    else if(a==3)
    System.out.println(c*b);
    else
    System.out.println("Invalid");
}
}