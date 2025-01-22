
//         // Stack using arraylist 


// import java.util.ArrayList;

// public class Stacks {
//     static class newStack {
//         static ArrayList<Integer> list = new ArrayList<>(); 
//         public static boolean isEmpty() {
//             return list.size() == 0; 
//         }  

//         // push 
//         public static void push(int data){
//             list.add(data); 
//         } 

//         // pop 
//         public static int pop() {
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = list.get(list.size() - 1);
//             list.remove(list.size()-1);
//             return top;
//         } 

//         // peek 
//         public static int peek() {
//             if(isEmpty()){
//                 return -1; 
//             }
//             return list.get(list.size() - 1 );
//         }
//     } 

//     public static void main(String args []){
//         newStack s = new newStack(); 
//         s.push(3); 
//         s.push(4);
//         s.push(5);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();

//         }
//     }
// }


// ==================================================================================================== 
// ==================================================================================================== 


//           // using linkedList 

// import java.util.ArrayList;

// public class Stacks { 

//     static class Node{
//         int data; 
//         Node next; 
//         Node(int data) {
//             this.data = data; 
//             this.next = null; 
//         }
//     }

//     static class newStack {
//         static Node head = null; 

//         public static boolean isEmpty() {
//             return head == null; 
//         }

//         // push 
//         public static void push(int data) {
//             Node newNode = new Node(data);

//             if(isEmpty()){
//                 head = newNode; 
//                 return; 
//             }

//             newNode.next = head; 
//             head = newNode; 
//         } 

//         // pop 
//         public static int pop() {
//             if(isEmpty()){
//                 return -1; 

//             }
//             int top = head.data; 
//             head = head.next; 
//             return top; 
//         } 

//         // peek 
//         public static int peek() {
//             if(isEmpty()) {
//                 return -1; 
//             }
//             return head.data;
//         }
//     }

//     public static void main(String args []){
//         newStack a = new newStack(); 
//         a.push(4);
//         a.push(5);
//         a.push(6); 

//         while(!a.isEmpty()) {
//             System.out.println(a.peek());
//             a.pop();
//         }
//     }
// }


// ==================================================================================================== 
// ==================================================================================================== 



//       // using java Collections Framework for easily solve 


// import java.util.*; 

// public class Stacks {
//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }



// ==================================================================================================== 
// ==================================================================================================== 


    // push at the bottom of the stack 

// import java.util.*; 

// public class Stacks{   

//     public static void pushAtBottom(Stack<Integer> s, int data){

//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top  = s.pop(); 
//         pushAtBottom(s, data);
//         s.push(top);
//     }

//     public static void main(String args []){
//         Stack<Integer> s = new Stack<>(); 
//         s.push(2);
//         s.push(3);
//         s.push(4);

//         pushAtBottom(s, 5);
//         while(!s.isEmpty()){
//             System.out.println(s.pop());

//         }
//     }
// }
















































































