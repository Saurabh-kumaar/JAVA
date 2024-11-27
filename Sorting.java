
                // SORTING 

            // Bubble sort 


// import java.util.*; 

//  public class Sorting {
    
//     public static void bubbleSort(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<arr.length-1-i; j++){
//                 if(arr[j]> arr[j+1]){ 

//                     // swap 
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;h cpnb
//                 }
//             }
//         }
//     } 
//                 // print array 
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
 
//     public static void main(String args []) {
//         int arr[] = {3,1,5,8,2};

//         bubbleSort(arr);
//         printArr(arr);
//     }
//  }
// ============================================================================
// ============================================================================

                    // selection sort:-

// import java.util.*; 

// public class Sorting { 

//     public static void selectionSort(int arr[]){
//         for(int i=0; i<arr.length-1; i++){ 

//             int minPos = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[minPos] > arr[j]) {
//                     minPos = j;
//                 }
//             }
//             // swap 
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     } 
//                 // for printing 
//     public static void printArr(int arr[]){
//                 for(int i=0; i<arr.length; i++){
//                     System.out.print(arr[i] + " ");
//                 }
//                 System.out.println();
//             }

//     public static void main (String args []){
//         int arr [] = {1,5,6,2,9};

//             selectionSort(arr);
//             printArr(arr);
//     }
// } 


// =======================================================================================
// =======================================================================================
 
                        // isertion sort 

// import java.util.*;  

// public class Sorting {

//     public static void insertionSort(int arr[]){
//         for(int i=1; i<arr.length; i++){
//             int curr = arr[i];
//             int prev = i-1; 

//             while(prev >=0 && arr[prev] > curr){
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             arr[prev+1] = curr;
//         }
//     }

//     public static void printArr( int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     } 

// public static void main(String args []){
//     int arr [] = {4, 51, 23, 5,6};
//     insertionSort(arr);
//     printArr(arr);
//   }
// } 
























































































// ========================================================================
// ========================================================================

                        // try to check it ? 

// import java.util.*; 

// public class Sorting { 
 
//     // bubble sort code 

//     public static void bubbleSort(int arr[]){
//         // loop 
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<arr.length-1-i; j++){
//                 if(arr[j] > arr[j+1]){

//                     // swap 
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     } 

//     // selection sort code 

//     public static void selectionSort(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             int minPos = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[minPos] > arr[j]){
//                     minPos = j;
//                 }
//             } 
//             // swap 

//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i]  = temp;
//         }
//     }

//     // for printing everyone sort 

//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args []){
//         int arr [] = {8,3,6,2,7}; 

//         // bubbleSort(arr);
//         selectionSort(arr);
//         printArr(arr);
//     }
// } 

// ===============================================================================
// ===============================================================================











































































































