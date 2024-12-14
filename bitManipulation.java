
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

                        // find even odd help of if else 
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

                        // get bit 

//  import java.util.*; 

//  public class bitManipulation { 

//     public static int getBit(int n, int i ){

//         int bitMask = 1 << i;
//         if((n & bitMask) == 0 ){
//             return 0; 
//         } else {
//             return 1; 
//         }
//     } 
 
//     public static void main(String args []){ 
//         System.out.println(getBit(7,2));
//     }
//  }

// =============================================================================================
// =============================================================================================

                    // set bit 

// import java.util.*; 

// public class bitManipulation { 

//     public static int setBit(int n, int i){
//         int bitMask = 1<<i; 
//         return n | bitMask; 
//     }

//     public static void main(String args []){ 
//         System.out.println(setBit(6, 2));

//     }
// }

                        // clear bit 

// import java.util.*; 

// public class bitManipulation { 

//     public static int setBit(int n, int i){
//         int bitMask = ~(1<<i);
//         return n & bitMask; 
//     }

//     public static void main(String args []){ 
//         System.out.println(setBit(10, 1));

//     }
// }

                // updateBit 

// import java.util.*; 

// public class bitManipulation { 

//     public static int updateBit(int n, int i){
//         int bitMask = (~0)<<i; 
//         return n & bitMask; 
//     }

//     public static void main(String args []){ 
//         System.out.println(updateBit(6, 2));

//     }
// }


                // check num power of 2 

// public class bitManipulation { 
//     public static boolean ispowerOftwo(int n){ 

//     return (n & (n - 1)) == 0;    

//     }
//     public static void main(String args []){ 

//         System.out.println(ispowerOftwo(8));
//     }
// }


// Practise question :- 

// 1:- 
        // what is the value of x^x for any value of x ?. 

// import java.util.*; 

// public class bitManipulation {

//     public static void main(String args []){
//         int x1 = 4; 
//         int x = 5; 
//         System.out.println(x1^x1); 
//         System.out.println(x^x);

//     }
// } 

// 2:- 
        // swap two numbers without using any third Variables 

// import java.util.*; 

// public class bitManipulation {

//     public static void main(String args []){

//         int a = 20; 
//         int b = 50; 

//         System.out.println("value of a =" + a);
//         System.out.println("value of b =" + b); 

//         // swap this numbers 

//         a = a^b; 
//         b = a^b; 
//         a = a^b;  

//         System.out.println("value of a =" + a);
//         System.out.println("value of b =" + b);
//     }
// }
 
// 3 :- 

// import java.util.*;

// public class bitManipulation {

//     public static void main(String args[]) {
//         int x = 6; 
//         System.out.println(x + " + " + 1 + " is " + -~x);

//         x = -4; 
//         System.out.println(x + " + " + 1 + " is " + -~x); 

//         x = 0; 
//         System.out.println(x + " + " + 1 + " is " + -~x);
//     }
// }


// live :- 

// import java.util.*; 

// public class bitManipulation {

//     public static void main(String args []){
//         int x = 11 ; 
//         x = (x | (1<<6));
//         System.out.println(x);
//     }
// }

// ====== 

// set 
// import java.util.*; 

// public class bitManipulation {

//     public static void main(String args []){
//         int x = 107; 
//         x = (x |(1<<4));
//         System.out.println(x);
//     }
// } 

// ===== 

// import java.util.*;

// public class bitManipulation {

//     public static void main(String args []){
//         int x = 22; 
//         x = (x & (0<<4)); 
//         System.out.println(x);
//     }
// }
 
        // convert  uppercase 

// public class bitManipulation {

//     public static void main(String args []){
//         for(char ch = 'A'; ch <='z'; ch++){
//             System.out.print(ch);
//         }
//     }
// }
// ==================================================================================================
// ==================================================================================================



// import java.util.*;

// public class bitManipulation {

//     public static char toLowercase(char ch) {
//         // Set the 5th bit to 1 using the OR operation with 32 (0b00100000)
//         return (char) (ch | ' ');
//     }

//     public static void main(String[] args) { . ...
//         char uppercase = 'A';
//         char lowercase = toLowercase(uppercase);
//         System.out.println("Uppercase: " + uppercase);
//         System.out.println("Lowercase: " + lowercase);

//         // Test with another character
//         // char anotherUppercase = 'Z';
//         // char anotherLowercase = toLowercase(anotherUppercase);
//         // System.out.println("Uppercase: " + anotherUppercase);
//         // System.out.println("Lowercase: " + anotherLowercase);
//     }
// }


















































