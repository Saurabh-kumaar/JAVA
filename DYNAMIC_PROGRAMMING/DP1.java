
//                         // DYNAMIC PROGRAMMING 

// import java.util.*; 
// public class DP1 {   
//     public static int fib(int n , int f[]) {
//         if(n ==0 || n == 1) {
//             return n; 
//         }   
//         if(f[n] !=0) {  // fib already 
//             return f[n];

//         }
//         f[n] = fib(n-1, f) + fib(n-2, f); 
//         return f[n]; 
//     } 

//     // tabulation 
//     public static int fibTabulation(int n) {
//         int dp[] = new int[n+1]; 
//         dp[0] = 0; 
//         dp[1] = 1; 
//         for(int i=2; i<=n; i++) {
//             dp[i] = dp[i-1] + dp[i-2]; 
//         } 
//         return dp[n]; 
//     }

//     public static void main(String args[]) { 
//         int n = 5;  
//         int f [] = new int[n+1] ; 
//         // System.out.println(fib(n, f)); 
//         System.out.println(fibTabulation(n));
//     }
// } 


            // Climbimg stairs 


// import java.util.*;  
 
// class DP1 {  

//     public static int countWay(int n) {
//         if(n == 0) {
//             return 1; 
//         } 
//         if(n < 0) {
//             return 0; 
//         } 
//         return countWay(n-1) + countWay(n-2); 
//     }

//     public static void main(String args[]) {
//         int n = 5; 
//         System.out.println(countWay(n)); 

//     }
// }

                // same code with memoization 
                
 import java.util.*;
public class DP1 { 

    public static int countWay(int n, int ways[]) { 
        if(n == 0){
            return 1; 
        }
        if(n < 0){
            return 0; 
        } 
        if(ways[n] != -1) {
            return ways[n]; 
        } 

        ways[n] = countWay(n-1, ways) + countWay(n-2, ways); 
        return ways[n]; 
        
    } 

    public static void main(String args[]) {
        int n = 5; 
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.print(countWay(n, ways));
    }   
}







