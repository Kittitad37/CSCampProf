package Day6.Labs;
public class BSTtest {
    public static void main(String[] args) {
        BST bst = new BST();

        System.out.println(bst.getRoot());

        bst.insert(8);
        bst.insert(10);
        bst.insert(3);
        bst.insert(6);
        bst.insert(15);
        bst.insert(1);
        
        


         //bst.printPreOrderRecurse(bst.getRoot());
         //bst.printInOrderRecurse(bst.getRoot());
         //bst.printPostOrderRecurse(bst.getRoot());

         System.out.println("\nBFS : ");
         bst.BFS(bst.getRoot());
         
         System.out.println("\nDFS :");
         bst.DFS(bst.getRoot());

    }
}
