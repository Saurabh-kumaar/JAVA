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
// ====== 
            // find largest value of 2 
// import java.util.*;

// public class Practice{
//     public static void main(String args []){ 
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if ( a >= b){
//             System.out.println("a is largest value of 2");
//         } 
//         else {
//             System.out.println("b is largest value of 2");
//         }
//     }
// }
// ======   else if statements 

// import java.util.*;
// public class Practice {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
            

//         if( age >= 18){
//             System.out.println("adult");
//         } 
//         else if(age >  13 && age < 18) {
//             System.out.println("teenager");
//         } 
//         else {
//             System.out.println("bhot chhotta hai ");
//         }
//     }  
// } 
// ======= 
                // Income tax calculator 

// import java.util.*;

// public class Practice {
//     public static void main(String args[]){ 
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax = sc.nextInt();

//         if ( income <= 500000 ) {
//             tax = 0;
//          } 
//         else if (income >= 500000 && income < 1000000) {
//             tax = (int) (income * 0.2);
//          } 
//         else {
//             tax = (int) (income * 0.3);
//          } 
//          System.out.println("your tax is : " + tax);
//     }
// } 
// ====== 
                // find biggest value 
// import java.util.*;
// public class Practice {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int a = 1, b = 3, c = 6; 

//         if( (a >= b) && (a >= c)) {
//             System.out.println(" a is biggest number");
//         } 
//         else if ( b >= c ){
//             System.out.println("b is biggest number");
//         } 
//         else {
//             System.out.println("c is biggest number");
//         }
//     }
// } 
// ======  
                // ternary operator 
// import java.util.*;

// public class Practice {
//     public static void main(String args []){
//         int number = 34;

//         String type = ((number % 2) == 0) ? "even" : "odd";
//         System.out.println(type);
//     }
// }
// ======  
                    // use ternary operator 
// import java.util.*; 
// public class Practice{
//     public static void main(String args []){
//         int marks = 32;

//         String type = (marks >= 33 ) ? "pass" : "fail";
//         System.out.println(type);
//     }
// }
// ======  
                // switch Statement  
// import java.util.*;
// public class Practice{
//     public static void main(String args []){
//         int number = 2 ;
//         switch (number) {
//             case 1 : System.out.println("java"); 
//             break ;
//             case 2 : System.out.println("dsa"); 
//             break ;
//             case 3 : System.out.println("web development"); 
//             break ;
//             default : System.out.println("nothing");
//         }
//     }
// }
// ===== 
// import java.util.*;
// public class Practice {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a :");
//         int a = sc.nextInt();
//         System.out.println("enter b : ");
//         int b = sc.nextInt(); 
//         System.out.println("enter operator : ");
//         char operator = sc.next().charAt(0);
 
//         switch (operator) {
//             case '+' : System.out.println(a+b);
//                         break ;
//             case '+' : System.out.println(a-b);
//                         break ;
//             case '+' : System.out.println(a*b);
//                         break ;
//             case '+' : System.out.println(a/b);
//                         break ;
//             case '+' : System.out.println(a%b);
//                         break ;
//             default : System.out.println("wrong operator");

//         }
//     }
// } 
// ==================================================================== 
//  write a java program to get s number from the user and print whether it is 
//  positive or negative 
// import java.util.*;

// public class Practice{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();

//         if( number > 0){
//             System.out.println("positive");
//         } 
//         else {
//             System.out.println("negative");
//         }
//     }
// }
// =====  
// its you have fever when your temp is above 100.
// public class Practice {
//     public static void main(String args []){
//         double temp = 103.4;
//         if( temp > 100){
//             System.out.println("i have fever");
//         } else {
//             System.out.println("i have not fever");
//         }
//     }
// } 
// ====== 
// write a java program to input week number (1-7) and point day of 
// week name using switch case.  

// import java.util.*;
// public class Practice {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter week nunber (1-7): "); 
//         int week = sc.nextInt();

//         switch (week) {
//             case 1:
//             System.out.println("Monday"); 
//             break;
//             case 2 :
//             System.out.println("Tuesday"); 
//             break;
//             case 3:
//             System.out.println("wednesdsy");
//             break;
//             case 4:
//             System.out.println("thursday");
//             break;
//             case 5:
//             System.out.println("Friday");
//             break;
//             case 6:
//             System.out.println("Saturaday");
//             break;
//             case 7:
//             System.out.println("Sunday");
//             break;
//             default:
//             System.out.println("invalid input! please enter week number 1-7.");
//         }
//     }
// }
// ====== 
// public class Practice {
//     public static void main(String arags []){
//         int a = 23, b =20;
//         boolean x = (a < b ) ? true : false ;
//         int y = ( a > b ) ? a : b ;  
//         System.out.println(y);
//     } 
// } 
// ======  
                        // switch use 
// import java.util.*;
// public class Practice{
//     public static void main(String args []) {
//         Scanner sc = new Scanner(System.in); 
//         int number = sc.nextInt();

//         switch(number) {
//             case 1 : System.out.println("hello");
//             break ;

//             case 2 : System.out.println("namste");
//             break ;

//             case 3 : System.out.println("kaise ho ap sab ");
//             break;

//             case 4 : System.out.println(" thik hai ji");
//             break;

//             default : System.out.println(" nothing");
//         }
//     }
// }
// ======  
                    // find month name the use of switch 

// import java.util.*;

// class Practice {
//     public static void main (String args []){
//         Scanner sc = new Scanner(System.in) ;
//         System.out.println("write monthh name (1-12)");
//         int month = sc.nextInt();

//         switch ( month ) {
//             case 1 : System.out.println(" january");
//             break;

//             case 2 : System.out.println(" february");
//             break;

//             case 3 : System.out.println(" march");
//             break;

//             case 4 : System.out.println(" april");
//             break;

//             case 5 : System.out.println(" may ");
//             break;

//             case 6 : System.out.println(" june");
//             break;

//             case 7 : System.out.println(" july");
//             break;

//             case 8 : System.out.println(" august");
//             break;

//             case 9 : System.out.println(" september");
//             break;

//             case 10 : System.out.println(" october");
//             break;

//             case 11 : System.out.println(" november");
//             break;

//             case 12 : System.out.println(" december");
//             break;

//             default : System.out.println("please write month number?");
//         }
//     }
// } 
// ======== 
            // find odd : even num

// import java.util.*; 

// public class Practice {
//     public static void main(String args []) {
//         Scanner sc = new Scanner( System.in) ; 
//         System.out.println("write num please ");
//         int num = sc.nextInt();

//          String type = (num % 2 == 0 ) ?  "even" : "odd" ;
//         System.out.println(type );
//     }
// } 
// ======  
                // loop  
                // while loop   
// class Practice {
//     public static void main(String args []) {
//         int c = 0;

//         while ( c < 10) {
//             System.out.println("hello"); 
//             c++;
//         }
//         System.out.println("printed hw 10x");
//     }
// }
// ===== 

// print number from 1 to 10 & using while loop  

// import java.util.*;
// class Practice {
//     public static void main(String args []) { 
//         int c = 1;
//         while ( c <= 10){
//             System.out.print(c+ " "); 
//             c++;
//         }
//     }
// }
// ====== 

// print number from 1 to n.
 
// import java.util.*; 

// class Practice {
//     public static void main(String args [] ){
//         Scanner sc = new Scanner(System.in) ;
//         int range = sc.nextInt();
//         int c = 1;

//         while ( c <= range) {
//             System.out.print(c + " " );
//             c++;
//         }
//         System.out.println();
//     }
// }
// =======  

// print sum of first n natural number 

// import java.util.*;
// class Practice {
//     public static void main(String args []) {
//         Scanner sc = new Scanner (System.in) ;
//         int n = sc.nextInt(); 
//         int sum = 0;

//         int i=1;
//         while(i <=n){
//             sum +=i;
//             i++; 
//         }
//         System.out.println(sum);
//     }
// }
// =======  
            // print square pattrn 
// class Practice {
//     public static void main(String args []){
//         for ( int line=1; line <=4; line++){
//             System.out.println("****"); 
//         }
//     }
// }
// =======  

            // reverse the given number :-

// import java.util.Scanner;

// class Practice {
//     public static void main(String args []){ 
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         while ( n > 0) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit + " ");
//             n = n / 10;
//         }
//     }
// }
// // ======= 

                    // square pattern 
// import java.util.*; 

// public class Practice {
//     public static void main(String args []) {
//         Scanner sc = new Scanner(System.in);
        
//         // for loop 
//         // for ( int i = 1; i<=; i++){
//         //     System.out.println("****");
//         // } 

//         // while loop 
//                 int i = 1;
//         while ( i<=4){
//             System.out.println("****");
//             i++;
//         }   
//         // System.out.println("****"); 
//     }
// } 
// ========  
                //  do while loop  
// import java.util.*;

// public class Practice{
//     public static void main(String args []) { 
//         int i =1;
//         do {
//             System.out.println("hello guys ");
//             i++;
//         } 
//         while ( i<=10 );

//     }
// }
// ========  

        // break statement 
// import java.util.*;

// public class Practice {
//     public static void main(String args []) { 
//         for ( int i=1; i<=8; i++){
//             if(i==5){
//                 break;
//             } 
//             System.out.println(i);
//         } 
//         System.out.println("i am out of the loop ");
//     }
// }
// ========
                    // check :-
// import java.util.*;

// public class Practice {
//     public static void main(String args []) {
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.println("enter your number ");
//             int n = sc.nextInt(); 

//             if(n % 10 == 0) {
//                 break ;
//             } 
//             System.out.println(n);
//         } while (true);
//     }
// }  
// ======= 
            // continue statement 
// import java.util.*;

// public class Practice {

//     public static void main(String args []){
//         for(int i=1; i<=5; i++) {
//             if( i == 3){
//                 continue;
//             } 
//             System.out.println(i);
//         } 
//         System.out.println("end now");
//     }
// }
// ======  

        // ques to continue keyboard 
        
// import java.util.*; 

// public class Practice {
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         do { 
//         System.out.println("enter your number ");
//         int n = sc.nextInt(); 
//         if( n % 10 == 0 ) {
//             continue;
//         } 
//         System.out.println(n);

//         } while (true);
//     }
// }
// ======= 
                // check if a num is prime or not 

// import java.util.*; 

// public class Practice {
//     public static void main(String args []) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
         
//         if(n ==2 ){
//             System.out.println("n is prime");
//         } else {
//             boolean isPrime = true;
//             for (int i=2; i<=n-1; i++) {
//                 if(n % i == 0) {
//                     isPrime = false ;
//                 }
//             } 
//             if(isPrime == true) {
//                 System.out.println("n is prime");
//             } else {
//                 System.out.println("n is not prime");
//             }
//         }    
//     }
// } 
// ======== 
// how many times hello is printed . 

// public class Practice {
//     public static void main(String args []) {
//         for(int i=0; i<5; i++){   // i=2 because i +=2 : 0+2 then i<5 
//             System.out.println("hello");
//             i +=2; 
//         }
//     }
// } 
// ========= 
// import java.util.Scanner;
// public class Practice {
//     public static void main(String[]args) {
//         Scanner sc = new Scanner(System.in); 
//         int product = sc.nextInt();
        
//         switch (product)  {
//             case 1 : System.out.println("java");
//             break;

//             case 2 : System.out.println("python");
//             break ;

//             case 3 : System.out.println("dsa");
//             break;

//             default : System.out.println("invalid num");
//         }
//         }
//     } 
// ========= 

                // a simple calculator 

// import java.util.*;

// public class Practice {
//     public static void main (String args []) {
//         Scanner sc = new Scanner(System.in); 
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         char operator = sc.next().charAt(0);

//         switch (operator) {
//             case'+' : System.out.println(a+b);
//                         break;
//             case '-' : System.out.println(a-b);
//                         break;

//             case '*' : System.out.println(a*b);
//                         break;

//             case '/' : System.out.println(a/b);
//                         break;

//             case '%' : System.out.println(a%b);
//                         break;

//             default : System.out.println("its wrong way ");
//         }
//     }
// } 
// =========  
                    // find year is leap or not  
// import java.util.*;

// public class Practice {
//     public static void main(String args []) {
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();

//         boolean x = (year % 4) == 0;
//         boolean y = (year % 100) != 0;
//         boolean z = ((year % 100 == 0 ) && ( year % 400 == 0) ) ;

//         if( x && (y ||z)) {
//             System.out.println(year + "is a leap year ");
//         } else {
//             System.out.println(year + " is not a leap year");
//         }
//     }
// }
// =======  
                // print number from 1 to n 
// import java.util.*;

// public class Practice {
//     public static void main(String args []) {
//     Scanner sc = new Scanner(System.in);
//     int range = sc.nextInt();

//     int c = 1;
//     while( c <= range) {
//         System.out.print(c + " ");
//         c++;
//     } 
//     System.out.println();
// }
// }
// ======= 
                    // star pattern 
// import java.util.*;

// public class Practice {
//     public static void main(String args []) {  
          
//         for(int i=1; i<=10; i++){ 
//             for (int j=1; j<=i; j++) {
//                      System.out.print("*");
//             } 
//                      System.out.println(" ");
//         }  
//     }
// }
// ========   
                // inverted star pattern 
// import java.util.*;

// public class Practice {
//     public static void main(String args []) {  
          
//         for(int i=1; i<=4; i++){ 
//             for (int j=5; j>=i; j--) {
//                      System.out.print("*");
//             } 
//                      System.out.println(" ");
//         }  
//     }
// }
// ========  
                // print number pattern 

// import java.util.*; 

// public class Practice {

//     public static void main(String args[]) {  
//         Scanner sc = new Scanner(System.in);
//         int n = 4; 

//         for( int i=1; i<=n; i++) {
//             for( int j = 1; j<=i; j++ ){
//                 System.out.print(j);

//             } 
//             System.out.println();
//         }   
//     }
// } 
// ======== 
                // alphabets pattern print 

// import java.util.*; 

// public class Practice {

//     public static void main(String args[]) {  
//         Scanner sc = new Scanner(System.in);
//         int n = 5;
//         char ch = 'A';
        
//         for(int line =1; line<=n; line++) {
//             for(int chars=1; chars<=line; chars++){
//                 System.out.print(ch + " ");
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// } 
// =======           
                    //  hollow rectangle 

// import java.util.*;

// public class Practice {
//     public static void main(String args[]) { 
//         int i;
//         int j;

//         for(i = 1; i<=4; i++) {
//             for( j=1; j<=5; j++){
//                 if( i == 1 || j == 1 || i == 4 || j == 5){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// ==========  
                    // half pyramid 
// import java.util.*;

// public class Practice {
//     public static void main(String args []) {
//         int n = 4;
//         for( int i = 1; i<=n; i++) { 
//             for(int j =1; j<=i; j++){
//                 System.out.print("*");
//             } 
//             System.out.println();
//         }
//     }
// }
// ======== 
            // print number 
// import java.util.*; 

// public class Practice {
//     public static void main(String args []) {
//         int n=4; 
//          for(int i=1; i<=n; i++){ 

//             for(int j=1; j<=i; j++){
//                 System.out.print(j+ " ");
//              }
//                 System.out.println();
//          } 
//     }    
// } 
// ============ 

// import java.util.*; 

// public class Practice {
//     public static void main(String args []) {
//         int n = 5 ;

//         for(int i=5; i>=1; i--){
//             for(int j=5; j>=i; j--){
//                 System.out.print(j + " ");
//             } 
//             System.out.println();
//         }
//     }
// } 

            // triangle pyramid:-
// import java.util.*; 

// public class Practice {
//     public static void main(String args []) {
//         int n = 5;
//         for(int i=1; i<=5; i++){
//             for (int x = 5; x>i; x--) {
//                 System.out.print(" ");
//             } 
//             for(int j=1; j<=i; j++) {
//                 System.out.print(j);
//             } 
//             System.out.println();
//         }        
//     }
// } 
// =======          // number print 

// import java.util.*; 

// public class Practice {
//     public static void main(String args []){
 
//         for(int i=5; i>=1; i--){
//             for(int x=1; x<i; x++){
//                 System.out.print(" ");
//             } 
//             for(int j=5; j>=i; j--){
//                 System.out.print(j);
//             } 
//             System.out.println();
//         }
//     }
// }
// ========
                    // triangle inverted pattern 
// import java.util.*;

// public class Practice {
//     public static void main(String args[]) {
//         for(int i=1; i<=5; i++){ 
//             for(int x =5; x>i; x--)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++)
//             {
//                 System.out.print(j);
//             } 
//                  System.out.println();
//              }
        // } 
// }
// ==========  
                        // function 

// public class Practice { 
//     public static void findValue(){
//         System.out.println("codewithSaurabh");
//     } 
    
//     public static void main(String args[]) {
//         findValue();
//     }
// }
                    // sum of two values 
 
// import java.util.*;

// public class Practice { 
//     public static void printVal(){
//         System.out.println("munna bhai");
//     } 

//     public static int calSum(int num1, int num2){   // formal parameters
//         int sum = num1 + num2 ; 
//         return sum;
//     }
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calSum(a, b);         // arguments or actual paramrters
//         System.out.println("sum is " + sum);
//     }
// } 
// =========== 
                // call by value 
// import java.util.*;

// public class Practice {  

//     public static void swap(int a, int b){

//          // swap 
//         int temp = a ;
//         a = b;
//         b = temp; 
//     }
//     public static void main(String args []){ 
//         // swap value exchange 
//         int a = 4;
//         int b = 2; 
//         swap(a, b);

//        System.out.println(a);
//        System.out.println(b);

//     }
// }  
                // find the value of multiple num 
// import java.util.*;

// public class Practice { 

//     public static int multiply (int a, int b) {
//         int goods = a * b ;
//         return goods ; 
//     }
//     public static void main(String args[]) {
//         int a = 3 ; 
//         int b = 5 ; 
//         int goods = multiply(a, b);
//         System.out.println("a * b = "+ goods);
//         int prod = multiply(19 , 10) ;
//         System.out.println("the multiply of this num =" + prod);
//     }
// } 
// ========= 
                        // factorial of num 
// import java.util.*;

// public class Practice {  

//     public static int factorial (int n){
//         int f = 1; 

//         for (int i=1; i<=n; i++){
//             f = f * i;
//         } 
//         return f;
//     }

//     public static void main (String args []) { 
//         factorial(4);
//         System.out.println(factorial(10));
//     }
// } 
// ========  
                // binomial coefficient 

// import java.util.*;

// public class Practice {  

//     public static int factorial (int n){
//                 int f = 1; 
        
//                 for (int i=1; i<=n; i++){
//                     f = f * i;
//                 } 
//                 return f;
//             }

//     public static int binCoeff(int n, int r) {
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);

//         int binCoeff = fact_n / (fact_r * fact_nmr);
//         return binCoeff;
//     }

//     public static void main(String args []) { 
//         System.out.println(binCoeff(5,2 ));
//     }
// } 
// ==========  
                    // function overloading 

// import java.util.*; 

// public class Practice { 

//     public static int sum(int a, int b){
//         return a+b;
//     } 

//     public static float sum(float a, float b){
//         return a+b;
//     }
//     public static void main(String args []) { 
//         System.out.println(sum(3, 5));
//         System.out.println(sum(3.4f, 4.6f));
//     }
// } 
// ========== 
                // prime number 
// import java.util.*; 

// public class Practice { 

//     public static void main(String args[]) { 
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); 

//          if(n == 2){
//             System.out.println("n is prime");
//         } else {

//             boolean isPrime = true ; 
//         for(int i=2; i<=n-1; i++){
//             if(n % i == 0) {
//                 isPrime = false ; 
//             }
//         } 

//         if(isPrime == true){
//             System.out.println(" n is prime");
//         } else {
//             System.out.println("n is not prime");
//         }
//         }
//     }
// }
// // ========   
            // find binary to decimal  

// import java.util.*; 
// public class Practice {  

//     public static void binTodec(int binNum) { 
//         int myNum = binNum;
//         int pow = 0;
//         int decNum = 0;

//         while (binNum > 0) {
//             int lastDigit = binNum % 10; 
//             decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

//             pow++;
//             binNum = binNum/10;
//         } 
//         System.out.println("decimal of " + myNum+ " = " + decNum);
//     }
//     public static void main(String args []) { 
//         binTodec(1011);
//     }
// } 
// ======== 
                // decimal to binary 

// import java.util.*; 

// public class Practice { 

//     public static void decToBin(int n){ 
//        int  myNum = n;
//         int pow = 0;
//         int binNum = 0;

//         while (n >0){
//             int rem = n % 2 ;
//             binNum = binNum + (rem * (int)Math.pow(10,pow));

//             pow++; 
//             n = n/2;
//         } 
//         System.out.println("binary form of " + myNum + " = "+ binNum);

//     }

//     public static void main(String[] args) { 
//         decToBin(7);
//     }
// } 
//                 // scope - mathod scope 
// public class Practice {
//      int n = 4 // its not work 
//     public static void main (String args[]){ 

//         int n = 30+4; 
//         System.out.println(n);  
//       }
// }      
        // find avg of numbers:-

// import java.util.*; 

// public class Practice {

//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in); 
//         System.out.print("a = ");
//         int a = sc.nextInt(); 
//         System.out.print("b = ");
//         int b = sc.nextInt(); 
//         System.out.print("c = ");
//         int c = sc.nextInt();


//         int avg = (a + b + c)/3;
//         System.out.println("avg of given numbers is =" + avg);
//     }
// }  
// =========== 
// import java.util.*;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//          boolean isPrime = true;
//         if (isPrime) {
//             return false ;
//         } 
//         if (x % 2 == 0) {
//             System.out.println("it is even");
//         } else {
//             System.out.println("its odd num");
//         }
//     }
// }


 




