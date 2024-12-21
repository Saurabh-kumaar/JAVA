

                // DivideConquer :- 

                // mergeSort  :- 

// public class DivideConquer { 

//     public static void printArray(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     } 

//     public static void mergeSort(int arr[], int si, int ei){ 
//         if(si >= ei){
//             return;
//         }
        
//         int mid = si + (ei - si) / 2;  // overflow
//         mergeSort(arr, si, mid);  // Left part
//         mergeSort(arr, mid + 1, ei); // Right part
//         merge(arr, si, mid, ei);  // Merge the sorted h
//     } 

//     public static void merge(int arr[], int si, int mid, int ei){
//         int temp[] = new int[ei - si + 1];  // Correct array size
//         int i = si;     // Left part iterator
//         int j = mid + 1; // Right part iterator
//         int k = 0;     

//         while(i <= mid && j <= ei){
//             if(arr[i] < arr[j]){
//                 temp[k++] = arr[i++];
//             } else {
//                 temp[k++] = arr[j++];
//             }
//         } 

//         while(i <= mid){
//             temp[k++] = arr[i++];
//         } 

//          while(j <= ei){
//             temp[k++] = arr[j++];
//         } 

//         // Copy temp array original array
//         for(int x = 0; x < temp.length; x++){
//             arr[si + x] = temp[x];  
//         }
//     }

//     public static void main(String args[]){

//         int arr[] = {6, 3, 9, 5, 2, 8};

//         System.out.println("Original Array:");
//         printArray(arr);

//         mergeSort(arr, 0, arr.length - 1);
//         System.out.println("Sorted Array:");

//         printArray(arr);
//     }
// }


// =================================================================================================
// =================================================================================================


            // QuickSort :- 

// public class DivideConquer {  

//     // QuickSort 
//     public static void QuickSort(int arr[], int si, int ei){
//         if(si>= ei){
//             return;
//         }
//         int pIdx = partition(arr,si,ei);
//         QuickSort(arr,si,pIdx-1);
//         QuickSort(arr,pIdx+1, ei);
//     } 

//     public static int partition(int arr[], int si, int ei){
//         int pivot = arr[ei];
//         int i = si-1;  

//         for(int j=si; j<ei; j++){
//             if(arr[j] <= pivot){
//                 i++; 
//                 // swap 
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp ; 
//             }
//         }
//         i++; 
//         int temp = pivot; 
//         arr[ei] =  arr[i];
//         arr[i] =  temp ; 
//         return i;
//     }  

//     // printing 
//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     // main function 
//     public static void main(String args []){
//         int arr [] = { 6,3,9,8,2,5};
//         QuickSort(arr,0,arr.length-1);
//         printArray(arr);
//     }
// } 


// =================================================================================================
// =================================================================================================


        // Rotated Sorted Array 

// public class DivideConquer { 

//     public static int search(int arr[], int tar, int si, int ei){
//         if(si > ei){
//             return -1; 
//         }
        
//         //kaam 
//         int mid = si + (ei-si)/2; 

//         // case found 
//         if(arr[mid] == tar){
//             return mid; 
//         } 

//         // mid on L1 
//         if(arr[si] <= arr[mid]){
//             // case a : left 
//             if(arr[si] <= tar && tar <= arr[mid]){
//                 return search(arr, tar, si, mid-1);
//             } else { 
//                 // case b : right 
//                 return search(arr, tar, mid+1, ei);
//             }
//         } 

//         // mid on L2 
//         else { 
//             // case c : right 
//             if(arr[mid] <= tar && tar <= arr[ei]){
//                 return search(arr, tar, mid+1, ei);
//             } else {
//                 // case d : left 
//                 return search(arr, tar, si, mid-1);
//             }
//         }
//     }

//     public static void main(String args []){
//         int arr[] = {4,5,6,7,3,0,1,2};
//         int target = 2; 
        // int tarIdx = search(arr,target,0,arr.length-1); 
        // System.out.println(tarIdx);
        
    // }
// }


// =========================================================================================================
// =====================================================================s====================================


// using one loop for sorted array

// public class DivideConquer{

//     public static void rotateByOne(int arr[]) {
//         int n = arr.length;
//         // last element
//         int last = arr[n - 1];

//          for (int i = n - 1; i > 0; i--) {
//             arr[i] = arr[i - 1];
//         }
//         // Place the last element at the first position
//         arr[0] = last;
//     }

//     public static void printArray(int arr[]) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4, 5};

//         System.out.println("Original Array:");
//         printArray(arr);

//         rotateByOne(arr);

//         System.out.println("Rotated Array:");
//         printArray(arr);
//     }
// }


































