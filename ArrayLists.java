
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































































