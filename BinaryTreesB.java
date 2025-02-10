

    // Build tree Preordoer :-  


// public class BinaryTreesB {  
//     static class Node { 
//         int data; 
//         Node left; 
//         Node right; 

//         Node(int data) {
//             this.data = data; 
//             this.left = null; 
//             this.right = null; 
//         }
//     } 

//     static class BinaryTree {
//         static int idx = -1; 
//         public static Node buildTree(int nodes[]) {
//             idx++; 
//             if(nodes[idx] == -1) {
//                 return null; 
//             }

//             Node newNode = new Node(nodes[idx]); 
//             newNode.left = buildTree(nodes); 
//             newNode.right = buildTree(nodes); 

//             return newNode; 
//         }
//     }

//     public static void main(String args[]){ 
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//         BinaryTree tree = new BinaryTree(); 
//         Node root = tree.buildTree(nodes); 
//         System.out.println(root.data);
//     }
// }



// ==================================================================================================================================== 
// ==================================================================================================================================== 



//             // all order in code :- 

// import java.util.LinkedList;
// import java.util.Queue;

// public class BinaryTreesB {  
//     static class Node { 
//         int data; 
//         Node left; 
//         Node right; 

//         Node(int data) {
//             this.data = data; 
//             this.left = null; 
//             this.right = null; 
//         }
//     } 

//     static class BinaryTree {
//         static int idx = -1; 
//         public static Node buildTree(int nodes[]) {
//             idx++; 
//             if(nodes[idx] == -1) {
//                 return null; 
//             }

//             Node newNode = new Node(nodes[idx]); 
//             newNode.left = buildTree(nodes); 
//             newNode.right = buildTree(nodes); 

//             return newNode; 
//         } 


// // ==================================================================
// // ==================================================================


//         // preorder:- 

//         public static void preOrder(Node root) {
//             if(root == null) {
//                 return; 
//             } 
//             System.out.print(root.data+" ");
//             preOrder(root.left);
//             preOrder(root.right); 
//         }

// // ====================================================================
// // ====================================================================

//         // Inorder :-  

//         public static void inOrder(Node root) {
//             if(root == null) {
//                 return; 
//             }
//             inOrder(root.left);
//             System.out.print(root.data+" "); 
//             inOrder(root.right);

//         } 

// // ====================================================================
// // ====================================================================

//         // postOrder :- 

//         public static void postOrder(Node root) {
//             if(root == null) {
//                 return; 
//             }
//             postOrder(root.left);
//             postOrder(root.right);
//             System.out.print(root.data+" ");
//         }  

// // ====================================================================
// // ====================================================================

//         // Level Order Traversal :- 
//         public static void levelOrder(Node root) {
//             if(root == null) {
//                 return; 
//             }

//             Queue<Node> q = new LinkedList<>(); 
//             q.add(root); 
//             q.add(null);

//             while(!q.isEmpty()) {
//                 Node currNode = q.remove(); 
//                 if(currNode == null) {
//                     System.out.println();   // for next line 
//                     if(q.isEmpty()) {
//                         break; 
//                     } else {
//                         q.add(null);
//                     }
//                 } else {
//                     System.out.print(currNode.data+" ");
//                     if(currNode.left != null) {
//                         q.add(currNode.left);
//                     } 
//                     if(currNode.right != null) {
//                         q.add(currNode.right); 
//                     }
//                 }
//             }
//         } 
//     } 

// // ====================================================================
// // ====================================================================

//     public static void main(String args[]){   // main  class 
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//         BinaryTree tree = new BinaryTree(); 
//         Node root = tree.buildTree(nodes);   
//       // l;'
//       System.out.println(root.data);   // its for print root l;


//         // tree.preOrder(root);        //  1 2 4 5 3 6  
//         // tree.inOrder(root);        //   4 2 5 1 3 6 
//         // tree.postOrder(root);     //    4 5 2 6 3 1 
//         tree.levelOrder(root);      //     1 2 3 4 5 6 
//     } 
// }



// ==================================================================================================================================== 
// ==================================================================================================================================== 


            // Height of a tree :- 


public class BinaryTreesB {
    static class Node {
        int data; 
        Node left, right; 

        public Node(int data) {
            this.data = data; 
            this.left = null; 
            this.right = null; 
        }
    } 

    public static int height(Node root){
        if(root == null ) {
            return 0; 
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh6 ) + 1; 
    }

    public static void main(String args []){ 

        /*
                 1
                / \
               2   3
              / \ / \
             4  5 6  7

        */ 
        
        Node root = new Node(1); 
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7); 

        System.out.println("total height is = " + height(root));
        
    }
}












































