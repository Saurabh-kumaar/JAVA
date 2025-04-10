

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


//             // Height of a tree :- 

// import java.util.HashMap;
// import java.util.LinkedList;
// import java.util.Queue;

// public class BinaryTreesB {
//     static class Node {
//         int data; 
//         Node left, right; 

//         public Node(int data) {
//             this.data = data; 
//             this.left = null; 
//             this.right = null; 
//         }
//     }  


//     // find height of a tree :-

//     public static int height(Node root){
//         if(root == null ) {
//             return 0; 
//         }

//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh, rh) + 1; 
//     }  

// // =========================================================================
// // =========================================================================


//     // count Node in a tree :- 

//     public static int count(Node root) {
//         if(root == null) {
//             return 0; 
//         }

//         int leftCount = count(root.left); 
//         int rightCount = count(root.right); 
//         return leftCount + rightCount + 1;
//     }

// // =========================================================================
// // =========================================================================.

//     // sum of Nodes :- 
    
//     public static int sum(Node root) {
//         if(root == null){
//             return 0; 
//         }
//         int leftsum = sum(root.left);
//         int rightsum = sum(root.right); 
//         return  leftsum + rightsum + root.data; 
//     } 

// // =========================================================================.
// // =========================================================================.

//     // diameter :- Appproach-1 

//     public static int diameter(Node root) {
//         if(root == null) {
//             return 0; 
//         } 

//         int leftdiam = diameter(root.left); 
//         int rightdiam = diameter(root.right); 
//         int leftHt = height(root.left); 
//         int rightHt = height(root.right); 

//         int selfdiam = leftHt + rightHt + 1; 
//         return Math.max(selfdiam, Math.max(leftdiam, rightdiam));

//     }

// // =========================================================================.
// // =========================================================================.

//     public static boolean isIdentical(Node node, Node subRoot) {
//         if(node == null && subRoot == null) {
//             return true; 
//         } else if(node == null || subRoot == null || node.data != subRoot.data){
//             return false; 
//         }

//         if(!isIdentical(node.left, subRoot.left)) {
//             return false; 
//         } 
//         if(!isIdentical(node.right, subRoot.right)) {
//             return false;  
//         } 
//         return true;
//     }
//     public static boolean isSubtree(Node root, Node subRoot) {
//         if(root == null){
//             return false; 
//         }
//         if(root.data == subRoot.data) {
//             if(isIdentical(root, subRoot)) {
//                 return true; 
//              }
//         }
//         return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//     } 

//     static class Info {
//         Node node; 
//         int hd; 

//         public Info(Node node, int hd) {
//             this.node = node; 
//             this.hd = hd; 
//         }
//     } 

//     public static void topView(Node root) {
//         //level order 
//         Queue<Info> q = new LinkedList<>(); 
//         HashMap<Integer, Node> map = new HashMap<>(); 
        
//         int min = 0, max = 0; 
//         q.add(new Info(root, 0)); 
//         q.add(null); 

//         while(!q.isEmpty()) {
//             Info curr = q.remove(); 
//             if(curr == null) {
//                 if(q.isEmpty()) {
//                     break; 
//                 } else {
//                     q.add(null); 
//                 }
//             } else { 
//                 if(!map.containsKey(curr.hd)) {
//                     map.put(curr.hd, curr.node);
//                 }
    
//                 if(curr.node.left != null) {
//                     q.add(new Info(curr.node.left, curr.hd-1));
//                     min = Math.min(min, curr.hd-1); 
//                 }
    
//                 if(curr.node.right != null) {
//                     q.add(new Info(curr.node.right, curr.hd+1));
//                     max = Math.max(max, curr.hd+1);
//                 }
//             }   
//         }

//         for(int i=min; i<max; i++) {
//             System.out.print(map.get(i).data+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String args []){ 

//         /*
//                  1
//                 / \
//                2   3
//               / \ / \
//              4  5 6  7

//         */ 

//         Node root = new Node(1); 
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);   

//         /* 
//                  2              subtree 
//                 / \
//                4   5
//         */
//         Node subRoot = new Node(2); 
//         subRoot.left = new Node(4); 
//         // subRoot.right = new Node(5); 


//      // System.out.println("total height is = " + height(root));
//         // System.out.println(count(root)); 
//         // System.out.println("total sum is = " + sum(root));
//         // System.out.println(diameter(root)); 

//         // System.out.println(isSubtree(root, subRoot)); 
//         topView(root);
        
//     }
// }



// ======================================================================================================================================== 
// ========================================================================================================================================

 

// Part 2 :- 
 


// import java.util.*; 

// public class BinaryTreesB { 

//     static class Node { 
//         int data; 
//         Node right , left; 

//         public Node(int data) {
//             this.data = data; 
//             this.left = null; 
//             this.right = null; 
//         }
//     }

// // ======================================================================
// // ======================================================================

//     // find max value in a tree :- 

//     // public static int findMax (Node root) {
//     //     if(root == null) {
//     //     return Integer.MIN_VALUE;
//     //     }  
//     //     int rightMax = findMax(root.right); 
//     //     int leftMax = findMax(root.left); 
//     //     return Math.max(root.data, Math.max(rightMax, leftMax)); 
//     // } 


// // ====================================================================== 
// // ======================================================================

//     // find min value in a tree :- 

//     public static int findMin(Node root) {
//         if(root == null) {
//             return Integer.MAX_VALUE;
//         } 
//         int rightMin = findMin(root.right); 
//         int leftMin = findMin(root.left);
//         return Math.min(root.data, Math.max(rightMin, leftMin)); 
//     }

//     public static void main(String args []) { 

//         Node root = new Node(1); 
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);  

//         // System.out.println(findMax(root));  
//         // System.out.println(findMin(root)); 

//     }
// }


// ========================================================================================================
// ======================================================================================================== 


//             // Kth level of a tree  :- 


// import java.util.*; 

// public class BinaryTreesB {  

//     static class Node{
//         int data; 
//         Node left, right; 

//         public Node(int data) {
//             this.data = data; 
//             this.left = null; 
//             this.right = null; 
//         }
//     }

//     public static void KLevel(Node root, int level, int k) { 
//         if(root == null) {
//             return; 
//         } 

//         if(level == k ) {
//             System.out.print(root.data+" ");
//             return;
//         } 

//         KLevel(root.left, level+1, k); 
//         KLevel(root.right, level+1, k); 
//     }

//     public static void main(String args[]) {   
        
        
//          /*
// //                  1
// //                 / \
// //                2   3
// //               / \ / \
// //              4  5 6  7

// //         */ 


//         Node root = new Node(1); 
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);  
        
//         int k = 3; 
//         KLevel(root, 1, k); 
        

//     }
// }




// ======================================================================================================== 
// ======================================================================================================== 


        // Lowest common ancestor :- 



// import java.util.*; 

// public class BinaryTreesB {  

//     static class Node {
//         int data; 
//         Node right, left; 

//         public Node(int data) {
//             this.data = data; 
//             this.right = null; 
//             this.left = null; 

//         } 

//         public static boolean getPath(Node root, int n, ArrayList<Node> path) {
//             if(root == null) {
//                 return false; 
//             }

//             path.add(root); 

//             if(root.data == n) {
//                 return true; 
//             } 

//             boolean foundLeft = getPath(root.left, n, path); 
//             boolean foundRight = getPath(root.right, n, path); 

//             if(foundLeft || foundRight) {
//                 return true; 
//             } 

//             path.remove(path.size()-1); 
//             return false; 
//         }

//         // lca 
//         public static Node lca(Node root, int n1, int n2) {
//             ArrayList<Node> path1 = new ArrayList<>(); 
//             ArrayList<Node> path2 = new ArrayList<>(); 

//             getPath(root, n1, path1); 
//             getPath(root, n2, path2); 

//             // last common ancestor 
//             int i = 0; 
//             for(; i<path1.size() && i<path2.size(); i++) {
//                 if(path1.get(i) != path2.get(i)) {
//                     break; 
//                 }
//             } 

//             // last equal node -> i-1th 
//             Node lca = path1.get(i-1); 
//             return lca; 
//         }
//     }


// // ==========================================================================================
// // ==========================================================================================

//     // approach 2 :-  lowest common ancestor 
    
//     public static Node lca2(Node root, int n1, int n2) {
//         if(root.data == n1 || root.data == n2) {
//             return root; 
//         } 

//         Node leftLca = lca2(root.left, n1, n2); 
//         Node rightLca = lca2(root.right, n1, n2); 

//         if(rightLca == null) {
//             return leftLca; 
//         } 
//         if(leftLca == null) {
//             return rightLca; 
//         } 
//         return root; 
//     }

//     // ==========================================================================================
//     // ==========================================================================================

//     // Minimum distance between 2 nodes : 


//     // public static int lcaDist(Node root, int n) {
//     //     if(root == null) {
//     //         return -1; 
//     //     } 

//     //     if(root.data == n) {
//     //         return 0; 
//     //     }

//     //     int leftDist = lcaDist(root.left, n); 
//     //     int rightDist = lcaDist(root.right, n); 

//     //     if(leftDist == -1 && rightDist == -1) {
//     //         return -1; 
//     //     } else if (leftDist == -1) {
//     //         return rightDist+1; 
//     //     } else {
//     //         return leftDist+1;
//     //     }
//     // }

//     // public static int minDist(Node root, int n1, int n2) {
//     //     Node lca = lca2(root, n1, n2); 
//     //     int dist1 = lcaDist(root, n1); 
//     //     int dist2 = lcaDist(root, n2); 

//     //     return dist1 + dist2; 
//     // } 


// // ======================================================================= 
// // =======================================================================



//     // Kth ancestor :- 

//     public static int KAncestor(Node root, int n, int k) { 
//         if(root == null) {
//             return -1; 
//         }
//         if(root.data == n) {
//             return 0;  

//         }

//         int leftDist = KAncestor(root.left, n, k); 
//         int rightDist = KAncestor(root.right, n, k); 

//         if(leftDist == -1 && rightDist == -1) {
//             return -1; 
//         } 

//         int max = Math.max(leftDist, rightDist); 
//         if(max+1 == k) {
//             System.out.println(root.data);
//         }
//         return max+1; 

//     }

//     public static void main(String args []) { 

//         Node root = new Node(1); 
//                 root.left = new Node(2);
//                 root.right = new Node(3);
//                 root.left.left = new Node(4);
//                 root.left.right = new Node(5);
//                 root.right.left = new Node(6);
//                 root.right.right = new Node(7);   

//                 /*
// // //                  1
// // //                 / \
// // //                2   3
// // //               / \ / \
// // //              4  5 6  7

// // //           */ 

//                 int n = 5, k = 4; 
//                 // System.out.println(Node.lca(root, n1, n2).data);  
//                 // System.out.println(minDist(root, n1, n2)); 
//                 KAncestor(root, n, k);  // ---kAncestor 


//     }
// }




// ==========================================================================================
// ==========================================================================================

    // Transform of sumTree :- 

 
// import java.util.*;
// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//          Node (int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static int transform(Node root) {
//         if (root == null) {
//             return 0;
//         }
//         int leftChild = transform(root.left);
//         int rightChild = transform(root.right);

//         int data = root.data; 
//         int newLeft = root.left == null ? 0 : root.left.data; 
//         int newRight = root.right == null ? 0 : root.right.data; 

//         root.data = newLeft + leftChild + newRight + rightChild; 
//         return data; 

//       }

//     public static void preorder(Node root) {
//         if(root == null ) {
//             return;
//         }
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }
//     public static void main(String args[]) {
//                 /* 
//                         1
//                        /  \
//                       2    3
//                      / \  / \
//                     4   5 6  7

//                     Expected sum tree is 

//                         27
//                        /  \
//                       9    13
//                      / \  /  \
//                     0   00    0
//            */
//            Node root = new Node(1);
//            root.left = new Node (2);
//            root.right = new Node (3);
//            root.left.left = new Node(4);
//            root.left.right = new Node(5);
//            root.right.left = new Node(6);
//            root.right.right = new Node (7);

 
//         transform(root);
//         preorder(root);
//     }
// }













