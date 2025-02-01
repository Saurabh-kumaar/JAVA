// public class OOPS { 

//     public static void main(String args[]){
//         Pen p1 = new Pen();   // created a new 
//         p1.setColor("Red");
//         System.out.println(p1.getColor()); 

//         p1.setTip (5); 
//         System.out.println(p1.getTip());  

//         p1.setColor("yellow");
//         System.out.println(p1.getColor());

//         // BankAccount myAcc = new BankAccount(); 
//         // myAcc.username = "rajubhai";
//         // myAcc.setPassword("ahdfui");
//     }
    
// }


//     // pass 

// // class BankAccount {
// //     public String username; 
// //     private String password; 
// //     public void setPassword(String pwd){
// //         password = pwd;

// //     }
// // }

// class Pen { 
//     private String color; 
//     private int tip; 
//     String brand ; 

//     // Getter .................................

//     String getColor(){
//         return this.color;
//     } 

//     int getTip (){
//         return this.tip;
//     } 

//     // setter ...................................

//     void setColor(String newColor){
//         this.color = newColor; 
//     } 

//     void setTip (int newTip){
//         this.tip = newTip ; 
//     } 
// }  
 
                    // Constructor 

// public class OOPS {

//     public static void main(String args []){
//         Student s1 = new Student("hello bhai");
//         // System.out.println(s1.name);
//     }
// }

// class Student {
//     String name;
//     int roll; 

//     Student (String name){ 
//         System.out.println("Constructor is called..........");
//      }
// }

// ===================================================================================================
// ===================================================================================================

// public class OOPS {

//     public static void main(String args []){
//         Student s1 = new Student(); 
//         s1.name = "shardha";
//         s1.roll = 987; 
//         s1.password = "abcd"; 


//         s1.marks[0] = 100;
//         s1.marks[1] = 90;
//         s1.marks[2] = 80;

//         Student s2 = new Student(s1); //copy
//         s2.password  = "xyz";
//          s1.marks[2] =  100; 
//         for(int i=0; i<3; i++){
//             System.out.println(s2.marks[i]);
//         }
//     }
// }
 
// class Student { 
//     String name; 
//     int roll ; 
//     String password; 
//     int marks [];

//     // shallow copy constructor 
//     Student (Student s1){
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.marks = s1.marks;
//     } 

//     Student(){
//         marks = new int[3];
//         System.out.println("constructor is called.......");
//     } 

//     Student(String name){
//         marks = new int[3];
//         this.name = name; 
//     }
//     Student(int roll){
//         marks = new int[3];
//         this.roll = roll; 
//     }
// }


// ============================================================================================= 
// ============================================================================================= 

 
// Destructors 

// Inheritance :- 

        // single level inheritance:- 

// public class OOPS {

//     public static void main(String args []){ 
//         Fish shark = new Fish();
//         shark.swim();
//     }
// }

// // Base class 
// class Animal {
//     String color; 

//     void eat() {
//         System.out.println("eats");
//     } 

//     void breathe(){
//         System.out.println("breathes");
//     }
// }

// //                   Derived class 

// class Fish extends Animal {
//     int fins ; 

//     void swim() {
//         System.out.println("swim in water ");
//     }
// }

// ==== 

// public class OOPS {

//     public static void main(String args []){ 
//         Dog dobby = new Dog(); 
//         dobby.eat(); 
//         dobby.legs = 4; 
//         System.out.println(dobby.legs);
//     }
// }

// // Base class 
// class Animal {
//     String color; 

//     void eat() {
//         System.out.println("eats");
//     } 

//     void breathe(){
//         System.out.println("breathes");
//     }
// }
 
// // Derived class 

// class Mammals extends Animal{
//     int legs; 
// }

// class Dog extends Mammals {
//     String breed; 
// }
//   ======

// polymorphispm 

                // method overloading :-

// public class OOPS {

//     public static void main(String args[]){ 
//         Calculator calc = new Calculator(); 
//         System.out.println(calc.sum(2, 4));
//         System.out.println(calc.sum((float)3.2, (float)4.1));
//         System.out.println(calc.sum(1,2,3));
//     }
// }


// class Calculator {
//     int sum(int a, int b){
//         return a + b; 
//     } 

//     float sum (float a, float b){
//         return a + b; 
//     }

//     int sum (int a, int b, int c){
//         return a + b + c ;
//     }
// }

        // Mehtod Overriding :--..

// public class OOPS {

//     public static void main(String args[]){ 
//         Deer d = new Deer(); 
//         d.drink();

//     }
// }

// // parent class 
// class Animals {
//     void eat(){
//         System.out.println("eat anything");
//     }
// } 

// // child class 
// class Deer extends Animal {
//     void eat(){
//         System.out.println("eat grass");
//     }
// }

//             // overriding :-

// // parent class 
// class Animal {
//     void drink(){
//         System.out.println("drink only daru");
//     }
// }

// // child class 
//  class Dog extends Animal{
//     void drink(){
//         System.out.println("drink only bear ");
//     } 
// }
 
// ============================================================================================= 
// ============================================================================================= 

                            // Abstaction 

//  public class OOPS {
 
//     public static void main(String args []){ 
//         Horse h = new Horse(); 
//         h.eats();
//         h.walk();

//         Chicken c = new Chicken(); 
//         c.eats();
//         c.walk();
//     }
//  }

    // abstract class 
// abstract class Animal{
//     void eats() {
//         System.out.println("animal eats");
//     } 
//     abstract void walk(); 
// }
 

// class Horse extends Animal {
//     void walk() {
//         System.out.println("walks on 4 legs");
//     }
// }

// class Chicken extends Animal {
//     void walk () {
//         System.out.println("walks on 2 legs");
//     }
// }

// ============================================================================================= 
// ============================================================================================= 


// Static Keyword  :- 

// public class OOPS {

//     public static void main(String args []){
//       Student s1 = new Student(); 
//       s1.schoolName = "raju"; 
      
//       Student s2 = new Student(); 
//       System.out.println(s2.schoolName); 

//       Student s3 = new Student(); 
//       s3.schoolName = "oxford";
//       System.out.println(s3.schoolName);
//     }
// }

// // -------- class 

// class Student { 
//     String name ; 
//     int roll; 

//     static String schoolName; 

//     void setName(String name){
//         this.name = name; 
//     }

//     String getName(){
//         return this.name; 
//     }
// }

// ============================================================================================= 
// ============================================================================================= 

// Super Keyword :- 

public class OOPS {

    public static void main(String args []){
        Horse h = new Horse();
        System.out.println(h.color);

    }
}
 
 class Animal {
    String color; 
    Animal(){
        System.out.println("animal is constructor is called");
    }
 }

 class Horse extends Animal { 

    Horse () {
        super.color = "brown";  // ese animal class ka constructor call ho jayega 
        System.out.println("horse constructor is called");
    }
 }

// // ==============================================================================================
// // ==============================================================================================

                // this is another question - factorial 

// import java.util.*; 

// public class OOPS {
 
//     public static void printFactorial(int n){
//         int factorial = 1; 

//         for(int i=n; i>=1; i--){
//             factorial = factorial * i; 
//         } 
//         System.out.println(factorial);
//         return; 
//     }
//     public static void main(String args []){
//         Scanner sc =  new Scanner(System.in);;
//         int n = sc.nextInt(); 

//         printFactorial(n);
//     }
// }

// ==================================================================================
// ==================================================================================

            // a power n and even odd , find power value 


// import java.util.*; 
 public class OOPS{
 
    public static void main(String args []){

        int a = 2, n = 7;   // base = 2 ,  exponent = 7
        int ans = 1; 

        while(n > 0 ){
            if(n % 2 == 1){
                ans = ans * a; 
            } 
            n = n / 2; 
            a = a * a;
        }
        System.out.println(ans);
    }
}

// ====================================================================================
// ====================================================================================
 
 




















































































































































