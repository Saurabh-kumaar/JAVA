

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




// public class Queue {  
//     static class Node{
//         int data ; 
//         Node next; 

//         Node(int data){
//             this.data = data; 
//             this.next = null; 
//         }
//     }
//     static class Queues {
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
//         Queues q = new Queues();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }






































































