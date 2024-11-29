
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





import java.util.*; 
public class Sorting {

    // bubble sort  ...

    public static void bubbleSort(int arr []){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){

            // swap 
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp ;
            }
        }
    }
}
        // selection sort  ...
         
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=0; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            // swap 
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

 public static void main(String args []) {
    int arr [] = { 3,6,2,1,8,7,4,5,3,1};
    selectionSort(arr);

    // bubbleSort(arr);

    printArr(arr);
    } 
} 

























































































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











































































































