import java.util.*; 
public class HashMaps {   

    public static void main(String args []) {
        // create 
        HashMap<String, Integer> hm = new HashMap<>(); 

        // Insert 
        hm.put("Bihar", 200); 
        hm.put("uttar pradesh", 120); 
        hm.put("punjab", 140); 
        
        System.out.println(hm); 

        // get 
        int budget = hm.get("Bihar");
        System.out.println(budget); 

        System.out.println(hm.get("pakistan"));  // for null value 

        // containskey 
        System.out.println(hm.containsKey("Bihar"));
        System.out.println(hm.containsKey("pakistan")); 

        // remove 
        hm.remove("Bihar");
        System.out.println(hm); 

        // size 
        System.out.println(hm.size());    // 2 

        // Is empty 
        hm.clear();
        System.out.println(hm.isEmpty());

        
    } 
}
