
     // ******* Add two Value ***** 
//      public class saurabh{
        // public static void main ( String args []){
                // Scanner sc = new Scanner (System.in);

        // int a = sc.nextInt();

        // int b = sc.nextInt();

        // int sum = a + b ; 
        // System.out.println(sum); 
        // }
//  }



         // ******* multiple of two number *********

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int mul = a*b;
        // System.out.println(mul);
// ============================================================== 




        // ********* Calculator*********


        // System.out.println("1, Add ");
        // System.out.println("2, Subtract");
        // System.out.println("3, multiple");
        // System.out.println("4, division");
        // int button = sc.nextInt(); 
        
        // int a = sc.nextInt();
        
        // int b = sc.nextInt();
         
        //   switch(button) { 
        //     case 1 :System.out.println( a + b );
        //     break; 

        //     case 2 :System.out.println( a - b );
        //     break; 

        //     case 3 :System.out.println( a * b );
        //     break;

        //     case 4 :System.out.println( a/b);
        //     break;
 
        //     default : System.out.println("invalid click");
        //   } 
// =============================================================




     
         //********* IF and else ********
    // ********find even or odd number ***********************

    //     int x = sc.nextInt();

    //     if ( x % 2 == 0 ){
    //         System.out.println("even");

    //     } else { 
    //         System.out.println("odd"); 
        //     }
// =============================================================
        
        
        
        
        //   ********** IF else statement use ********************
        
        // int a = sc.nextInt(); 
        // int b = sc.nextInt(); 

        // if (a==b){
        //     System.out.println("equal");

        // } else {
        //     if ( a > b ) {
        //         System.out.println("a is greater");
        //     }else {
        //         System.out.println("a is lesser "); 
        //     } 
        // }  
        // ============================================================
       


// *********practice question**************
//         import java.util.*;
//     public class harry {
//     public static void main(String args [] ){
//       Scanner sc = new Scanner( System.in); 
//       int button = sc.nextInt(); 

//       if(button == 1){
//         System.out.println("Hello");
//       }else if ( button == 2 ){
//         System.out.println("Namste");
//       }else if (button ==3){
//         System.out.println("pranam");

//       }else if ( button==4){
//         System.out.println("invalid");
//       }  
//       }       
//     } 
// ===============================================================



// *********** switch ( button use )****************

//     import java.util.*;
    
//      public class harry {
//         public static void main ( String args []){
//             Scanner sc = new Scanner( System.in);
//             int button  = sc.nextInt(); 

//             switch( button){
//                 case 1 : System.out.println("Hello");
//                 break;

//                 case 2 : System.out.println(" what are you doing ");
//                 break;

//                 case 3 : System.out.println("where are you from ");
//                 break;

//                 case 4 : System.out.println("your name ");
//                 break;
                
//             }


//         }
//      }
// ============================================================



// *********** for loop ***********
//    import java.util.*;
//    public class harry {
//     public static void main ( String args []){ 
//             Scanner sc = new Scanner ( System.in);

//             // for ( int counter = 0; counter < 11; counter++ ){
//             //     System.out.println(counter+" "); 
//             // } 
            //    *************
//             for ( int i=0; i <100; i++){
//                 System.out.println(i+" "); 
//             }
//     } 
//    }
//  =================================================================


        // ******** while loop ***********
        //     Scanner sc = new Scanner ( System.in ); 
        //     int i = 0 ;
        //     while ( i<100){
        //         System.out.println(i); 
        //         i = i+1 ;
        //     }
        // =============================================================
 
//   ********** Do while loop ******
//         import java.util.*;

// public class saurabh {
//         public static void main ( String args [] ){
//             int i = 0;
//             do{
//                 System.out.println(i);
//            i=i+1;
//          }
//             while (i<50); 
//         }
//     } 
// ==================================================================
 

//  ****** sum of first natural number **********
//      import java.util.*;
//     public class saurabh{
//         public static void main ( String args [] ){
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             int sum = 0;

//             for ( int i = 0; i<=n; i++){
//                 sum = sum + i;

//             }
//             System.out.println(sum); 
//         }
//     } 
// ================================================================


// ************ table  ***********
// import java.util.*;
//     public class saurabh{
//         public static void main ( String args [] ){
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             for ( int i = 1 ; i<11; i++ ){
//                 System.out.println(i*n); 
//             }
//         }
//     }
// ===========================================================



// ******* star pattern ***********
//  import java.util.*;
//     public class harry {
//         public static void main ( String args []) {
//         // Scanner sc = new Scanner (System.in);
//         // int  i = sc.nextInt();

//         for( int i = 1; i<=4; i++){
//                 for ( int j = 1; j<=5; j++){
//                         System.out.print( "*");
//                 }
//                 System.out.println(); 

//                 }
//         }
//     } 

// ==============================================
  
// ********* hollow rectangle pattern **************
// import java.util.*;
//     public class harry {
//         public static void main ( String args []) {
//                 int  n = 4;
//                 int m = 5;

//                 for ( int i=1; i<=n; i++){
//                         for( int j=1; j<=m; j++){
//                                 if ( i==1 || j==1 || i==n || j==m){
//                                         System.out.print("*"); 

//                                 } else {
//                                         System.out.print(" ");
//                                 }
//                         }
//                         System.out.println();
//                 }
                  
//         }
// } 

//=================================================================== 


// *******inverted half prymid pattern***********
//     public class harry {
//         public static void main ( String args []) { 
        
//                 int n = 4;
//                           for ( int i=1; i<=n; i++){

//                                          for( int j =1; j<=n-i; j++){ 
//                                                 System.out.print(" ");                   
//                                 }
//                                 for( int j =1; j<=i; j++){ 
//                                         System.out.print("*");                         
//                                 }
//                                 System.out.println();
//                         }
//                 }
//         } 
// ========================================================================



// *********** half pyramid number ********

// public class harry {
//         public static void main ( String args []) { 
//                 int n = 5;
//                           for ( int i=1; i<=n; i++){
//                                  for( int j=1; j<=i; j++){ 
//                                          System.out.print(j);
//                                 }
//                                          System.out.println();            
//                         }
//                 }
//         }
// ================================================================


// ************ pyramid number ******** 
    
// public class saurabh{
//         public static void main( String args []){
//                  int n = 5;
//                  for ( int i=1; i<=n; i++){
//                         for ( int j=1; j<=n-i+1; j++){
//                                 System.out.print(j);

//                         } System.out.println();

//                  }
//         }
// }
// =====================================================================


//  ****** pattern number ************
// public class saurabh{
//         public static void main( String args []){
//                 int n = 5;
//                 int k = 1;
                
//                 for( int i=1; i<=n; i++){ 
//                         for ( int j=1; j<=i; j++){
//                         System.out.print(k +" ");  
//                         k++;                     
//                         }

//                         System.out.println(); 
//                 }
//         }
// } 
// ====================================================================== 

// ********** pyramid *********** 
// public class saurabh{
//         public static void main ( String args[]){ 
//                 int n = 5;
                
//                 for ( int i=1; i<=n; i++){
//                        for( int j=1; j<=i; j++){
//                         System.out.print("*");
//                        }
//                        System.out.println();
//                 }
//         }
// }
// ======================================================================
// ************** 0 and 1 pattern *********************************
// import java.util.*;
// public class saurabh{
//         public static void main (String args []){
//                 int n = 5 ; 
//                 for ( int i=1; i<=n; i++){
//                         for(int j=1; j<=i; j++){
//                                 int sum = i+j;
//                                 if( sum % 2 == 0 ){
//                                         System.out.print("1 ");                                  
//                                 }else {
//                                         System.out.print("0 ");
//                                 }
//                         }
//                         System.out.println();
//                 }
//         }
// }
// =========================================================================


// ****************butteryfly pattern *********************
// import java.util.*;
//  public class saurabh {
//         public static void main (String args[]){
//                 int n = 5; 

//                 // upper half 
//                 for(int i=1; i<=n; i++){
//                     // 1st part 
//                     for(int j=1; j<=i; j++){
//                         System.out.print("*");
//                     }
//                 //spaces 
//                 int spaces = 2*(n-i);
//                 for(int j=1; j<=spaces; j++){
//                         System.out.print(" ");
//                 }
//                 //2nd part 
//                 for (int j=1; j<=i; j++){
//                         System.out.print("*");
//                 }
//                 System.out.println(); 
//                 }

//                 //lower half 
//                 for(int i=n; i>=1; i--){
//                         // 1st part 
//                         for(int j=1; j<=i; j++){
//                             System.out.print("*");
//                         }
//                     //spaces 
//                     int spaces = 2*(n-i);
//                     for(int j=1; j<=spaces; j++){
//                             System.out.print(" ");
//                     }
//                     //2nd part 
//                     for (int j=1; j<=i; j++){
//                             System.out.print("*");
//                     }
//                     System.out.println();
//                     }
//         }
//  } 
//  =============================================================== 


// ******** solid rhombus************
// import java.util.*;
//         public class saurabh{
//           public static void main(String args[]){
//                 int n = 5;

//                 for(int i =1; i<=n; i++){
//                         //spaces
//                         for(int j=1; j<=n-i; j++){
//                                 System.out.print(" ");
//                         }       
                        
//                         for(int j=1; j<=5; j++){
//                                 System.out.print("*");
//                         }
//                         System.out.println( );
//                 }
//           }
//         }
// =======================================================================  


// **********butteryfly***************
// import java.util.*;
//         public class haary{
//                 public static void main (String args []){
//                         int n = 5 ; 
//                         // upper case 
//                         for(int i=1; i<=n; i++){
//                                 // 1st part 
//                                 for ( int j=1; j<=i; j++){
//                                    System.out.print("*");
//                                 }
                                
//                                 // spaces 
//                                 int spaces= 2*(n-i);
//                                 for(int j=1; j<=spaces; j++){
//                                         System.out.print(" ");
//                                 } 

//                                 // 2nd part 
//                                 for (int j=1; j<=i; j++){
//                                         System.out.print("*");
//                                 }
//                                 System.out.println();
//                         } 


//                         for(int i=n; i>=1; i--){
//                                 // 1st part 
//                                 for ( int j=1; j<=i; j++){
//                                    System.out.print("*");
//                                 }
                                
//                                 // spaces 
//                                 int spaces= 2*(n-i);
//                                 for(int j=1; j<=spaces; j++){
//                                         System.out.print(" ");
//                                 } 

//                                 // 2nd part 
//                                 for (int j=1; j<=i; j++){
//                                         System.out.print("*");
//                                 }
//                                 System.out.println();
//                         } 
//                 }
//         }
// ======================================================================= 


// ****************pyramid number********************
// import java.util.*;
//         public class saurabh{
//                 public static void main(String[] args) {
//                         int n = 5; 

//                         for ( int i=1; i<=n; i++){
//                                 // spaces 
//                                 for(int j=1; j<=n-i; j++){
//                                         System.out.print(" ");
//                                 }
//                                 // number 
//                                 for( int j=1; j<=i; j++){
//                                         System.out.print(i +" ");
//                                 }
//                                 System.out.println();
//                         }                     
//                 }
//         }
// ====================================================================== 



// import java.util.*;
//         public class saurabh{
//                 public static void main(String[] args) {
//                         int n = 5;
//                 }
//         } 


// *********************pyramid number **********************

// import java.util.*;
//         public class saurabh{
//                 public static void main(String[] args) {
//                       int n = 5; 

//                         for ( int i=1; i<=n; i++){
//                                 // spaces 
//                                 for(int j=1; j<=n-i; j++){
//                                         System.out.print(" ");
//                                 }
//                                 // number 
//                                 for( int j=1; j<=i; j++){
//                                         System.out.print(i +" ");
//                                 }
//                                 System.out.println();
//                         }                     
//                 }
//         } 

// ************************************************* 
// import java.util.*;
//  public class harry {
//         public static void main ( String args []){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int div = a/b;
//         System.out.println(div);
//         }
//  }
// ====================================================== 



// ********* odd even ***************
// import java.util.*;
//  public class saurabh{
//         public static void main ( String args []){
//         Scanner sc = new Scanner( System.in);
//                 int x = sc.nextInt(); 
//                 if ( x % 2 ==0 ){
//                         System.out.println("Even");

//                 } else {
//                         System.out.println("odd");
//                 }                
//         }
//  }
//  =============================================================== \


// **************function*********************

// import java.util.*; 
// public class saurabh { 
//         public static void printMyName(String name ){
//                 System.out.println(name);
//                 return;
//         }
//         public static void main ( String args[]){
//                 Scanner sc = new Scanner( System.in);
//                 String name = sc.nextLine();

//                 printMyName(name);    // function ko call kiya 
//         }     
// }
// =========================================================== 


// ********** add two number in function ***********
// import java.util.*; 
// public class saurabh { 
//         public static int calculateSum (int a , int b  ){
//               int sum = a + b ; 
//                 return sum ;
//         }
//         public static void main ( String args[]){
//                 Scanner sc = new Scanner( System.in);
//                 int a = sc.nextInt();
//                 int b = sc.nextInt();

//                 int sum = calculateSum(a,b);    // function ko call kiya 
//                 System.out.println("sum of 2 number is : "+sum );
//         } 
// }
// ============================================================  

//  **************** mul of two number in function***************
// import java.util.*;
//         public class saurabh{
//                 public static int calculateProuduct( int a , int b ){
//                         return a*b;
//                 }
//                         public static void main( String args [] ){
//                                 Scanner sc = new Scanner(System.in);
//                                 int a = sc.nextInt();
//                                 int b = sc.nextInt();

//                                 System.out.println("Product of 2 number is : "+calculateProuduct (a,b)) ;
//                         }
//                 }
        

// ********************factorial************************************  


// import java.util.*;

//         public class saurabh { 

//                 public static void  calculate ( int n ){
//                         // loop 
//                         int factorial = 1;

//                         for(int i=n; i>=1; i--){
//                                 factorial= factorial * i; 
//                         }
//                         System.out.println(factorial);
//                         return; 
//                 }
//                 public static void main (String args []){
//                     Scanner sc = new Scanner(System.in); 
//                     int n = sc.nextInt(); 

//                     calculate(n); 

//                 }
//         }
// =======================================================================  






// **** enter 3 number from the user make functioin to print their average**********

//  import java.util.*;
//         public class Solution{
//                 public static void main (String args []){
//                         Scanner sc = new Scanner(System.in); 

//                         int a = sc.nextInt();
//                         int b = sc.nextInt();
//                         int c= sc.nextInt(); 

//                         int average  = ( a + b + c ) / 3 ;
//                         System.out.println(average);
//                 } 
//         }
// ================================================================================== 


// *************** funtion in java************************
// import java.util.*;
//         public class function {
//                 public static void myName(String name ){
//                         System.out.println(name);
//                         return;
//                 }
//                 public static void main (String args []){
//                         Scanner sc = new Scanner(System.in);
//                         String name = sc.nextLine();

//                          myName(name);    //  call kiya function ko   
//                 }
//         }
// ================================================================================== 



// ************ add 2 number in function **************
// import java.util.*;
//         public class function{
//                 public static int calculate( int a , int b ){
//                         Scanner sc= new Scanner(System.in);
//                         int sum = a+b;
//                         return sum;

//                 }
//                 public static void main ( String args []){
//                         Scanner sc = new Scanner(System.in);
//                         int a = sc.nextInt();
//                         int b = sc.nextInt(); 

//                         int sum = calculate(a,b);
//                         System.out.println("sum of 2 number is : "+ sum);
//                 }
//         }
// ======================================================================== 




// **************** mul of 2 number in function ****************
// import java.util.*;
//         public class function{
//                 public static int calculate ( int a , int b ){
//                         Scanner sc = new Scanner(System.in);
//                         int mul = a*b;
//                         return mul;
//                 }
//                 public static void main (String args []){
//                         Scanner sc = new Scanner(System.in); 
//                         int a= sc.nextInt();
//                         int b= sc.nextInt(); 

//                         int mul = calculate(a,b);
//                         System.out.println("mul of 2 number is : "+ mul);
//                 }
//         }
// =======================================================================  



// *************** division of 2 number in function *********************

// import java.util.*;
//         public class funtion{
//                 public static int subtract ( int a , int b ){
//                         Scanner sc = new Scanner(System.in);
//                         int div =a/b;
//                         return div;
//                 }
//                 public static void main (String args[]){
//                         Scanner sc = new Scanner(System.in);
//                         int a = sc.nextInt();
//                         int b = sc.nextInt();

//                         int div = subtract(a,b);
//                         System.out.println("division of 2 number is "+ div);
//                 }
//         }
// ============================================================================= 

// ******************** factorial ************************************* 
// import java.util.*;
//         public class funtion { 
//                 public static void print ( int n ){
//                         // loop  
//                         int factorial = 1;

//                         for ( int i=n; i>=1; i--){
//                                 factorial = factorial*i;
//                         } 

//                         System.out.println(factorial);
//                         return;
//                 }
//                 public static void main (String args []){
//                         Scanner sc = new Scanner(System.in);
//                         int n = sc.nextInt();

//                         print (n);
//                 }
//         }
// =============================================================================


// **************** add 2 number in function ***************************

// import java.util.*;
//         public class function { 
//                 public static int gautam(int a , int b ){
//                         Scanner sc = new Scanner ( System.in);
//                         int sum = a + b ; 
//                         return sum ; 
//                 }
//                 public static void main (String args []){
//                         Scanner sc = new Scanner(System.in);
//                         int a = sc.nextInt();
//                         int b = sc.nextInt();

//                         int sum = gautam(a,b);
//                         System.out.println("sum of 2 number is " +sum );
//                 }
//         }
// ==========================================================================  

// ********************** first program in java ****************** 
//  import java.util.*; 
//         public class function{ 
//         public static void main ( String [] args ) {  
//                 Scanner sc =  new Scanner (System.in);

//                 int a = sc.nextInt();  
//                 int b = sc.nextInt();  

//                 int sum = a+b ;  
//                 System.out.println(sum); 
//         }
// }
//  =================================================== 


// *********** if use compare two elements ************
// import java.util.*;
//         public class saurabh {
//                 public static void main ( String args []){
//                 Scanner sc = new Scanner (System.in);
//                 int a = sc.nextInt();
//                 if ( a % 2 == 0 ){
//                         System.out.println("Even");

//                 } else {
//                         System.out.println("odd");
//                 }
//         }
// }

// ==========================================================  
// // ************** use else if statement *************** 
// import java.util.*;
// public class saurabh {
//         public static void main ( String args []){
//                  Scanner sc = new Scanner(System.in); 
//                 int a = sc.nextInt();
//                 int b = sc.nextInt();

//                 if ( a == b ){
//                         System.out.println("Equal");
//                 } else {
//                         if ( a > b) {
//                                 System.out.println("greater");
//                 } else { 
//                         // if ( a < b){
//                         System.out.println("lesser");                 
//                 }
//         }
//         }
// }
// =============================================================== 




//  // practice ************************************ 
// import java.util.*;
//         public class Solution{
//                 public static void main ( String args []) {
//                         Scanner sc = new Scanner ( System.in);

//                          int age = sc.nextInt();
//                         // int age = 18 ; 
//                         if ( age >= 18 ){
//                                 System.out.println("eligble");

//                         } else { 
//                                 System.out.println("not eligble");
//                         }
//                 }
//         }
// =========================================================================== 


//  // ********* find odd even value **************** 
// public class PrintOddNumbers {
//     public static void main(String[] args) {
//         int limit = 40;  // You can change this limit to any number

//         System.out.println("even numbers from 1 to " + limit + ":");

//         for (int i = 1; i <= limit; i++) {
//             // Check if the number is odd
//             if (i % 4 == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }
// ===================================================  

//// *********** table rule ***********
//  import java.util.*;
//         public class Solution { 
//                 public static void main ( String args []){
//                          Scanner sc = new Scanner( System.in);   
//                         int n = sc.nextInt(); 

//                         for ( int i = 1; i<11; i++ ){
//                                 System.out.println(i*n);
//                         }                 
//                 }
//         }
// ===============================================================================  






// //  #Array season 




// // ************ find result easily way in arrays ****************** 

// import java.util.*;
//         public class Arrays {
//                 public static void main ( String arags [] ){
//                         // Scanner sc = new Scanner ( System.in); 
//                         int [] marks = new int [3];

//                          marks [0] = 89;    // coding 
//                         marks [1] =  98 ;    // java 
//                         marks [2] = 75;    // python 

//                         System.out.println(marks [ 0 ]);   
//                         System.out.println(marks [ 1 ]);   
//                         System.out.println(marks [ 2 ]);   
//                 }
//         }
// ======================================================================  


// // *************** find value in arrays help of loop ****************
// import java.util.*;
//         public class Arrays {
//                 public static void main ( String args []){
//                         int [ ] marks = new int [3];

//                         marks [ 0 ] = 78;
//                         marks [ 1 ] = 34;
//                         marks [ 2 ] = 45;

//                         for ( int i=0; i<3; i++){
//                                 System.out.println( marks[i]);
//                         }
//                 }
//         }
// ================================================================  
 
// // ************** find valueev******************** 
// import java.util.*; 
//          public class Arrays { 
//                 public static void main( String args [] ){
//                         int marks [] =   { 46 , 45,34 } ;  

//                         // System.out.print( " enter your input in array =");  
//                         for ( int i = 0; i<3; i++ ) {
//                                 System.out.println( marks[i] );       
//                         }   
//                 }       
//         }




// // Take an array of names as input from the user and print them on the screen  ******************* 

// import java.util.*;


//    public class Arrays { 
//     public static void main (String args [] ){
//             Scanner sc = new Scanner ( System.in);
//             int size = sc.nextInt();

//             String names [] = new String  [ size ]; 
            
            
//             //input 
//             for(int i=0; i<size; i++) {
//                 names[i] = sc.next(); 
//             }
           
//             //output
//              for(int i=0; i<names.length; i++) {
//                  System.out.println("name " + (i+1) +" is : " + names[i]);
//              }
            
//          }
//       } 
// ====================================================================================== 





//  // ** TwoDArrays ** 



// import java.util.*;
//         public class TwoDArrays {
//                 public static void main ( String args []){
//                         Scanner sc = new Scanner ( System.in);
//                         int rows = sc.nextInt();
//                         int cols = sc.nextInt();

//                         int [] [] numbers = new int [rows][cols];

//                         // input 
//                         // rows 
//                         for ( int i=0; i<rows; i++){ 
//                                 // columns 
//                                 for ( int j=0; j<cols; j++){
//                                         numbers[i][j] = sc.nextInt();
//                                 }
//                         } 
//                         // output 
//                         for ( int i=0; i<rows; i++){
//                                 for ( int  j=0; j<cols; j++){
//                                         System.out.print(numbers[i][j] + " ");
//                                 }
//                                 System.out.println();
//                         }
//                 }

//         } 


// ===================================================================================
// ===================================================================================
// ===================================================================================
// ===================================================================================



//  // ***STRING 


// //********** normal name print **************
// import java.util.*;
//         public class Strings{
//                 public static void main ( String args []){
//                         Scanner sc = new Scanner ( System.in);
//                         String name = sc.nextLine();
//                         System.out.println("your name is : "+ name);
//                 }
//         }
// ===================================================================== 

 

// // ************** add two number in string ****************************** 
// import java.util.*;
//         public class Strings{
//                 public static void main ( String args []){
//                         // Scanner sc = new Scanner ( System.in);
//                         String firstName = "munaa";
//                         String lastName = "bhai";
//                         String fullName =  firstName + "@" + lastName;
//                         System.out.println(fullName); 
//                 }
//         } 


// // *********** program for count word print line by line *************** 


// import java.util.*;
//         public class Strings{
//                 public static void main ( String args []){
//                         // Scanner sc = new Scanner ( System.in);
//                         String firstName = "munaa";
//                         String lastName = "bhai";
//                         String fullName =  firstName + "@" + lastName; 
//                         //munna@bhai 
//                         System.out.println(fullName.length()); 


//                         // charAt 
//                         for(int i=0; i<fullName.length(); i++){
//                                 System.out.println(fullName.charAt(i));
//                         }
//                 }
//         } 
// =============================================================================== 



// // ********** use length and charAt *************************** 
// import java.util.*;
//         public class Strings {
//                 public static void main ( String args []){ 
//                         // Scanner sc = new Scanner (System.in);
//                         String firstName = "saurabh";
//                         String secondName = "gupta" ;
//                         String fullName = firstName+ " "+secondName;

//                         System.out.println(fullName.length()); 

//                         for ( int i = 0; i<fullName.length(); i++){
//                                 System.out.println(fullName.charAt(i));
//                         }               
//                 }
//         } 
// ========================================================================== 



// //compare between 2 value ************************** 
//    import java.util.*;
//         public class Strings {
//                 public static void main ( String args []){

//                         String firstName = "saurabh";
//                         String secondName = "Saurabh"; 

//                         if ( firstName.compareTo(secondName) ==0){
//                                  System.out.println("String are equal");

//                         } else {
//                                 System.out.println(" String are not equal");
//                         }
//                 }
//         }
// ======================================================================== 



// //************** print a name **********************  
//    import java.util.*;
//         public class Strings {
//                 public static void main ( String args []){
//                         Scanner sc = new Scanner ( System.in); 
//                         String name = sc.next();
//                         String name = "saurabh";
//                         System.out.println(name ); 
//                 }
//         }
// =============================================================   


// //************ Concatenation ( joining 2 strings) 
// import java.util.*;
//         public class Strings {
//                 public static void main ( String args []){
//                         Scanner sc = new Scanner (System.in);
//                         String name1 = "tonny";
//                         String name2 = "stark"; 

//                         String fullName = name1 + " " + name2 ;
//                         System.out.println(fullName); 
//                 }
//         }
// =============================================================== 


// // ********** print length of a string *********************** 
//         import java.util.*;
//         public class Strings {
//                 public static void main ( String args []){
//                         Scanner sc = new Scanner (System.in);
//                         String name1 = "tonny";
//                         String name2 = "stark"; 

//                         String fullName = name1 + " " + name2 ;
//                         System.out.println(fullName.length()); 
//                 }
//         } 
// ================================================================== 


// // ********** charAt use ************ 
// import java.util.*;
//         public class Strings {
//                 public static void main (String args []){
//                         Scanner sc = new Scanner (System.in);
//                         String name1 = "tommy";
//                         String name2 = "harry"; 

//                         String fullName = name1 +" " + name2;
//                         System.out.println(fullName.length());  

//                         for ( int i=0; i<fullName.length(); i++){
//                                 System.out.println(fullName.charAt(i));
//                         }
//                    } 
//         } 
// ============================================================================== 


// // ***** check equality and correct ans incorrect ans ******************** 


// import java.util.*;
//         public class Strings {
//                 public static void main(String args []){
//                         String name1 = "Tony";
//                         String name2 = "Tony";

//                         if ( name1.equals(name2)){
//                                 System.out.println("They are the same string");
//                         } else {
//                                 System.out.println("They are different string");
//                         }  

//                         // DO NOT USE == to check for string equality it is same as upper 
//                         // gives correct answer here  

//                         if ( name1 == name2) {
//                                 System.out.println("they are the same string");
//                         } else {
//                                 System.out.println("They are the different string ");
//                         }  

//                         // Gives incorrect answer here 

//                         if ( new String ("Tony ") == new String ("Tony")){
//                                 System.out.println("They are the same string ");
//                         } else {
//                                 System.out.println("They are different string ");
//                         }
//                 }
//         }
// ============================================================= =============================


//  // Substring  


 // // ( its use beginIndex and endIndex )

// public class Strings {
//         public static void main (String args []){
//                 String name = "TonyStark";
//                 System.out.println(name.substring(2, 4));
//         }
// } 
// ======================================================================


//  // PreseINt Method of Integer class 


// public class Strings {
//         public static void main (String args []) {
//                 String str = "123";  
//                 int number = Integer.parseInt(str); 
//                 System.out.println(number); 
//         } 
// } 

// public class Strings {  
//         public static void main (String args []){  
//                 int number = 1234;  
//                 String str = Integer.toString(number);  
//                 System.out.println(str.length()); 
//         }  
// } 



// ************************************************************ 
//         ************* java *****************
// ******************** String *********************** 
// *******************   are    **************************** 
// ****************** Immutable  *****************************
// ************************************************************ 

// import java.util.*;
//         public class Strings {
//                 public static void main (String args []){
//                         Scanner sc = new Scanner (System.in);
//                         int size = sc.nextInt();
//                         String array [] = new String [size];
//                         int totLength = 0; 

//                         for ( int i=0; i<size; i++){
//                                 array[i] = sc.next();
//                                 totLength = totLength + array[i].length();
//                         }
//                         System.out.println("Total lengyh :- "+ totLength);
//                 }
//         }
// // ***************************************************************** 


 // // imput a string from user replace  "e to i "

// import java.util.*;
//         public class Strings {
//                 public static void main ( String args []) {
//                         Scanner sc = new Scanner ( System.in) ; 
//                         String str = sc.next() ;
//                         String result = ""; 

//                         for ( int i=0; i<str.length(); i++) {
//                                 if ( str.charAt (i) == 'e') {
//                                         result += 'k';
//                                 } else {
//                                         result += str.charAt(i);
//                                 }
//                         } 
//                         System.out.println(result);
//                 }
//         } 
//// **************************************************************
 

// // ********************** replace wala function ************** 
// import java.util.*;

// public class Strings { 
//         public static void main (String args []) {
//                 Scanner sc = new Scanner (System.in) ;
//                 String str = sc.next ();
//                 String result = "";

//                 for ( int i=0; i<str.length(); i++) {
//                         if (str.charAt(i) == 'e') {
//                                 result += 'i';
//                         } else {
//                                 result += str.charAt(i);
//                         }
//                 } 
//                 System.out.println(result);
//         }
// }
//   **************************************************************


// // take email and output username ***********************  
// import java.util.*;

// public class Strings {
//         public static void main (String args []) {
//                 Scanner sc = new Scanner ( System.in); 

//                 String email = sc.next();

//                 String userName = ""; 

//                 for ( int i=0; i<email.length(); i++) {
//                         if (email.charAt(i) =='@'){
//                                 break;
//                         } else {
//                                 userName += email.charAt(i);
//                         }
//                 } 
//                 System.out.println(userName); 
//         }
// } 

// ===================================================================
// ===================================================================
// ===================================================================
// ===================================================================



// // SUBSTRING PACAKGE ************************* 

// import java.util.*;
// public class Strings {
//         public static void main (String args []){
//                 StringBuilder sb  = new StringBuilder("Tony");
//                 System.out.println(sb); 


//                 // char at index 0 
//                 System.out.println(sb.charAt(0)); 

//                 // set char at index 0 ( new output will like pony replace T)
//                 sb.setCharAt(0,'H');
//                 System.out.println(sb); 

//                 // to add s before input 
//                 sb.insert(0, 'S');
//                 System.out.println(sb);  

//                 // add new char in between input 
//                 sb.insert(3, 'n');
//                 System.out.println(sb);

//                 // delete the extra 'n'
//                 sb.delete(3, 4);
//                 System.out.println(sb);
//         }
// }
// ************************************************************ 



// // APPEND FUNCTION USE **************** 

// import java.util.*;
// public class Strings {
//         public static void main (String args [] ) {
//                 StringBuilder sb = new StringBuilder("h");
//                 sb.append("e");
//                 sb.append("l");
//                 sb.append("l");
//                 sb.append("o");
//                 sb.append("o"); 

//                 // AS your wish you use length()
//                 System.out.println(sb); 
//         }
// }
// ************************************************************* 

// //  reverse function use ************************************* 


// public class Strings {
//         public static void main (String args []) {
//                 StringBuilder sb = new StringBuilder ("saurabh");
//                 sb.reverse();
//                 System.out.println(sb);
//         }
// }
// // ***************************************************************** 


// //================================================================
// //================================================================
// //================================================================
// //================================================================



// // OPERATOR AND BINARY NUMBER SYSTEM 


// // INCREMENT AND DECREMENT 

// import java.util.*;
// public class Strings { 
//         public static void main ( String args []){
//                 Scanner sc = new Scanner (System.in);
//              int a = 10;
//              int b = 0;

//              // pre increment 
//              b = ++a; 

//              // post increment 
//              // b = a++;

//              // pre decrement 
//              //  b = --a;

//               // post decrement 
//               // b = a--; 

//              System.out.println(a);  
//              System.out.println(b);  
//         }
// } 
// *********************************************************** 

//  // check all function 

// public class Strings {
//         public static void main (String [] args ){
//                 int p = 9 , q = 10;

//                   System.out.println(p | q );   // 11 
//                   System.out.println(p & q );  // 8
//                   System.out.println(p ^ q );  // 3
                  
//                   System.out.println(p << 1);  // 18 
//                   System.out.println(p << 2);  // 36

//                   System.out.println(p >> 2);  // 2 
//                   System.out.println(p >> 1);  // 1 
//             }
// } 
// ************************************************************ 



// // print week day 

// import java.util.*;
// public class Strings {
//         public static void main (String args []){
//                 Scanner sc = new Scanner (System.in);
//                 int day = 7;
                
//                 switch(day){
//                         case 1 : System.out.println("Monday");
//                         break;

//                         case 2 : System.out.println("Tuesday");
//                         break; 

//                         case 3 : System.out.println("Wednesday");
//                         break;

//                         case 4 : System.out.println("Thursday");
//                         break;

//                         case 5 : System.out.println("Friday");
//                         break;

//                         case 6 : System.out.println("Saturday");
//                         break; 

//                         case 7 : System.out.println("Sunday");
//                         break;
//                 }
//         }
// }
// ****************************************************************** 
// ================================================================== 
// ================================================================== 
// ====================================================================== 
// =============================================================== 


// //  ************** BIT MANIPULATION *********** 


// //__#get bit ;

//  import java.util.*;
// public class Bits {
//         public static void main (String args []){
//                 int n = 5; //
//                 int pos = 2;
//                 int bitMask = 1<<pos ;

//                 if((bitMask & n ) == 0) {
//                         System.out.println("bit was zero");
//                 } else {
//                         System.out.println("bit was one ");
//                 }
//         }
// }
// *********************************************************************** 

// //__#set bit ;

//  import java.util.*;
//  public class bitMask {
//         public static void main (String args []){
//                 int n = 5; // 0101 value of 5 
//                 int pos = 1; // position 
//                 int bitMask = 1 <<pos ;  //(position);

//                 int newNumber = bitMask | n;
//                 System.out.println(newNumber);
//         }
//  }
// **********************************************************************

// //_#clear bit ;

// public class Bits {
//         public static void main ( String args []) {
//                 int n = 5 ;  // 0101 
//                 int pos = 2 ;
//                 int bitMask = 1<< pos ;
//                 int notBitMask = ~ (bitMask); 

//                 int newNumber = notBitMask & n ; 
//                 System.out.println(newNumber); 
//         } 
// } 


// //_#update bit 

// import java.util.*;

// public class Bits {
//         public static void main ( String args[]) {
//                 Scanner sc = new Scanner(System.in);
//                 int oper = sc.nextInt(); 
                
//                 //oper=1 : set oper = 0 : clear 
//                 int n = 5 ; // 0101 -> 0111 -> dec 7 
//                 int pos = 1;

                
//                 int bitMask = 1<<pos; 
//                 //set 
//                 if(oper == 1) {
//                 int newNumber = bitMask | n; 
//                 System.out.println(newNumber);
                 
//                 }  else {
//                         int newBitMask = ~(bitMask);
//                         int newNumber = newBitMask & n ;
//                         System.out.println(newNumber);
//                 }
//         }
// }
// =================================================================== 
// ===================================================================
// ===================================================================
// ===================================================================

     
// // **********  SORTING *************
//      *************************
//         *************


//   import java.util.*; 

// // Bubble sort 
 

// public class Bits { 
//         public static void printArray(int arr []){
//                 for( int i=0; i<arr.length; i++){
//                         System.out.print(arr[i] +" ");

//                 }
//                 System.out.println();
//         }
//         public static void main(String args []){
//                 int arr [] = {9 , 4 , 8 , 2 , 1};
                
//                 //bubble sort
//                 for ( int i =0; i<arr.length-1; i++){
//                         for(int j=0; j<arr.length-i-1; j++){
//                              if(arr[j] > arr[j+1]){

//                                 //swap
//                                 int tamp = arr[j];
//                                 arr[j] = arr[j+1];
//                                 arr[j+1] = tamp ;

//                                 }
//                         }
//                 }
//                 printArray(arr); 

//         }
// }


// // Selection sort 


// public class Bits { 
//         public static void printArray(int arr []){
//                 for( int i=0; i<arr.length; i++){
//                         System.out.print(arr[i]+ " ");
//                 }
//                 System.out.println();
//         }
//         public static void main ( String args []){
//                 int arr [] = { 5, 6, 2, 7, 1};

//                 for(int i=0; i<arr.length-1; i++ ){
//                         for(int j=0; j<arr.length-i-1; j++){
//                                 if(arr[j] < arr[j+1]) {
                                           
                                       // //   swap 
//                                         int tamp = arr[j];
//                                         arr[j] = arr[j+1];
//                                         arr[j+1] = tamp;
//                                 }
//                         }
//                 } 
//                 printArray(arr);
//         }
// }

// =================================================================== 
// ===================================================================



 