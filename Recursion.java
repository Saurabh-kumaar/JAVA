
//             // RECURSION 



//             // number in decreasing order 

// public class Recursion { 

//     public static void printDec(int n){
//         if(n == 1){
//             System.out.println(n);
//              return; 
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


                // find keys help of recursion

// public class Recursion {

//     public static int findKey(int arr [],int key, int i){
//         if(i == arr.length){
//             return -1; 
//         } 
//         if(arr[i] == key){
//             return i; 
//         } 
//         return findKey(arr, key , i+1);
//     }

//     public static void main (String args []){

//     int arr [] = {3,4,1,8,5,9,7};
//     System.out.println(findKey(arr,5,0));
//     }
// }


// ===================================================================================
// ===================================================================================

        // nth Term fibonacci 
 
// public class Recursion { 

//     public static int fib(int n){
//         if(n==0){
//             return 0; 
//         } 
//         if(n==1){
//             return 1;
//         } 
//         int lastTerm = fib(n-1);
//         int slastTerm = fib(n-2);
//         int nthTerm = lastTerm + slastTerm;
//         return nthTerm;
//     }

//     public static void main(String args[]){
//         int n = 10; 
//         int ans = fib(n);
//         System.out.println(ans);
//     }
// }

// ================================================================================================
// ================================================================================================


//                     tilingProblem // find floor 


// public class Recursion { 

//     public static int tilingProblem(int n){   // 2 * n (florr size)

//         if(n == 0 || n == 1){
//             return 1; 
//         } 

//         int fnm1 = tilingProblem(n-1);
//         int fnm2 = tilingProblem(n-2);

//         int totalway = fnm1 + fnm2 ; 
//         return totalway; 
//     }

//     public static void main(String[] args) { 
//         System.out.println(tilingProblem(4));,
//     }
// }

// ==================================================================================
// ==================================================================================


                    // removeDuplicates 


// public class Recursion { 

//     public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map [] ){
//         if(idx == str.length()){
//             System.out.println(newStr);
//             return;
//         }

//         // kaam 
//         char currChar = str.charAt(idx); 
//         if(map[currChar-'a'] == true){
//             // duplicate 
//             removeDuplicates(str, idx+1, newStr, map);

//         } else {
//             map[currChar-'a'] = true; 
//             removeDuplicates(str, idx+1, newStr.append(currChar), map);
//         }
//     }

//     public static void main(String args []){ 
//         String str = "appnacollegehai";
//         removeDuplicates(str, 0, new StringBuilder(""),new boolean[26]);

//     }
// }

// ==================================================================================
// ==================================================================================


//   print binary string of size N without consecutive ones. 

// public class Recursion { 

//     public static void printBinstrings(int n, int lastPlace, String str){

//         // base case 
//         if(n == 0){
//             System.out.println(str);
//             return; 
//         } 

//         // kaam 
//         printBinstrings(n-1,0,str+"0");
//         if(lastPlace == 0){
//             printBinstrings(n-1, 1, str+"1");
//         }
//        }

//     public static void main(String args []){
//         printBinstrings(3, 0, "");
//     }
// }

// ==================================================================================
// ==================================================================================


// Solution :- 
// ques 3 :- 

    	        // write a program to find  length of a string using recursion.  


// public class Recursion { 

//     public static int length(String str){
//         if(str.length() == 0) {
//             return 0; 
//         } 
//         return length(str.substring(1)) + 1; 
//     }

//     public static void main(String args []){
//         String str = "hello raju bhai "; 
//         System.out.println(length(str));
//     }
// }

// ==================================================================================
// ==================================================================================
 
                // tower of hanoi 
                
// public class Recursion { 

//     public static void toh(int n, int A, int C, int B){
//         if(n == 0){
//             return; 
//         } 

//         toh(n-1, A, B, C);
//         System.out.println("moving " + n + " nth disk " + A + " to " + C );
//         toh(n-1, B, C, A);
//     }

//     public static void main(String args []){ 
//         toh(3, 10, 30, 20); 
//         return;
//     }
// }


// ==================================================================================
// ==================================================================================


// find all contiguous subString Starting and ending :- ...

public class Recursion { 

    public static void printDec(int n) {
        if(n == 1){
            System.out.print(n);
            return; 
        }  
        
        System.out.print(n+" ");
        printDec(n-1);
    }

    // increasing 
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n);
            return; 
        }dds
        printInc(n-1);
        System.out.print(n + " ");
    } 

    public static int fact(int n){ 

        if(n == 0){
            return 1;
        }

        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;

    }

    public static void main(String args []){
        int n = 4;  
        // printDec(n);  
        // printInc(n);  
        System.out.println(fact(n));

    }
}


























