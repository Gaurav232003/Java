import java.util.*;
public class addfirstll{
    public static class Node{
        int data;
        Node next;
     
     public Node(int data){
        this.data = data;
        this.next = null;
     }
   
    }
    public static Node head;
    public static Node tail;
    public static int size;

    void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head==null){
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head= newNode;
    }
    void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next = newNode;
        tail=newNode;
    }
    void addMiddle(int data,int index){
        if(index==0){
            addFirst(data);return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }  
        newNode.next = temp.next;
        temp.next = newNode; 
    }       
    void removeFirst(){
        if(size ==0){
            System.out.println("Linked List is already empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            size--; return;
        }
        head = head.next;
        size--;
    }
    void removeLast(){
        if(size ==0){
            System.out.println("Linked List is already empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            size--;
            return;
        }
    
    Node temp=head;
    for(int i=0;i<size-2;i++)
    temp = temp.next;
    temp.next=null;
    tail=temp;
    size--;
}
    void removeMid(int index){
         
    Node temp=head;
    for(int i=0;i<index-1;i++)
    temp = temp.next;
    temp.next=temp.next.next;
    size--;
    }
    void removeFromEnd(int index){
        removeMid(size-index);
    }
void search(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                System.out.println(i);
                return;
            }
            temp = temp.next;
            i++;
        }
        System.out.println(-1);
    }
    void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    Node findMid(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    void palin(){
        Node mid =findMid();
        
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        while(left!=null || right!=null){
            if(left.data != right.data){
                System.out.println("Not a Palindrome");
                return;
            }
            left=left.next;
            right=right.next;
        }
        System.out.println("Palindrome");
    }
    boolean checkCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle=true;
               break;
            }
        }
        if(!cycle)return;
        slow = head;
        Node prev = null;
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    void print()
    {
        Node temp = head;
        System.out.println("Size = "+ size);
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String args[])
    {
        addfirstll a = new addfirstll();
        a.addFirst(4);
        a.addFirst(5);
        a.addLast(3);
        a.addLast(2);
        a.addLast(1);
        // a.search(0);
        // a.removeFirst();
        // a.removeLast();
        // a.removeFromEnd(2);
        a.reverse();
        // a.print();
        // a.palin();
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // a.removeCycle();
        a.print();
    }
}