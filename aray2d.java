
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
 
                    // Spiral :--

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

// =======================================================================================
// ======================================================================================= 

// ques:- 1

// import java.util.*; 

// public class Matrix { 

//     public static void main(String args[]){
//         int array [][] = {{4,7,8},{8,8,7}};

//         int countof7 = 0; 

//         for(int i=0; i<array.length; i++){
//             for(int j=0; j<array[0].length; j++){

//                 if(array[i][j] == 7){
//                 countof7++;
//             }
//         }
//     }
            
//         System.out.println("count of 7 is : " + countof7);
//     }
// }

// =======================================================================================
// =======================================================================================

// ques:- 2 
//  // sum of second row 

// public class Matrix {

//     public static void main(String args []){

//         int array [][] = { {1, 4, 9},{11, 4, 3},{2, 2, 3}};
//         int sum = 0; 

//         // 2nd row sum 
//         for(int i=0; i<array[0].length; i++){
//             sum += array[1][i];
//         }
//         System.out.println("sum is : " + sum);
//     }
// }
  
// ====
// ====

// public class Matrix {

//     public static void main(String args []){
//         int array[][] = {{1,4,9},{11,2,3},{2,5,7}};
//         int sum = 0;

//         for(int i=0; i<array[0].length; i++){
//             sum += array[1][i];
//         }
//         System.out.println("sum is = " + sum );
//     }
// }

// ============================================================================================================
// ============================================================================================================



//  Live :- 

                    // print one collom 

// public class Matrix {

//     public static void printSpiral(int [][] matrix){


//     int x = 3; 

//     int col =x; 
//     for(int row=0; row<matrix.length; row++){
//         System.out.println(matrix[row][col]);
//     }
// }

//     public static void main(String args[]){
//         int arr [][] = { {1,6,11,14,21}, {2,7,12,15,25}, {3,8,13,16,22}, {4,9,17,19,24}, {5,10,20,18,23}};

//         printSpiral(arr);

//     }
// } 

// =============================================================================================
// =============================================================================================

                          // print row 

// public class Matrix { 

//     public static void printRow(int [][] matrix){

//         int x = 3; 
//         int row = x;

//         for(int col=0; col<matrix.length; col++){
//             System.out.println(matrix[row][col]);
//         }
//     }

//     public static void main(String args []){
//          int arr [][] = { {1,6,11,14,21}, {2,7,12,15,25}, {3,8,13,16,22}, {4,9,17,19,24}, {5,10,20,18,23}};

//             printRow(arr);
//     }
// }


// =============================================================================================
// =============================================================================================




















































