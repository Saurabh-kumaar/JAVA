
//             // RECURSION 



//             // number in decreasing order 

// public class Recursion { 

//     public static void printDec(int n){
//         if(n == 1){
//             System.out.print(n);
//             return; 
//         } 
//         System.out.print(n+ " ");
//         printDec(n-1);
//     }

//     public static void main(String args []){
//         int n = 12;  

//         printDec(n);   // call kiya function ko 
//     }
// }
 

// ==============================================================================================
// ==============================================================================================


        // number in increasing order . 

// public class Recursion {

//     public static void printInc(int n){

//         if(n == 1 ){
//             System.out.print(n+" ");
//             return; 
//         }
//         printInc(n-1);
//         System.out.print(n+" ");
        
//     }

//     public static void main(String args []){
//         int n = 10 ; 
//         printInc(n);
//     }
// }


// ==============================================================================================
// ==============================================================================================
 
            // Find Factorial 


// public class Recursion { 

//     public static int fact(int n){
//         if(n == 0){
//             return 1 ; 
//         } 
//         int fnm1 = fact(n-1);
//         int fn = n * fact(n-1);
//         return fn; 
//     }

//     public static void main (String args []){
//         int n = 10; 
//         System.out.println(fact(n));
//     }
// }


// ==============================================================================================
// ==============================================================================================

        // print sum of first n naural number 

// public class Recursion { 

//     public static int printNatu(int n){  
//         if(n == 1){
//             return 1; 
//         }
//         printNatu(n-1);
//         System.out.println(n);
//     }

//     public static void main(String args []){ 
//         int n  = 5; 
//         System.out.println(n);
//         printNatu(n);
//     }
// }

// ================================================================================ 
// ================================================================================

//            // fibonacci SERIES 

// public class Recursion { 

//     public static int fib(int n ){ 

//         // calculate nth term in fibonacci 
//         if(n == 0 || n == 1){
//             return 1; 
//         }
//         int fnm1 = fib(n-1);
//         int fnm2 = fib(n-2);
//         int fn = fnm1 + fnm2;
//         return fn;
//     }

//     public static void main(String args[]){
//         int n = 2;
//         System.out.println(fib(n));
//     }
// }

//  ==================================================================================
//  ==================================================================================

        // check if array is sorted or not 
        
// public class Recursion {

//     public static boolean sortedArray(int[] arr, int i){
//         if(i == arr.length-1){
//             return true;
//         }

//         if(arr[i] > arr[i+1]){
//             return false;
//         }
//         return sortedArray(arr, i+1);
//     } 

//     public static void main(String args[]){
//         int arr [] = { 3, 4, 5};
//         System.out.println(sortedArray(arr,0)); 

//     }
// }


// ==================================================================================
// ==================================================================================














































