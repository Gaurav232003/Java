import java.util.*;
public class BinaryTress {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right= null;
        }
    }


    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]){
          index++;
          if(nodes[index]==-1) return null;
          Node newNode = new Node(nodes[index]);
          newNode.left = buildTree(nodes);
          newNode.right = buildTree(nodes);
          return newNode;
        }



        public static void preorder(Node root){ // O(n)

            if(root == null) {
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }



        public static void inorder(Node root){  // O(n)
 
            if(root == null) return;
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }


        public static void postorder(Node root){  // O(n)
            if(root == null) return;

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }


        public static void levelOrder(Node root){  // O(n)
            if(root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr == null) {
                    System.out.println(); 
                    if(q.isEmpty())
                    break;
                    else
                    q.add(null);
                }
                else {
                    System.out.print(curr.data+" ");
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                }
            }
        }


        public static int height(Node root){  // O(n)
            if(root==null) return 0;
            return Math.max(height(root.left),height(root.right))+1;
        }


        public static int numberOfNodes(Node root){   // O(n)
            if(root == null) return 0;
            return numberOfNodes(root.left)+ numberOfNodes(root.right) + 1;      
            }




            public static int sumOfNodes(Node root){  // O(n)
                if(root==null) return 0;
                return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
            }


            public static int diameter(Node root){ // O(n^2)
                if(root == null) return 0;

                return Math.max(Math.max(diameter(root.left),diameter(root.right)),height(root.left)+height(root.right)+1);
            } 



            static class Info{
                int diam;
                int ht;
                Info(int diam,int ht){
                    this.diam = diam;
                    this.ht = ht;
                }
            }



            public static Info diameter2(Node root){ // O(n)
               if(root == null) return new Info(0,0);

               Info leftInfo = diameter2(root.left);
               Info rightInfo = diameter2(root.right);
               return new Info(Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1),Math.max(leftInfo.ht,rightInfo.ht)+1);
            }



            public static boolean isIdentical(Node root,Node subRoot){
                if(root == null && subRoot == null)
                return true;
                else if(root == null || subRoot==null || root.data!=subRoot.data)
                return false;

                if(!isIdentical(root.left,subRoot.left))
                return false;
                if(!isIdentical(root.right,subRoot.right))
                return false;
                return true;
            }   




           public static boolean isSubtree(Node root,Node subRoot){
               if(root == null) return false;

               if(root.data==subRoot.data && isIdentical(root,subRoot))
               return true;

               return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
           }


           static class TopInfo{
               Node node;
               int hd;
              public TopInfo(Node node,int hd){
                   this.node = node;
                   this.hd = hd;
               }
           }



           public static void topView(Node root){

               // Level Order
               /*
               Hasmap ke key mai horizontal distance hai aur value mai node.
               agar koi hd exist nahi karta hashmap mai toh usko daldo..
               queue ka use karke level order karna hai taaki pehele jo dikhe woh wala value jaye map mai.
               min and max horizontal distance ke values hai taaki mai ke keys pata rahe aur traverse kar sake.
               */ 
               Queue<TopInfo> q = new LinkedList<>();
               HashMap<Integer,Node> map = new HashMap<>();
               int min=0,max=0;
               q.add(new TopInfo(root,0));
               q.add(null);
               while(!q.isEmpty()){
                   TopInfo curr = q.remove();
                   if(curr == null){
                       if(q.isEmpty()) break;
                       else q.add(null);
                   }
                   else{
                    if(!map.containsKey(curr.hd)) // first time a particular horizontal Distance is occuring
                        map.put(curr.hd , curr.node);
  
                        if(curr.node.left!=null){
                        q.add(new TopInfo(curr.node.left , curr.hd-1));
                        min = Math.min(min,curr.hd-1);
                         }

                    if(curr.node.right!=null){
                       q.add(new TopInfo(curr.node.right,curr.hd+1));
                       max = Math.max(max,curr.hd+1);
            }
                   }

             
               }
            for(int i=min;i<=max;i++)
            System.out.print(map.get(i).data+" ");
        }
    }



    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes); 
        System.out.println(tree.diameter2(root).ht+" "+ tree.height(root));
    }
}