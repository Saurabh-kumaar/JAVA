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

// // Derived class  
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
  

// public class OOPS { 

    // public static void main(String args []){  
        Bird = new Bird();
        suga.fly();
    }
} 

// Base class 
class Animal {
    String color; 

    void eat() {
        System.out.println("eats");
    } 

    void breathe(){
        System.out.println("breathes");
    } 

    void fly(){
        System.out.println("fly");
    }
}

// Derived class  
class Fish extends Animal {
    int fins ; 

    void swim() {
        System.out.println("swim in water "); 
    } 
}
 

class Birds extends Animal{
    int fly ;

    void fly(){
        System.out.println("fly in the sky ");
    }
}

































































