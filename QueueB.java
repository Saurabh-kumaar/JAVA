

    //    Add queue help of aarray          


// public class Queue {  
//     static class Queues {
//         static int arr[];
//         static int size;
//         static int rear; 

//         Queues(int n){
//             arr = new int[n]; 
//             size = n; 
//             rear = -1; 

//         } 

//         public static boolean isEmpty() {
//             return rear == -1; 
//         }

        // add 
//         public static void add(int data){
//             if(rear == size-1){
//                 System.out.println("queue is full");
//                 return; 
//             }

//             rear = rear + 1; 
//             arr[rear] = data; 
//         }

//         // remove 
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1; 
//             }

//             int front = arr[0]; 
//             for(int i=0; i<rear; i++) {
//                 arr[i] = arr[i+1]; 
//             }
//             rear = rear - 1 ; 
//             return front; 
//         }

//         // peek 
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return - 1; 
//             }
//             return arr[0];
//         }
//     }

//     public static void main(String args []){
//         Queues q = new Queues(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



// ============================================================================================================ 
// ============================================================================================================ 



            // Queue using Linked List 




// public class Queues {  
//     static class Node{
//         int data ; 
//         Node next; 

//         Node(int data){
//             this.data = data; 
//             this.next = null; 
//         }
//     }
//     static class Queue {
//         static Node head = null; 
//         static Node tail = null; 

//         public static boolean isEmpty(){
//             return head == null & tail == null; 
//         }
        
  
//         // add 
//         public static void add(int data){ 
//             Node newNode = new Node(data);
//             if(head == null) {
//                 head = tail = newNode; 
//                 return; 
//             }
//             tail.next = newNode; 
//             tail = newNode; 
//         }

//         // remove 
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1; 
//             }

//             int front = head.data; 
//             // single element 
//             if(tail == head){
//                 tail = head = null; 
//             } else {
//                 head = head.next; 
//             } 
//             return front; 
//         }


//         // peek 
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return - 1; 
//             }
//             return head.data; 
//         }
//     }

//     public static void main(String args []){
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



// ============================================================================================================ 
// ============================================================================================================ 


            // impliment queue help of java collections frameawork 


// import java.util.*;

// public class QueueB{

//     public static void main(String args []) {    // tc = O(n)
//         // Queue<Integer> q = new LinkedList<>(); 
//         Queue<Integer> q = new ArrayDeque<>(); 
//         q.add(1); 
//         q.add(2); 
//         q.add(3); 
//         q.add(5);  

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove(); 
//         }
//     }
// }



// ============================================================================================================ 
// ============================================================================================================ 


                // Queue using 2 stack 


                
// import java.util.LinkedList;
// import java.util.Queue; 


// public class QueueB {
//     static class Stack {
//         static Queue<Integer> q1 = new LinkedList<>(); 
//         static Queue<Integer> q2 = new LinkedList<>(); 

//         public static boolean isEmpty() {
//             return q1.isEmpty() && q2.isEmpty(); 
//         }

//         public static void push(int data){
//             if(!q1.isEmpty()) {
//                 q1.add(data);
//             } else {
//                 q2.add(data);
//             }
//         }

//         public static int pop() {
//             if(isEmpty()) {
//                 System.out.println("empty stack");
//                 return -1; 
//             }
//             int top = -1; 

//             // case 1
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()) {
//                     top = q1.remove(); 
//                     if(q1.isEmpty()) {
//                         break;
//                     } 
//                     q2.add(top);
//                 }
//             } else { // case 2
//                 while(!q2.isEmpty()) {
//                     top = q2.remove();
//                     if(q2.isEmpty()) {
//                         break; 
//                     }
//                     q1.add(top);
//                 }
//             }
//             return top; 
//         }

//         public static int peek(){
//             if(isEmpty()) {
//                 System.out.println("empty stack");
//                 return -1; 
//             }
//             int top = -1; 

//             // case 1
//             if(!q1.isEmpty()) {
//                 while(!q1.isEmpty()) {
//                     top = q1.remove(); 
//                     q2.add(top);
//                 }
//             } else {  // case 2 
//                 while(!q2.isEmpty()) {
//                     top = q2.remove();
//                     q1.add(top);
//                 } 
//             }
//             return top;
//         }
//     }

//     public static void main(String args []){
//         Stack s = new Stack(); 
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop(); 
//         }
//     }
// }





// =============================================================================================================== 
// ===============================================================================================================



    //              First non repeating letter 


// import java.util.*;

// public class QueueB { 
//     public static void printNonRepeating(String str ) {
//         int freq[] = new int[26]; // 'a'-'z'
//         Queue<Character> q = new LinkedList<>(); 

//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i); 
//             q.add(ch); 
//             freq[ch-'a']++; 

//             while(!q.isEmpty() && freq[q.peek()-'a'] > 1) {
//                 q.remove();
//             }

//             if(q.isEmpty()) {
//                 System.out.print(-1+" ");
//             } else {
//                 System.out.print(q.peek()+" ");
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String args []) {
//         String str = "aabccxb";
//         printNonRepeating(str);

//     }
// }



// ========================================================================================================================= 
// =========================================================================================================================



                // Interleave 2 halves of a Queue(even length) 



// import java.util.*; 

// public class QueueB {
//     public static void interLeave(Queue<Integer> q) {
//         int size = q.size();  
//         Queue<Integer> firstHalf = new LinkedList<>(); ;

//         for(int i=0; i<size/2; i++) {
//             firstHalf.add(q.remove());
//         }

//         while(!firstHalf.isEmpty()) {
//             q.add(firstHalf.remove());
//             q.add(q.remove());
//         }
//     }
 
//     public static void main(String args []) {
//         Queue<Integer> q = new LinkedList<>(); 
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10); 

//         interLeave(q);

//         while(!q.isEmpty()) {
//             System.out.print(q.remove() + " ");
//         }
//         System.out.println();
//     }
// }



// ================================================================================================================= 
// =================================================================================================================



            // Queue Reversal 


// import java.util.*; 

// public class QueueB {  
//     public static void reverse(Queue<Integer> q) {
//         Stack<Integer> s = new Stack<>(); 

//         while(!q.isEmpty()){
//             s.push(q.remove()); 
//         }

//         while(!s.empty()) {
//             q.add(s.pop());
//         }
//     }
 
//     public static void main(String args []) {
//         Queue<Integer> q = new LinkedList<>(); 
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5); 

//         reverse(q); 

//         // print 
//         while(!q.isEmpty()) {
//             System.out.print(q.remove()+" ");
//         }
//         System.out.println();
//     }
// }



// =============================================================================================================== 
// ===============================================================================================================


            // Deque 


// import java.util.*; 

// public class QueueB {

//     public static void main(String args []) {
//         Deque<Integer> deque = new LinkedList<>(); 
//         deque.addFirst(3);
//         deque.addFirst(2); 
//         deque.addLast(7);
//         deque.addLast(5);

        
//         System.out.println(deque);
//         // deque.removeFirst(); 3 7 5 
//         deque.removeLast();  // 2 3 7 

//         System.out.println(deque);  

//         System.out.println("first el = " + deque.getFirst());
//         System.out.println("last el = " + deque.getLast());
//     }
// }



// ===============================================================================================================
// ===============================================================================================================



            // Stack & Queue using deque 


// import java.util.*; 

// public class QueueB { 
//     static class Stack {
//         Deque<Integer> deque = new LinkedList<>(); 

//         public void push(int data) {
//             deque.addLast(data);
//         }

//         public int pop() {
//             return deque.removeLast(); 
//         } 

//         public int peek() {
//             return deque.getLast(); 
//         }
//     }

    
//     public static void main(String args []){
//         Stack s = new Stack(); 
//         s.push(1);
//         s.push(3);
//         s.push(6); 

//         System.out.println("peek = "+ s.peek());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());

//     }
// }


// ===============================================================================================================
// ===============================================================================================================


// Practice Questions :- 

// print all binary number 

// import java.util.*; 

// public class QueueB { 
//     static void generatePrintBinary(int n){
//         Queue<String> q = new LinkedList<>(); 
//         q.add("1");
//         while(n-->0) {
//             String s1 = q.peek(); 
//             q.remove(); 
//             System.out.println(s1);
//             String s2 = s1; 
//             q.add(s1 + "0"); 
//             q.add(s2 + "1");
//         }
//     }

//         public static void main(String args []) {
//             int n = 12 ; 
//             generatePrintBinary(n);

//     }
// }





























