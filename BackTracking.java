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
//             str = str.substring(0, i) + str.substring(i+1);
//             findPermutation(str, ans+curr);
//         }
//     }

//     public static void main(String args []){
//         String str = "abc";
//         findPermutation(str,"");
//     }
// }









