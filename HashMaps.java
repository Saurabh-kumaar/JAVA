
//         // lets starting HashMap :- 



// import java.util.*; 
// public class HashMaps {   

//     public static void main(String args []) {
//         // create 
//         HashMap<String, Integer> hm = new HashMap<>(); 

//         // Insert 
//         hm.put("Bihar", 200); 
//         hm.put("uttar pradesh", 120); 
//         hm.put("punjab", 140); 
        
//         System.out.println(hm); 

//         // get 
//         int budget = hm.get("Bihar");
//         System.out.println(budget); 

//         System.out.println(hm.get("pakistan"));  // for null value 

//         // containskey 
//         System.out.println(hm.containsKey("Bihar"));
//         System.out.println(hm.containsKey("pakistan")); 

//         // remove 
//         hm.remove("Bihar");
//         System.out.println(hm); 

//         // size 
//         System.out.println(hm.size());    // 2 

//         // Is empty 
//         hm.clear();
//         System.out.println(hm.isEmpty());

//     } 
// }


// =========================================================================================
// =========================================================================================


        // Iteration on HashMap 

// import java.util.*; 

// public class HashMaps {

//     public static void main(String args []) {
//         HashMap< String , Integer> hm = new HashMap<>(); 
//         hm.put("India", 900); 
//         hm.put("pakistan", 300); 
//         hm.put("Nepal", 400); 
//         hm.put("USA", 700); 
//         hm.put("Chaina", 500); 

//         // Iterate 
//         Set<String> keys = hm.keySet(); 
//         System.out.println(keys); 

//         for (String k: keys) {
//             System.out.println("Key = "+k +" and value = "+hm.get(k));
            
//         }
//     }
// }


// =========================================================================================
// =========================================================================================

        // Implementaion HashMap 

// import java.util.*; 


// public class HashMaps {

//     public static void main(String args []) {
//         static class HashMap<K,V> {
//             private  class 
//         }
//     }
// }


// =========================================================================================
// =========================================================================================

        // LinkedHashMap :- 

// import java.util.*; 

// public class HashMaps { 
//     public static void main(String args[]) { 

//         TreeMap<String, Integer> tm = new TreeMap<>();  // treeMap 
//         tm.put("Mange", 100); 
//         tm.put("Apple", 200); 
//         tm.put("Grapes", 60); 

//         HashMap<String, Integer> hm = new HashMap<>();   // 
//         hm.put("Mange", 100); 
//         hm.put("Apple", 200); 
//         hm.put("Grapes", 90);  

//         System.out.println("it is come by digit = " + hm);
//         System.out.println("it is come by alphabates =" + tm);

//     }
// }


// =========================================================================================
// =========================================================================================


                // MAJORITY Element :- 

// import java.util.*; 

// public class HashMaps { 

//     public static void main(String args[]) { 
//         int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1}; 
//         HashMap<Integer, Integer> map = new HashMap<>(); 

//         for(int i=0; i<arr.length; i++) {
//             if(map.containsKey(arr[i])) {
//                 map.put(arr[i], map.get(arr[i]) + 1); 
//             } else {
//                 map.put(arr[i], 1); 
//             }
//         } 

//         Set<Integer> keySet = map.keySet(); 
//         for(Integer key : keySet) {
//             if(map.get(key) > arr.length/3) {
//                 System.out.println("majority elemet is = "+ key);
//             }
//         }

//     }
// }


// =========================================================================================
// =========================================================================================

// import java.util.*; 
// public class HashMaps {

//     public static void main(String args[]) { 
//         int arr[] = {1,8,5,3};
//         HashMap<Integer , Integer> hm = new HashMap<>();  
//         int ans [] = new int[2]; 

//         for(int i=0; i<nums.length; i++) {
//             int currEle = nums[i]; 
//             int remainingSum = target - currEle; 

//             if(hm.containsKey(remainingSum)) {
//                 ans[0] = hm.get(remainingSum); 
//                 ans[1] = i; 

//                 return ans; 
//             }
//             hm.put(currEle, i); 
//         }
//         return ans; 

//     }
// }















