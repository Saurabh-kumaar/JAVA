
//             // RECURSION 



//             // number in decreasing order 

// public class Recursion { 

//     public static void printDec(int n){
//         if(n == 1){
//             System.out.print(n);
//             return; 
//         } 
//         System.out.print(n+ " ");
//         printDec(n-1);
//     }

//     public static void main(String args []){
//         int n = 12;  

//         printDec(n);   // call kiya function ko 
//     }
// }
 

// ==============================================================================================
// ==============================================================================================


        // print increasing value 

// public class Recursion {

//     public static void printInc(int n){

//         if(n == 1 ){
//             System.out.print(n+" ");
//             return; 
//         }
//         printInc(n-1);
//         System.out.print(n+" ");
        
//     }

//     public static void main(String args []){
//         int n = 10 ; 
//         printInc(n);
//     }
// }


// ==============================================================================================
// ==============================================================================================
 
            // Find Factorial 

            
public class Recursion { 

    public static int fact(int n){
        if(n == 0){
            return 1 ; 
        } 
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn; 
    }

    public static void main (String args []){
        int n = 10; 
        System.out.println(fact(n));

    }
}

























































