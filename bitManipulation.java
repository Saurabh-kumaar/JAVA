
// import java.util.*; 

// public class bitManipulation {
//   public static void main(String args []){ 

//     // bitwise operator binary AND (&)
//     // System.out.println( 7 & 6);   
    
//     // binary or (|)
//     // System.out.println( 5 | 6 );

//     // binary xor (^) 
//     // System.out.println( 5 ^ 6 );

//     // binary one(~) 
//     // System.out.println(~6);
    
//   }
  
// }


// =============================================================================================
// =============================================================================================

                    // LEFT SIFT AND RIGHT SIFT BINARY 

// import java.util.*; 

// public class bitManipulation {

//   public static void main (String args []){

//     // left sift 
//     // System.out.println(5 << 2);

//     // right sift 
//     System.out.println(9 >> 2 );

//   }
// }

// =============================================================================================
// =============================================================================================

// import java.util.*; 

// public class bitManipulation { 

//     public static void oddEven(int n){
//         int bitmask = 1; 
//         if(( n & bitmask )== 0){
//             // even number 
//             System.out.println("it is even number");
//         } else {
//             // odd number 
//             System.out.println("its odd numbers");
//         }
//     }

//     public static void main(String args []){
//         oddEven(6);
//         oddEven(7);
//     }
// }

// =============================================================================================
// =============================================================================================

 import java.util.*; 

 public class bitManipulation { 

    public static int getBit(int n, int i ){

        int bitMask = 1 << i;
        if((n & bitMask) == 0 ){
            return 0; 
        } else {
            return 1; 
        }
    }
 
    public static void main(String args []){ 
        System.out.println(getBit(7,2));
    }
 }

