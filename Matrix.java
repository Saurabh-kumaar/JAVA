
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
// =================================================================================== 


                            // searching matrix location 

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

// =============================================================================
// =============================================================================
 


// import java.util.*; 

// public class Matrix { 

//     public static void printSpiral(int matrix[][]){
//         int startRow = 0;
//         int startCol = 0; 
//         int endRow = matrix.length-1; 
//         int endCol = matrix[0].length-1; 

//         while(startRow <= endRow && startCol <= endCol){
//             // top 
//             for(int j=startCol; j<=endCol; j++){
//                 System.out.print(matrix[startRow][j]+" ");
//             } 

//             // right 
//             for(int i=startRow+1; i<=endRow; i++){
//                 System.out.print(matrix[i][endCol]+" ");
//             }

//             // bottom 
//             for(int j=endCol-1; j>=startCol; j--){ 
//                 if(startRow == endRow){
//                     break; 
//                 }
//                 System.out.print(matrix[endRow][j]+" ");
//             } 

//             // left 
//             for(int i=endRow-1; i>=startRow+1; i--){
//                 if(startCol == endCol){
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol]+" ");
//             }

//             startCol++; 
//             startRow++;
//             endCol--; 
//             endRow--;
//         }
//         System.out.println();
//     }

//     public static void main(String args[]){ 
//         int matrix[][] = { {1, 2, 3, 4},
//                            {5, 6, 7, 8},
//                            {9, 10, 11, 12},
//                            {13, 14, 15, 16}};
//         printSpiral(matrix);
//     }
// }

// ====================================================================================
// ====================================================================================

                // diagonalSum 

// import java.util.*; 

// public class Matrix { 

//     public static int digonalSum(int matrix[][]){  //0(n^2)
//         int sum = 0;

//         for(int i=0; i<matrix.length; i++){
//             // pd  primary diagonal
//             sum += matrix[i][i]; 

//             if(i != matrix.length-1-i){
//                 // sd  secondry 
//             sum += matrix[i][matrix.length-1-i];
//             }
//         }
//         return sum;
//     }

//     public static void main(String args []){

//         int matrix[][] = { { 22, 2, 3, 19},
//                             { 5, 6, 7, 8},
//                             { 9, 10, 11, 12},
//                             { 13, 14, 15, 16}};
//         int sum = digonalSum(matrix); 
//         System.out.println("Diagonal sum :" + sum);
//     }
// }














































































