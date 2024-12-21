

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





































