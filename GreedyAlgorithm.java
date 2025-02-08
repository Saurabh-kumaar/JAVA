


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


// import java.util.*; 

// public class GreedyAlgorithm {

//     public static void main(String args []) {
//         int A[] = {1, 4, 8, 7};
//         int B[] = {2, 6, 3, 5};

//         Arrays.sort(A); 
//         Arrays.sort(B); 

//         int minDiff = 0; 

//         for(int i=0; i<A.length; i++) {
//             minDiff += Math.abs(A[i]-B[i]);
//         }

//         System.out.println("min absolute diff of pairs = " + minDiff);
//     }
// }



// ====================================================================================================================== 
// ====================================================================================================================== 


                    // max length of chain 


// import java.util.*; 

// public class GreedyAlgorithm {

//     public static void main(String args []) {
//         int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90} };

//         Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

//         int chainLen = 1; 
//         int chainEnd = pairs[0][1]; 

//         for(int i=1; i<pairs.length; i++) {
//             if(pairs[i][0] > chainEnd) {
//                 chainLen++; 
//                 chainEnd = pairs[i][1];
//             }
//         }
//         System.out.println("max length of chain ="+ chainLen);
//     }
// }


// ====================================================================================================================== 
// ====================================================================================================================== 


            // Indian Coins 


//  import java.util.*; 

//  public class GreedyAlgorithm {
 
//     public static void main(String args []) {
//         Integer coins [] = { 1, 2, 5, 10, 20, 100};

//         Arrays.sort(coins, Comparator.reverseOrder());

//         int countOfCoins = 0; 
//         int amount = 678; 
//         ArrayList<Integer> ans = new ArrayList<>(); 

//         for(int i=0; i<coins.length; i++) {
//             if(coins[i] <= amount) {
//                 while(coins[i] <= amount) {
//                     countOfCoins++; 
//                     ans.add(coins[i]); 
//                     amount -= coins[i];
//                 }
//             }
//         }

//         System.out.println("total used coins = "+ countOfCoins);

           // print 
//         for(int i=0; i<ans.size(); i++) {
//             System.out.print(ans.get(i)+" ");
//         } 
//         System.out.println();
//     }
//  }


// // ====================================================================================================================== 
// // ====================================================================================================================== 



        // Job sequence Problem /


import java.util.*; 

public class GreedyAlgorithm {
    public static class job { 
        int deadline; 
        int profit; 
        int id; 

        public job(int i, int d, int p) {
            id = i; 
            deadline = d; 
            profit = p;

        }
    }

    public static void main(String args[]) { 
        int jobInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<job> jobs = new ArrayList<>(); 

        for(int i=0; i<jobInfo.length; i++) {
            jobs.add(new job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(jobs, (obj1 , obj2) -> obj2.profit-obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>(); 
        int time = 0; 
        for(int i=0; i<jobs.size(); i++) {
            job curr = jobs.get(i); 
            if(curr.deadline > time) {
                seq.add(curr.id);
                time++; 
            }
        }
        
        System.out.println("max jobs = " + seq.size());
        for(int i=0; i<seq.size(); i++) {
            System.out.print( seq.get(i)+" ");
        } 
        System.out.println();
    }
}


// ====================================================================================================================== 
// ======================================================================================================================





















