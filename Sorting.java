
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
//                     arr[j+1] = temp;
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
//          printArr(arr);
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


// =============================================================================
// =============================================================================


        // inbuiltsort 

// import java.util.Arrays; 

// public class Sorting { 


//     public static void inbuiltSort(int arr[]){
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

//     // for printing 

//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]){
//         int arr[] = {1,1,9,6, 5,3,7};

//         // inbuiltSort(arr);
//         Arrays.sort(arr, Collections.reverseOrder);  // (index 0 and 4 is for sorted arr till 3 )
//         printArr(arr);
//     }
// }


// ==============================================================================================
// ==============================================================================================

        // Counting Sort :-


// import java.util.*; 

// public class Sorting {

//     public static void countingSort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             largest = Math.max(largest, arr[i]);
//         }

//         int count[] = new int [largest+1];
//         for(int i=0; i<arr.length; i++){
//             count[arr[i]]++;
//         } 

//         // sorting 
//         int j=0; 
//         for(int i=0; i<count.length; i++){
//             while(count[i] > 0 ){
//                 arr[j] = i;
//                 j++; 
//                 count[i]--;
//             }
//         }
//     }

//     // printing array 
//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args []){
//         int arr [] = { 1, 3, 5, 7, 3,1,4,};

        // countingSort(arr);
        // printArray(arr);
    // }
// }

// ================================================================================================
// ================================================================================================





// import java.util.*; 
// public class Sorting {

//     // bubble sort  ...

//     public static void bubbleSort(int arr []){
//         for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<arr.length-1-i; j++){
//                 if(arr[j] < arr[j+1]){

//             // swap 
//             int temp = arr[j];
//             arr[j] = arr[j+1];
//             arr[j+1] = temp ;
//             }
//         }
//     }
// }
//         // selection sort  ...
         
//     public static void selectionSort(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             int minPos = i;
//             for(int j=0; j<arr.length; j++){
//                 if(arr[minPos] > arr[j]){
//                     minPos = j;
//                 }
//             }
//             // swap 
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//  public static void main(String args []) {
//     int arr [] = { 3,6,2,1,8,7,4,5,3,1};
//     // selectionSort(arr);

//     bubbleSort(arr);

//     printArr(arr);
//     } 
// } 

// ======================================================================================================================== 
// ========================================================================================================================



// Live :- 

// import java.util.*; 

// public class Sorting{ 

//     public static void bubbleSort(int array []){
//         // imput 
//             int n = array.length; 
//         for(int i=0; i<array.length-1; i++){
//             for(int j=0; j<array.length-1-i; j++){ 
//                 if(array[j] > array[j+1]){


//                     int temp = array[j];
//                     array[j] = array[j+1];
//                     array[j+1] = temp;
//                 }
//              }
//         } 
//     }

//     // for print array 

//     public static void printArr(int array []){
//         for(int i=0; i<array.length; i++){
//             System.out.print(array[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args []){
//         int array [] = { 3, 1, 4, 5, 9}; 

//         bubbleSort(array);
//         printArr(array);
//     }
// }


// ===============================================================================================
// ===============================================================================================

                    // selection 

// import java.util.*; 

// public class Sorting { 

//     public static int selectionSort(int arr[]){
//         int n = arr.length;

//         for(int i=0; i<n-1; i++){
//             int minIndex = i;
//             for(int j=i+1; j<n; j++){
//                 if(arr[j] > arr[minIndex]){
//                      minIndex = j; 

//                 }
//             }

                // swap 
//             int temp = arr[i];
//             arr[i] = arr[minIndex]; 
//             arr[minIndex] = temp; 
//         }
//         return -1;
//     } 

//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         } 
//     }

//     public static void main(String args []){
//         int arr[] = { 4,6,2,8,1}; 
//         // int n = arr.length; 

//         selectionSort(arr);
//         printArr(arr);
//     }
// }


// =======================================================================
// ========================================================================








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

//     // public static void selectionSort(int arr[]){
//     //     for(int i=0; i<arr.length-1; i++){
//     //         int minPos = i;
//     //         for(int j=i+1; j<arr.length; j++){
//     //             if(arr[minPos] > arr[j]){
//     //                 minPos = j;
//     //             }
//     //         } 
//     //         // swap 

//     //         int temp = arr[minPos];
//     //         arr[minPos] = arr[i];
//     //         arr[i]  = temp;
//     //     }
//     // }

//     // for printing everyone sort .

//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//      }


//     public static void main(String args []){
//         int arr [] = {8,3,6,2,7}; 

//         bubbleSort(arr);
//         // selectionSort(arr);
//         printArr(arr);
//     }
// } 

// ================================================================================
// ================================================================================











































































































