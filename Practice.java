// Add two num :-
// import java.util.Scanner;

// public class Practice {
//   public static void main(String args []){
//     Scanner sc = new Scanner(System.in);

//       int a = sc.nextInt();
//       int b = sc.nextInt();

//       int sum = a + b;
       
//       System.out.println("the sum is =" + sum); 
//     } 
//   }  
// ********************************************************************************* 

// find if a number is prime or not  

// import java.util.Scanner; 
// public class Practice { 
//   public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();

//         boolean isPrime = true;

//         if (num <= 1) {
//             isPrime = false;  

//         } else {
//             for (int i = 2; i <= num / 2; i++) {  
//                 if (num % i == 0) { 
//                     isPrime = false;
//                     break;
//                 }
//             } 
//         }

//         if (isPrime) { 
//             System.out.println(num + " is a prime number.");
//         } else {
//             System.out.println(num + " is not a prime number.");
//         }

//       }
//     }   
// ********************************************************************* 

// calculate simple interest :-

// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc  = new Scanner(System.in);

//          int principal = sc.nextInt();
//          int rate = sc  .nextInt();
//          int time = sc  .nextInt();

//          int simpleInterest = (principal * rate * time/ 100) ;

//         // Display result
//         System.out.println("Simple Interest = " + simpleInterest);
//     }
// } 
// *******************************************************************  

// // max of three numbers:-

// import java.util.Scanner; 

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         int num3 = sc.nextInt();

//         // Find the maximum number
//         int max = num1;
//         if (num2 > max) {
//             max = num2;
//         } 
//         if (num3 > max) {
//             max = num3;
//         }
//         // Display result
//         System.out.println("max of three num is: " + max);
//     }
// }
// **********************************************************************
 
// sum of
// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//           int n = sc.nextInt();

//          int sum = (n * (n + 1)) / 2;
//         System.out.println("Sum using formula = " + sum);

//         // Using a loop (optional)
//         int Loop = 0;
//         for (int i = 1; i <= n; i++) {
//             Loop += i;
//         }
//         System.out.println("Sum using loop = " +Loop);
//     }
// }


// check :-

// public class Practice{
//     public static void main(String args []) {
//         System.out.println("hello world ");
//     }
// } 
// ===========================================================

// Pattern :- 

// public class Practice{
//     public static void main(String args []){
//         System.out.println("****"); 
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }
// =============================================================
 
// Variables :- 

// public class Practice{
//     public static void main(String args []){
//         int a = 8;
//         int b = 3;
//         System.out.println("a"); 

//         String name =" raju bhai" ;
//         System.out.println(name);
//     }
// }
// ===============================================================

// sum of two number :- 

// public class Practice {
//     public static void main(String args []) {
//         int a = 4 ;
//         int b = 8 ;
//         int sum = a+b;
//         System.out.println(sum);
//     }
// }
// ================================================================= 

// Input :- 

// import java.util.*;
// public class Practice {
//     public static void main (String args []){
//         Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();
//         System.out.println(input); 

//         int number = sc.nextInt();
//         System.out.println(number); 

//         float price = sc.nextFloat();
//         System.out.println(price);
//     }
// }
// ================================================================== 
 
// sum a and b  :- 

// import java.util.Scanner;

// public class Practice{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in) ;
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = a+b; // add value 
//         System.out.println(sum);
//     }
// }
// =================================================================== 
 
// product of a & b  :- 

// import java.util.*;

// public class Practice{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt ();

//         int product = a*b; // multiple 
//         System.out.println(product );
//     }
// } 
// ======================================================== 
 
// area of circle :-

// import java.util.*; 

// public class Practice {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         float rad = sc.nextFloat(); 
//         float area = 3.14f * rad * rad ;
//         System.out.println(area);
//     }
// } 
// ================================================================== 


// import java.util.*; 

// public class Practice {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("hello my vs code k code");
//     }
// }
// ============================================================== 

// type conversion :-

// import java.util.*; 

// public class Practice {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in); 
//         float number = sc.nextInt();
//         System.out.println(number); 
//     }
// }
// ================================================================ 

// type casting :-

// import java.util.*; 

// public class Practice {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in); 
//         float a = 34.34f;
//         int b = (int) a;
//         System.out.println(b);
//     }
// } 
// ==================================================================== 

// type Promotion in expression :-

// import java.util.*; 

// public class Practice {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);  
//         char ch = 'a';
//         char ch2 = 'b';
//         int num = ch;
//         int num2 = ch2;
//         System.out.println(num);
//         System.out.println(num2);
//     }
// } 
// ========  
// 2nd 
// import java.util.*; 

// public class Practice {
//     public static void main(String args []){
//         int a = 10; 
//         float b = 20.25f;
//         long c = 25;
//         double d = 40;
//         double ans = a + b + c + d;
//         System.out.println(ans);
//     }
// }
// ============================================================= 

// import java.util.*;

// public class Practice{
//     public static void main(String args []){
//         byte b = 10;
//         byte a = (byte)( b * 3);
//         System.out.println(a);
//     }
// }
// ================================================================= 

// avg of 3 numbers :- 

// import java.util.*;
// public class Practice{
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int c = sc.nextInt();

//             int avg = (a + b + c ) / 3 ;
//             System.out.println(avg);
//         }
//     }
// ==================================================================== 

// In a program,input the side of a square You have to output thearea of the square.
// :- 
// import java.util.*;
// public class Practice{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int side = sc.nextInt();
//         int area = side * side ;

//         System.out.println(area);
//     }
// } 
// ==================================================================== 
 
// take 3 item to user and add on his 18% gst charge then add total value 
// :- 
// import java.util.*;
// public class Practice{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         float pencil = sc.nextFloat();
//         float pen = sc.nextFloat();
//         float erasers = sc.nextFloat(); 
         
//         // find total result 
//         float totalBill = pencil + pen + erasers ; 
//         System.out.println("the totalbill of product is =" +totalBill); 

//         // gst 
//         float gst = totalBill * 18 / 100 ;  
//         System.out.println("gst of product is =" +gst);

//         float totalGst = totalBill + gst;
//         System.out.println( "total final amount =" +totalGst);
//     }
// }
// ======================================================================
// import java.util.*;
// public class Practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         byte b = 4;
//         char c = 'a';
//         short s = 512;
//         int i = 1000;
//         float f = 3.14f;
//         double d = 99.9954;
//         double result = (f * d) +(i % c) - (d * s); 
//         System.out.println(result);
//     }
// }
// ====================================================================== 
// OPERATOR :-