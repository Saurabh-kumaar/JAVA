

            // BUILD A BST(BINARY SEARCH TREE ):- 


// public class BinarySearchTree {

//     static class Node{
//         int data; 
//         Node left; 
//         Node right; 

//         Node(int data) {
//             this.data = data; 
//         }
//     }  

    // public static Node insert(Node root, int val) {
    //     if(root == null) {
    //         root = new Node(val); 
    //         return root; 
    //     } 

    //     if(root.data > val) {
    //         root.left = insert(root.left, val); 
    //     } else {
    //         root.right = insert(root.right, val);
    //     } 
    //     return root; 
    // } 

    // public static void inorder(Node root) {
    //     if(root == null) {
    //         return;
    //     }
    //     inorder(root.left);
    //     System.out.print(root.data+" ");
    //     inorder(root.right);
    // }

// // // ================================================================================== 
// // // ==================================================================================


// //     // for searching 
//     public static boolean search(Node root, int key) {
//         if(root == null) {
//             return false; 
//         } 

//         if(root.data  == key) {
//             return true;
//         } 

//         if(root.data > key) {
//             return search(root.left, key); 
//         } 
//         else {
//             return search(root.right, key); 
//         }
//     } 

//     public static void main(String args []) {
//         int values [] = {5, 1, 3, 4, 2, 7};
//         Node root = null;

//         // for searching 
//         for(int i=0; i<values.length; i++) {
//             root = insert(root, values[i]); 
//         } 

//         inorder(root); 
//         System.out.println(); 

//         if(search(root, 8)) {
//             System.out.println("found");
//         } else {
//             System.out.println("not found");
//         } 
//     }
// }




// =============================================================================
// ===============================================================================
  

        // delete node :- 


// public class BinarySearchTree { 

//     static class Node {
//         int data; 
//         Node right; 
//         Node left; 

//         Node(int data) {
//             this.data = data; 
//             this.right = null; 
//             this.left = null; 
//         }
//     }  

//     public static Node insert(Node root, int val) {

//         if(root == null) {
//             root = new Node(val); 
//                 return root; 
//         } 
        
//         if(root.data > val) {
//             root.left = insert(root.left, val); 
//         } else {
//             root.right = insert(root.right, val);
//         } 
//             return root; 
//         } 
        
//         public static void inorder(Node root) {
//             if(root == null) {
//                 return;
//             }
//             inorder(root.left);
//             System.out.print(root.data+" ");
//             inorder(root.right);
//         }  

//         // -------- delete function ------------ 

//     public static Node delete(Node root, int val) {
//         if(root.data < val) {
//             root.right = delete(root.right, val);
//         } 
//         else if(root.data > val) {
//             root.left = delete(root.left, val);
//         } 
//         else {  // voila 
//             // case 1 leaf node 
//         if(root.left == null && root.right == null) {
//             return null; 
//         } 
    
//         // case 2 - single child 
//         if(root.left == null) {
//             return root.right; 
//         } 
//         else if(root.right == null) {
//             return root.left; 
//         } 
    
//         // case 3 - both children  
//         Node IS = findInorderSuccessor(root.right); 
//         root.data = IS.data; 
//         root.right = delete(root.right, IS.data);
//         }
//         return root; 
//     } 
    
//     public static Node findInorderSuccessor(Node root){
//         while(root.left != null) {
//             root = root.left; 
//         } 
//         return root; 
//     }
    
//     public static void main(String args []) {  
//         int values [] = {5, 1, 3, 4, 2, 7};
//         Node root = null; 
        

//         for(int i=0; i<values.length; i++) {
//             root = insert(root, values[i]); 
//         } 

//         inorder(root); 
//         System.out.println(); 
//             root = delete(root, 1);
//         System.out.println();

//         inorder(root);
        
         
//     }
// }




// ====================================================================================== 
// ======================================================================================

            // find the nodes between range value 

// import java.util.*;

// public class BinarySearchTree { 

//     static class Node{
//         int data; 
//         Node right; 
//         Node left;  

//         Node(int data) {
//             this.data = data; 
//             this.right = null; 
//             this.left = null; 
//         }
//     }  

//     public static Node insert(Node root, int val) {
//         if(root == null) {
//             root = new Node(val); 
//             return root; 
//         } 

//         if(root.data > val) {
//             root.left = insert(root.left, val); 
//         } else {
//             root.right = insert(root.right, val);
//         } 
//         return root; 
//     } 

//     public static void inorder(Node root) {
//         if(root == null) {
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data+" ");
//         inorder(root.right);
//     }

//     // ---------- printInRange---------------  
//     public static void printInRange(Node root, int k1, int k2) {
//         if(root == null) {
//             return; 
//         } 
//         if(root.data >= k1 && root.data <= k2) {
//             printInRange(root.left, k1, k2);
//             System.out.print(root.data+" ");
//             printInRange(root.right, k1, k2);
//         } 
//         else if(root.data < k1){
//             printInRange(root.left, k1, k2);
//         } 
//         else{
//             printInRange(root.right, k1, k2);
//         }
//     } 

// // ===================================================================
// // =================================================================== 

//             // Root 2 leaf path 

//     public static void printPath(ArrayList<Integer> path) {
//         for(int i=0; i<path.size(); i++) {
//             System.out.print(path.get(i)+"->"); 
//         } 
//         System.out.println("N");
//     } 

//     public static void printRoot2Leaf(Node root, ArrayList<Integer>path){
//         if(root == null) {
//             return;
//         }

//         path.add(root.data); 
//         if(root.left == null && root.right == null) {
//             printPath(path); 
//         }

//         printRoot2Leaf(root.left, path); 
//         printRoot2Leaf(root.right, path); 
//         path.remove(path.size()-1); 

//     }

// // ============================================================================= 
// // ============================================================================= 



//     public static boolean isValidBST(Node root, Node min, Node max){
//         if(root == null){
//             return true;
//         } 

//         if(min != null && root.data <= min.data) {
//             return false; 
//         } 

//         else if(max != null && root.data >= max.data) {
//             return false;
//         }

//         return isValidBST(root.left, min, max)
//                 && isValidBST(root.right, root, max); 
//     }
//     public static void main(String args []) {
//         int values [] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//         Node root = null; 

//         for(int i=0; i<values.length; i++) {
//             root = insert(root, values[i]); 
//         }

//         inorder(root);
//         System.out.println();

//         // printInRange(root, 5, 12); // for range 

//         // printRoot2Leaf(root, new ArrayList<>()); // for 2leaf  
//         if(isValidBST(root, null,null)) {
//             System.out.println("valid");   // for check valid 
//         } else {
//             System.out.println("not valid "); 
//         }



//     }
// }



// // ======================================================================================
// // ======================================================================================



                        // Mirror a BST :-  


// import java.util.*; 

// public class BinarySearchTree { 
//     static class Node {
//         int data; 
//         Node right;
//         Node left; 

//         Node(int data) {
//             this.data = data; 
//             this.left = this.right = null; 
            
//         }
//     }

//     public static Node createMirror(Node root) {
//         if(root == null) {
//             return null; 
//         } 

//         Node leftMirror = createMirror(root.left); 
//         Node rightMirror = createMirror(root.right); 

//         root.left = rightMirror; 
//         root.right = leftMirror; 
//         return root; 
//     } 

//     public static void preorder(Node root) {
//         if(root == null) {
//             return; 

//         }

//         System.out.print(root.data + " "); 
//         preorder(root.left); 
//         preorder(root.right); 
//     }

//     public static void main(String args[]) { 

//         /*
//                      8
//                     / \ 
//                    5   10
//                   / \   \
//                  3   6   11
          
//          */
//         Node root = new Node(8); 
//         root.left = new Node(5); 
//         root.right = new Node(10); 
//         root.left.left = new Node(3);
//         root.left.right = new Node(6); 
//         root.right.right = new Node(11);   

//         System.out.println("Original preorder");
//         preorder(root);
//         System.out.println();
 
//         /* 
//                     8
//                   /  \
//                  10   5
//                 /    / \ 
//                11   6   3 
//                Mirror BST 
//          */

//         System.out.print("Mirror preorder = ");
//         root = createMirror(root); 
//         preorder(root); 

//     }
// }


// ======================================================================================================== 

import java.util.*; 

public class BinarySearchTree {

    public static void main(String args []) {
        Scanner sc = new Scanner(System.in); 
        int n = 100; 
        for(int i=0; i<n; i++){
            System.out.println("devil");
        }djfji 
    }
}dfjf adfj 