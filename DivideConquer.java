public class DivideConquer { 

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 

    public static void mergeSort(int arr[], int si, int ei){ 
        if(si >= ei){
            return;
        }
        
        int mid = si + (ei - si) / 2;  // Prevent overflow
        mergeSort(arr, si, mid);  // Left part
        mergeSort(arr, mid + 1, ei); // Right part
        merge(arr, si, mid, ei);  // Merge the sorted halves
    } 

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];  // Correct array size
        int i = si;     // Left part iterator
        int j = mid + 1; // Right part iterator
        int k = 0;     // Temp array iterator

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        } 

        // Copy remaining elements from the left part
        while(i <= mid){
            temp[k++] = arr[i++];
        } 

        // Copy remaining elements from the right part
        while(j <= ei){
            temp[k++] = arr[j++];
        } 

        // Copy temp array to the original array
        for(int x = 0; x < temp.length; x++){
            arr[si + x] = temp[x];  // Fix to avoid out-of-bound errors
        }
    }

    public static void main(String args[]){
        int arr[] = {6, 3, 9, 5, 2, 8};
        System.out.println("Original Array:");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
