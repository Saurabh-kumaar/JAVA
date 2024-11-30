
                        // create matrix by indexing 

// import java.util.*;

// public class Matrix {

//     public static void main(String args []){
//         int matrix [][] = new int [3][3]; 
//         int n = matrix.length,  m = matrix[0].length ; 
        
//         Scanner sc = new Scanner(System.in);
//         // input 
//         for(int i=0; i<n; i++){
//             System.out.print("Entey Something for next Line ----------------------------------------");
//             for(int j=0; j<m; j++){
//                 System.out.print("Entey Something for " + j + " Index : ");
//                 matrix [i][j] = sc.nextInt();
//             }
//         }

//         // output 
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// ==================================================================================
// ==================================================================================

// import java.util.*;

// public class Matrix {

//     public static void main(String[] args) {
//         System.out.println("hello chhoti");
//     }
// }
// ===================================================================================
// import java.util.*;
// public class Matrix { 

//     // new function for searching location 

//     public static boolean search(int matrix [][],int key){
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if(matrix [i][j] == key ){
//                     System.out.println("found at cell (" + i +","+j+")");
//                     return false ;
//                 }
//             }
//         }
//         System.out.println("key of found");
//         return false ;
//     }
// public static void main(String args []){
    
//     int matrix [][] = new int [3][3];
//     int n=matrix.length, m= matrix[0].length; 

//     Scanner sc = new Scanner(System.in );
//     // input 
//     for(int i=0; i<n; i++){
//         System.out.print("enter digit for new index ..................... ");
//         for(int j=0; j<m; j++){ 
//             System.out.print("Enter something for " + j + " Index : ");
            
//             matrix [i][j] = sc.nextInt(); 
//         }
//     } 

//     // output 
//     for(int i=0; i<n; i++){
//         for(int j=0; j<m; j++){
//             System.out.print(matrix[i][j] + " ");  
//         }
//         System.out.println();
//     }
    // search(matrix,4);
    // }
// }