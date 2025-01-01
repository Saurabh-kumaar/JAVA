//  public class BackTracking { 

//     public static void changeArr(int arr[],int i,int val ) {
//         // base case 
//         if(i == arr.length){
//             printArr(arr);
//             return;
//         }                    time complexity = O(n);
//         // resursion
//         arr[i] = val;
//         changeArr(arr, i+1, val+1);  //fnx call step 
//         arr[i] = arr[i] - 2;            //backtracking step
//     } 

//     public static void printArr(int arr[] ){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
 
//     public static void main(String args []){
//         int arr [] = new int[5];
//         changeArr(arr, 0, 1); 
//         printArr(arr);
//     }
//  }
 

                        // subsets 


// public class BackTracking { 

//     public static void findSubsets(String str, String ans, int i){

//         // base case 
//         if(i == str.length()){ 
//             if(ans.length() == 0){
//                 System.out.println("null");
//             }
//             System.out.println(ans);
//             return;                      time com :- O(n*2n)
//         }  

//         // yes choice 
//         findSubsets(str, ans+str.charAt(i), i+1);    

//         // no choice 
//         findSubsets(str, ans, i+1);              
//     }

//     public static void main(String args []){
//         String str = "abc";
//         findSubsets(str, "", 0);
//     }
// }


// ==================================================================================================================================
// ==================================================================================================================================


//                 // permutation 

// public class BackTracking { 

//     public static void findPermutation(String str , String ans){

//         // base case 
//         if(str.length() == 0){
//             System.out.println(ans);
//             return;
//         }

//         // recursion 
//         for(int i=0; i<str.length(); i++){
//             char curr = str.charAt(i);
//             // "abcde" = "ab" + "de" = "abde"
//             String NewStr = str.substring(0, i) + str.substring(i+1);
//             findPermutation(NewStr, ans+curr);
//         }
//     }

//     public static void main(String args []){
//         String str = "123";
//         findPermutation(str,"");
//     }
// }


// ==================================================================================================================================
// ==================================================================================================================================


                // N queens 


// public class BackTracking {  

//     public static boolean isSafe(char board[][],int row, int col ){
//         // vertical  
//         for(int i=row-1; i>=0; i--){
//             if(board [i][col] == 'Q'){
//                 return false;
//             }
//         }

//         // left up
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
//             if(board[i][j] == 'Q'){
//                 return false; 
//             }
//         }

//         // right up 
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
//             if(board[i][j] == 'Q'){
//                 return false; 
//             }
//         }
//         return true;
//     }

//     public static void nQueens(char board[][], int row){ 
//         // base 
//         if(row == board.length){
//             printBoard(board);
//             // count++;
//             return;
//         }

//         // column loop 
//         for(int j=0; j<board.length; j++){
//             if(isSafe(board, row,j)){
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1);    // function call 
//                 board[row][j] = 'X';   // backtracking
//             }     
//         }
//     }


//     public static void printBoard(char board [][]){
//         System.out.println("-------chese board ---------");
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board.length; j++){
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     // static int count = 0;

//     public static void main(String args []){
//         int n = 4; 
//         char board[][] = new char[n][n];
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 board[i][j] = 'X';
//             }
//         }
//         nQueens(board,0);
//         // System.out.println("total ways to solve n queens = " + count);
//     }
// } 


// // ==================================================================================================================================
// // ==================================================================================================================================



































































