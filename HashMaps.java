
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
//     public static int[] twoSum(int arr[], int target) {
//         HashMap<Integer, Integer> hm = new HashMap<>(); 

//         for(int i=0; i<arr.length; i++) {
//             int currEle = arr[i]; 
//             int remainingSum = target - currEle; 

//             if(hm.containsKey(remainingSum)) {
//                 return new int[]{hm.get(remainingSum),i}; 
//             }
//             hm.put(currEle, i); 
//         }
//         return null; 
//     }

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

// ================================================================================== 
// ================================================================================== 

// Leetcode :- 560 

// subarray sum equal k 


// class Solution { 
//     public int subarraySum(vector<int> & nums ,int k ) {
//         int n = nums.size; 
//         int count = 0; 

//         for(int i=0; i<n; i++){
//             sum = 0;  
//             for(int j=i; j<n; j++){
//                 sum += nums[j]; 
//                 if(sum == k) count++; 
//             }
//         } 
//         return count; 
//     } 
// } 
 
// ============ 

// import java.util.*;

// public class HashMaps {  

//     public int subarraySum(int nums[] , int k) {
//         int n = nums.length; 
//         int count = 0; 

//         for(int i=0; i<n; i++) {
//             int sum = 0; 

//             for(int j=i; j<n; j++) {
//                 sum += nums[j];  

//                 if( sum == k) count++; 
//             }
//         } 
//         return count++; 
//     }

//     public static void main(String args[]) {
//         HashMaps sol = new HashMaps(); 
//         int nums [] = {1, 2, 3,3};
//         int k = 3; 
//         System.out.println(sol.subarraySum(nums, k));
//     }
// }


// ================================================================================== 
// ================================================================================== 
 


                    // Valid  Anangram :- 


// import java.util.*; 

// public class HashMaps {

//     public static boolean isAnangram(String s, String t) { 
//         if(s.length() != t.length()) {
//             return false; 
//         }
//         HashMap<Character , Integer> map = new HashMap<>(); 
        
//         for(int i=0; i<s.length(); i++) {
//             char ch = s.charAt(i); 
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         for(int i=0; i<t.length(); i++) {
//             char ch = t.charAt(i); 
//             if(map.get(ch) != null) {
//                 if(map.get(ch) == 1) {
//                     map.remove(ch); 
//                 } else {
//                     map.put(ch, map.get(ch) -1);

//                 }
//             } else {
//                 return false; 
//             }
//         }
//         return map.isEmpty(); 
//     } 

//     public static void main(String args[]) {
//         String s = "arry";
//         String t = "rray"; 

//         System.out.println(isAnangram(s, t));
//     }
// }


// ================================================================================== 
// ================================================================================== 


        // HashSet 
        
// import java.util.*; 

// public class HashMaps {

//     public static void main(String args []) {
//         HashSet<Integer> set = new HashSet<>(); 

//         set.add(1); 
//         set.add(4); 
//         set.add(3); 
//         set.add(1); 

//         System.out.println(set); 
//         // show contains present or not in set  
//         // set.remove(4);
//         // set.clear(); 

//         System.out.println(set.size());     
//         System.out.println(set.isEmpty());   

//     }
// }


// ================================================================================== 
// ================================================================================== 


            // Iteration on HashSet :- 

// import java.util.*; 

// public class HashMaps {

//     public static void main(String args[]) {
//         HashSet<String> cities = new HashSet<>(); 
//         cities.add("varanasi"); 
//         cities.add("mohania"); 
//         cities.add("ramgarh"); 
//         cities.add("bhabhua");  

//         // cities.remove("varanasi"); 
 
//         // 1st 
//         // Iterator it = cities.iterator(); 
//         // while(it.hasNext()) {
//         //     System.out.println(it.next());
//         // }

//         // adavanced 
//         for(String city : cities) {
//             System.out.println(city);
//         }
//     } 
// }


// ================================================================================== 
// ================================================================================== 

                // LinkedHashSet :  
                // TreeSet 
        // TreeSet -> treeMap -> red-black 

// import java.util.*; 

//  import java.util.*; 

// public class HashMaps {

//     public static void main(String args []) {
//         HashSet<String> cities = new HashSet<>(); 
//         cities.add("varansi"); 
//         cities.add("ramgarh"); 
//         cities.add("mohania"); 
//         cities.add("bhabhua");  

//         LinkedHashSet<String> lhs = new LinkedHashSet<>(); 
//         lhs.add("varansi"); 
//         lhs.add("ramgarh"); 
//         lhs.add("mohania"); 
//         lhs.add("bhabhua");  

//         TreeSet<String> ts = new TreeSet<>(); 
//         ts.add("varansi"); 
//         ts.add("ramgarh"); 
//         ts.add("mohania"); 
//         ts.add("bhabhua");    
        

//         System.out.println(cities);
//         System.out.println(lhs);  
//         System.out.println(ts);  // in order form  accending order 

//         lhs.remove("varansi");
//         System.out.println(lhs); 
//     }
// }

// // ================================================================================== 
// // ================================================================================== 

        //   Count distinct elements 

// import java.util.*; 
// public class HashMaps {

//     public static void main(String args []) {
//         int sum[] = {4, 3, 2 ,1, 5, 7, 2, 4, 3, 5}; // only count how many digit have .
//                 // output :- 6 ({4, 3, 2, 1, 5, 7})  
//         HashSet<Integer> set = new HashSet<>(); 

//         for(int i=0; i<sum.length; i++) {
//             set.add(sum[i]); 
//         } 
//         System.out.println("ans = " + set.size()); 
//     }
// }

// // ================================================================================== 
// // ================================================================================== 

                // Union and Intersection :- 


// import java.util.*; 

// public class HashMaps { 

//     public static void main(String args[]) { 
//         int arr1[] = {7, 3, 2,};
//         int arr2[] = {6, 4, 3, 7, 9};
//         HashSet<Integer> set = new HashSet<>(); 

//         // union 
//         for(int i=0; i<arr1.length; i++)  {
//             set.add(arr1[i]); 
//         }

//         for(int i=0; i<arr2.length; i++) {
//             set.add(arr2[i]); 
//         } 

//         System.out.println("union = " + set.size());

//         // intersection 
//         set.clear();
//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]); 
//         } 

//         int count = 0; 
//         for(int i=0; i<arr2.length; i++) {
//             if(set.contains(arr2[i])) {
//                 count++; 
//                 set.remove(arr2[i]);
//             }
//         }
//         System.out.println("intersection = " + count);
//     }
// }

// ==================================================================================
// ================================================================================== 
 

        // find Iteration tickets :- 

// import java.util.*; 

// public class HashMaps { 
//     public static String getStart(HashMap<String, String> tickets) {
//         HashMap<String, String> revMap = new HashMap<>(); 

//         for(String key : tickets.keySet()){
//             revMap.put(tickets.get(key), key); 
//         } 

//         for(String key : tickets.keySet()){
//             if(!revMap.containsKey(key)) {
//                 return key;   // starting point 
//             }
//         } 
//         return null; 
//     }

//     public static void main(String args[]) {
//         HashMap<String , String> tickets = new HashMap<>(); 
//         tickets.put("Chennai","Bengaluru");  
//         tickets.put("Mumbai","Delhi");  
//         tickets.put("Goa","Chennai");  
//         tickets.put("Delhi","Goa");   

//         String start = getStart(tickets); 
//         System.out.print(start);
//         for(String key : tickets.keySet()){
//             System.out.print(" -> " + tickets.get(start));
//             start = tickets.get(start); 
//         }
//         System.out.println();

//     }
// }

// ================================================================================== 
// ================================================================================== 

                Largest subarray with sum 0 
                
import java.util.*; 

public class HashMaps {

    public static void main(String args []) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23}; 

        HashMap<Integer, Integer> map = new HashMap<>(); 
        // sum , idx 

        int sum = 0; 
        int len = 0; 

        for(int j=0; j<arr.length; j++) {
            sum += arr[j]; 
            if(map.containsKey(sum)) {
                len = Math.max(len, j-map.get(sum)); 
            } else {
                map.put(sum, j); 
            }
        }
        System.out.println("largest subarray with sum as 0 => " + len);
    }
}
































