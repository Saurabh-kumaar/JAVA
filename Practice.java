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
// OPERATORS :-

// import java.util.*;
// public class Practice{
//     public static void main (String args[]){
//         int A = 23;
//         int B = 2 ;
//         System.out.println("sum = " + (A+B)); 
//         System.out.println("sub = " + (A-B)); 
//         System.out.println("mul = " + (A*B)); 
//         System.out.println("Div = " + (A/B));
//     }
// } 
// 
// :- 
// import java.util.*;
// public class Practice{
//     public static void main(String args[]){
//         int a = 5 ; 
//         // int b = ++a;  // pre increment
//         int b = a++;     // post increment 

            // int a = 4;   // pre decrement
            // int b = --a  // post decrement
//         System.out.println(a);
//         System.out.println(b);
//     }
// }
// ======== 
// Relation operators:-

// import java.util.*;
// public class Practice{
//     public static void main (String args []){
//         int a = 3 ;
//         int b = 6 ;
//         System.out.println((a == b));
//         System.out.println((a != b));
//         System.out.println((a > b));
//         System.out.println((a < b));
//         System.out.println((a >= b )); 
//         System.out.println((a <= b));
//     }
// } 
// ========
 
// // Logical operator :-
// import java.util.*;
// public class Practice{
//     public static void main(String args []){ 

//         // Logical AND 
//         System.out.println((3>2) && (6>3)); 
//         System.out.println((5<2) && (9>3)); 
//         System.out.println((3<2) && (2>5)); 

//         // Logical or 
//         System.out.println((2>4) || (3<9)); 
//         System.out.println((8>3) || (2<5));
//         System.out.println((3<2) || (9<2)); 

//         // Logical not 
//         System.out.println( ! (4<2)); 
//         System.out.println(! (5<9));
//     }
// }
// Assignment operators :-

// import java.util.*;
// public class Practice{
//     public static void main(String args[]){
//         int A = 8 ; 
//         // A += 10; 
//         // A = A + 4; 

//         int B = 6 ; 
//         // B -= 2 ;  
        
//         //multiple 
//         B *= 4; 

//         // reminder
//         B %= 5;
//         System.out.println(B);
//     }
// }
// ======  
// find the value given questions :- 

// import java.util.*;
// public class Practice{
//     public static void main(String args []){
//         int x = 2, y = 5;
        
//         int equ1 = (x * y / x);
//         int equ2 = (x * (y / x));

//         System.out.println(equ1);
//         System.out.println(equ2);
//     }
// } 
// ======   

// give your logic in this code :- 
// import java.util.*;
// public class Practice{
//     public static void main(String argsv[]){
//         int x = 200, y=50, z=100;
//         if(x > y && y > z){
//             System.out.println("hello"); 
//         } 
//         if(z > y && z < x){
//             System.out.println("java"); // it is true 
//         }
//         if((y+200) < x && (y+150) < z){
//             System.out.println("hello java");
//         }
//     }
// }
// ====== 
// solve it :-
// import java.util.*;

// public class Practice{
//     public static void main(String args []){
//         int x, y, z;
//         x = y = z = 2;
//         x += y;           //x = x + y = 2 + 2 = 4 
//         y -= z;           //y = y - z = 2 - 2 = 0
//         z /= (x + y);     //z = z / (4 + 0)= 2 / 4 = 0

//         System.out.println(x + " " + y + " " + z);
//     }
// }
// ======  
// solve it :-
// import java.util.*;

// public class Practice{
//     public static void main(String args []){
//         int x = 9, y = 12;
//         int a = 2, b = 4, c = 6;

//         //calculate step by step 
//         int exp = 4/3*(x + 34) + 9*(a+b *c) +(3 + y * (2 + a)) /(a+b*y);
//         System.out.println(exp);
//     }
// }
// ====== 
// solve it :- 
// import java.util.*;

// public class Practice{
//     public static void main(String args []) {
//         int x = 10, y = 5;

//         int val1 = (y * (x / y + x / y));    // 5*(2+2)= 5(4)=20 
//         int val2 = (y * x / y + y * x / y);  // 5*2 + 5*2 = 20

//         System.out.println(val1);
//         System.out.println(val2);
//     }
// }
// =========  

// import java.util.*;

// public class Practice{
//     public static void main(String args []) { 
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt(); 

//         // sum of 
//         // int sum = a + b ; 

//         // sub of 
//         // int sub = a - b ;
//         System.out.println(sub);
//     }
// }
// ========  
// ********* even number **********
// import java.util.*;

// public class Practice{
//     public static void main(String args []) { 
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if(x % 2 == 0) {
//             System.out.println("its even num");
//         } else { 
//             System.out.println("not even ");
//         }
//     }
// }
// =======  
                        // pattern  
// star printing  

// import java.util.*;
// public class Practice{
//     public static void main(String args []){
//         int i , j ;
//         for (i=1; i<=5; i++)   // raws outer loop 
//         {
//             for (j=1; j<=i; j++) // columns  inner loop  
//             {
//                 System.out.print("*");
//             } 
//                 System.out.print("\n");
//         }
//     }
// }
// ===== 
// import java.util.*; 
// class Practice{
//     public static void main(String args []){

//         int i,j,k;

//         for (i=1; i<=5; i++)              // rows
//         {
//             for(j=i; j<5; j++)            // space
//             {
//                 System.out.print(" ");
//             }
//             for(k=1; k<=i; k++)            // column 
//             {
//                 System.out.print("*");
//             }
//             System.out.println("\n");
//         }
//     }
// }
// ====== 
                // rectangle pattern 

// import java.util.*;

// class Practice{
//     public static void main(String args[]){
//         int i , j ; 

//         // outer loop
//         for (i=1; i<=5; i++)
//         { 
//             // inner loop 
//             for (j=1; j<=5; j++){
//                 System.out.print("*");
//             } 
//             System.out.println(" ");
//         } 
//     }
// } 

            // hollow pattern 

// import java.util.*;

// public class Practice{
//     public static void main(String args []){
//         int i ;
//         int j ; 
        
//         for (i=1; i<=4; i++){
//             for (j=1; j<=5; j++){
//                 if(i == 1 || j == 1 || i == 4 || j == 5){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             } 
//             System.out.println();
//         }

//     }
// }  
            // Half pyramid pattern 

// import java.util.*;
// public class Practice{
//     public static void main(String args []){
//         int i;
//         int j;

//         for(i=1; i<=4; i++){
//             for (j=1; j<=i; j++){
//                 System.out.print("*");
//             } 
//             System.out.println(" ");
//         }
//     }
// } 
            // inverted pyramid .

// import java.util.*;
// public class Practice{
//     public static void main(String args []){
//         int i;
//         int j;

//         for(i=1; i<=4; i++){
//             for (j=4; j>=i; j--){
//                 System.out.print("*");
//             } 
//             System.out.println(" ");
//         }
//     }
// }  
// =====  
                        //  Rectangle 
// import java.util.*;

// public class Practice{
//     public static void main (String args []){
//         int i ; 
//         int j ; 

//         for( i=1; i<=4; i++){
//             for(j=1; j<=5; j++){
//                 if( i==1 || j==1 || i==4 || j == 5) {
//                     System.out.print("*");
//                 }  else {
//                      System.out.print(" ");
//                 }
//             } 
//             System.out.println();
//         }
//     }
// }  
// ====== 
            // find the even or oddd number 
// import java.util.*;

// public class Practice {
//     public static void main(String args []){ 
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if(x % 2 == 0){
//             System.out.println("it is even number ");
//         } else {
//             System.out.println("it is odd number");
//         }
//     }
// } 

            // Conditional statement  

// import java.util.*;

// public class Practice{
//     public static void main(String args []){
//         int age = 16;  
//         if( age >= 18){
//             System.out.println("Adult hai");
//         } 
//         if (age > 14 && age  < 18){
//             System.out.println("teenager");
//         }
//          else {
//             System.out.println("adult nhi hai");
//         }
//     }
// }
