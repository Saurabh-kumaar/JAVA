


                // Greedy 




        // activities Selection 

// import java.util.ArrayList;

// public class GreedyAlgorithm {

//     public static void main(String args []) {
        
//         int start[] = {1, 3, 0, 5, 8, 5};
//         int end[] = {2, 4, 6, 7, 9, 9};

//         // end time 
//         int maxAct = 0; 
//         ArrayList<Integer> ans = new ArrayList<>(); 

//         // 1st activity
//         maxAct = 1; 
//         ans.add(0); 
//         int lastEnd = end[0];
//         for(int i=1; i<end.length; i++) {
//             if(start[i] >= lastEnd) {

//                 maxAct++; 
//                 ans.add(i); 
//                 lastEnd = end[i]; 
//             }
//         }

//         System.out.println("max activities = " + maxAct);
//         for(int i=0; i<ans.size(); i++) {
//             System.out.println("A"+ ans.get(i)+" ");
//         }
//         System.out.println();
//     }
  
// }



// ====================================================================================================================== 
// ====================================================================================================================== 


    // same code as up some change for if array given without sorted 
    // sorting 



// import java.util.*;

// public class GreedyAlgorithm {

//     public static void main(String args []) {
        
//         int start[] = {1, 3, 0, 5, 8, 5};
//         int end[] = {2, 4, 6, 7, 9, 9};

//         // sorting 
//         int activities[][] = new int[start.length][3]; 
//         for(int i=0; i<start.length; i++){
//             activities[i][0] = i; 
//             activities[i][1] = start[i];
//             activities[i][2] = end[i];
//         }

//         // lamba function -> shortform 
//         Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

//         // end time 
//         int maxAct = 0; 
//         ArrayList<Integer> ans = new ArrayList<>(); 

//         // 1st activity
//         maxAct = 1; 
//         ans.add(activities[0][0]); 
//         int lastEnd = activities[0][2];
//         for(int i=1; i<end.length; i++) {
//             if(activities[i][1] >= lastEnd) {

//                 maxAct++; 
//                 ans.add(activities[i][0]); 
//                 lastEnd = activities[i][2]; 
//             }
//         }

//         System.out.println("max activities = " + maxAct);
//         for(int i=0; i<ans.size(); i++) {
//             System.out.print("A"+ ans.get(i)+" ");
//         }
//         System.out.println();
//     }
// }



// ====================================================================================================================== 
// ====================================================================================================================== 


                        // Fractional Knapsack 



// ====================================================================================================================== 
// ====================================================================================================================== 


                // Minimum sum obsolute difference pair 
                

import java.util.*; 

public class GreedyAlgorithm {

    public static void main(String args []) {
        int A[] = {1, 4, 8, 7};
        int B[] = {2, 6, 3, 5};

        Arrays.sort(A); 
        Arrays.sort(B); 

        int minDiff = 0; 

        for(int i=0; i<A.length; i++) {
            minDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println("min absolute diff of pairs = " + minDiff);
    }
}










































