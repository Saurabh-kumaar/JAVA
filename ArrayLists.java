
//             // arraylists :- 


// import java.util.*; 

// public class ArrayLists { 

//     public static void main(String args []){

//         // className objective = new className(); 

//         ArrayList<Integer> list = new ArrayList<>(); 
//         ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();


//         // Add Element 

//         // list.add(1,5); set    // O(n) linear time 
//         // System.out.println(list);


//         list.add(1);        // 0(1) containst time
//         list.add(2);
//         list.add(3);
//         list.add(4);

//         System.out.println(list);
  

//         // Get Element 

//         int element = list.get(1); 
//         System.out.println(element); 

//         // Remove element  O(n)
//         list.remove(2);
//         System.out.println(list);

//         // set Elemnt index 
//         list.set(2, 10);
//         System.out.println(list);

//         // contains 
//         System.out.println(list.contains(1));
//         System.out.println(list.contains(11)); 

        
//     }
// }


// ===============================================================================================================  
// ===============================================================================================================

        // find size and maximum value 

// import java.util.*; 

// public class ArrayLists {

//     public static void main(String args []){

//         ArrayList<Integer> list = new ArrayList<>(); 
//         list.add(1); 
//         list.add(2); 
//         list.add(3);
//         list.add(4); 
//         list.add(5);
//         list.add(6);

//         // // System.out.println(list.size()); 

//         // size 
//         // // print the arraylist 
//         // for(int i=0; i<list.size(); i++){
//         //     System.out.print(list.get(i) + " ");
//         // }
//         // System.out.println();

//         int max = Integer.MIN_VALUE; 
//         for(int i=0; i<list.size(); i++){
//             if(max < list.get(i)) {
//                 max = list.get(i);
//             }
//         }  
//         System.out.println("max element = " + max);
//     } 
// } 
 

// ===============================================================================================================
// ===============================================================================================================

    // Swap 2 numbers 


// import java.util.*; 

// public class ArrayLists {  

//     public static void swap(ArrayList<Integer> list, int idx1, int idx2) {

//     int temp = list.get(idx1); 
//     list.set(idx1, list.get(idx2)); 
//     list.set(idx2, temp);
//     }

//     public static void main(String args []) { 
//         ArrayList<Integer>list = new ArrayList<>();
//         list.add(3);
//         list.add(5);
//         list.add(6);
//         list.add(9);
//         list.add(1); 

//         int idx1 = 1, idx2 = 4; 
//         System.out.println(list);
//         swap(list, idx1, idx2);
//         System.out.println(list);

//     }
// }


// ===============================================================================================================
// ===============================================================================================================


                    // sorting  


// import java.util.*; 

// public class ArrayLists {

//     public static void main(String args[]){

//         ArrayList<Integer> list = new ArrayList<>(); 
//         list.add(3);
//         list.add(4);
//         list.add(9);
//         list.add(6);
//         list.add(2);

//         System.out.println(list);
//         Collections.sort(list);     // ascending order
//         System.out.println(list);  

//         // decending order 
//         Collections.sort(list,Collections.reverseOrder());
//         System.out.println(list);

    // }
// }


// ===============================================================================================================
// ===============================================================================================================


        // Implementation & multi dimentational


// import java.util.*; 

// public class ArrayLists {

//     public static void main(String args []){

//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); 
//         ArrayList<Integer> list1 = new ArrayList<>(); 
//         ArrayList<Integer> list2 = new ArrayList<>(); 
//         ArrayList<Integer> list3 = new ArrayList<>(); 

//         for(int i=1; i<=5; i++){
//             list1.add(i*1);  // 1 2 3 4 5
//             list2.add(i*2);  // 2 4 6 8 10 
//             list3.add(i*3);  // 3 6 9 12 15 
//         } 

//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3); 

//         System.out.println(mainList);
//     }
// }

// ===============================================================================================================
// ===============================================================================================================

                // Container with most water 

// import java.util.*; 

// public class ArrayLists { 

//     public static int storeWater(ArrayList<Integer> height){
//         int maxWater = 0; 

//         // brute force 
//         for(int i=0; i<height.size(); i++){
//             for(int j=i+1; j<height.size(); j++){
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int width = j-i; 
//                 int currWater = ht * width; 
//                 maxWater = Math.max(maxWater, currWater);
//             }
//         }
//         return maxWater; 
//     }

//     public static void main(String args []){
//         ArrayList<Integer> height = new ArrayList<>() ;
//         height.add(1); 
//         height.add(8); 
//         height.add(6); 
//         height.add(2); 
//         height.add(5); 
//         height.add(4); 
//         height.add(8); 
//         height.add(3); 
//         height.add(7);

//         System.out.println(storeWater(height));

//     }
// }


// ===============================================================================================================
// ===============================================================================================================

                    // pair sum (brute force) 


// import java.util.*; 

// public class ArrayLists { 

//     public static boolean pairSum1(ArrayList<Integer> list, int target){

//         for(int i=0; i<list.size(); i++){
//             for(int j=i+1; j<list.size(); j++){
//                 if(list.get(i) + list.get(j) == target){
//                     return true; 
//                 }
//             }
//         } 
//         return false; 
//     }

//     public static void main(String args []){
//         ArrayList<Integer> list = new ArrayList<>(); 

//         // 1,2,3,4,5,6

//         list.add(1); 
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         list.add(7); 
//         int target = 13;    // true 
//         // int target = 233;   // false 

//         System.out.println(pairSum1(list, target));

//     }
// }


// ===============================================================================================================
// ===============================================================================================================


            // Lonely questions  

// import java.util.HashMap;

// public class ArrayLists {

//     public static void main(String args[]){ 

//         HashMap<Integer, Integer> mp = new HashMap<>(); 

//         mp.put(7, 10); 
//         mp.put(3, 5); 
//         mp.put(9, 11); 

//         System.out.println(mp.containsKey(7));
//         System.out.println(mp.containsKey(3));
//         System.out.println(mp.containsKey(6)); 

//         System.out.println(mp.size());  // for count size 
//     }
// }

// ===============================================================================================================
// ===============================================================================================================




