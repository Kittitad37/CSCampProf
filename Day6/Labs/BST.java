package Day6.Labs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
    Node root;
    public BST() { 
        root = null; 
    }

    public Node getRoot() {
        return root;
    }

    public class Node{
        int data;
        Node left, right;
        public Node(int d) {
            data = d;
            left = null;
            right = null;
        }

        @Override
        public String toString() {
            if(left != null && right != null){//both children
                return left.data +"<-"+ data + "->" + right.data;
            }
            else{
                if(left!=null){// left-child-only,
                    return left.data +"<-"+ data + "->null";
                }
                else if(right!=null){// right-child-only,
                    return "null<-"+ data + "->" + right.data;
                }
                else{// no child
                    return "null<-" + data + "->null";
                }
            }
        }
    }

    // insert by iteration
    public void insert(int d) {
        if (root == null) {
            root = new Node(d);
        } else {
            Node cur = root;
            while (cur != null) {
                if (d < cur.data) {//go left
                    if (cur.left != null){
                        cur = cur.left;
                    }
                    else {
                        cur.left = new Node(d);
                        return;
                    }
                } else { //go right
                    if (cur.right != null){
                        cur = cur.right;
                    }
                    else {
                        cur.right = new Node(d);
                        return;
                    }
                }
            }//while
        }
    } 

    public void printPreOrderRecurse(Node node) {
        if (node == null)
            return;
        System.out.printf("%d ", node.data);

        //System.out.println("go to left child of "+node.data);
        printPreOrderRecurse(node.left);
        //System.out.println("go to right child of "+node.data);
        printPreOrderRecurse(node.right);
    }

    public void printInOrderRecurse(Node node) {
        if (node == null)
            return;
        //System.out.println("go to left child of "+node.data);
        printInOrderRecurse(node.left);

        System.out.printf("%d ", node.data);
        //System.out.println("\ngo to right child of "+node.data);
        printInOrderRecurse(node.right);
    }

    public void printPostOrderRecurse(Node node) {
        if (node == null)
            return;
        //System.out.println("go to left child of "+node.data);
        printPostOrderRecurse(node.left);
        //System.out.println("go to right child of "+node.data);
        printPostOrderRecurse(node.right);
        System.out.printf("%d ", node.data);
        //System.out.println();
    }

    //Bread First Search
    public void BFS(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            System.out.printf("%d ", cur.data); 
            if(cur.left != null && cur.right != null){//both children
                q.add(cur.left);
                q.add(cur.right);
            }
            else{
                if(cur.left!=null){// left-child-only,
                    q.add(cur.left);
                }
                else if(cur.right!=null){// right-child-only,
                    q.add(cur.right);
                }
            }       
        }
    }

    //Depth First Search
    public void DFS(Node root){
        Stack<Node> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            Node cur = s.pop();
            System.out.printf("%d ", cur.data); 
            if(cur.left != null && cur.right != null){//both children
                s.push(cur.right);
                s.push(cur.left);
            }
            else{
                if(cur.left!=null){// left-child-only,
                    s.push(cur.left);
                }
                else if(cur.right!=null){// right-child-only,
                    s.push(cur.right);
                }
            }       
        }
    }


}
