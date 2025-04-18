
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


// ==================================================================================================== 
// ==================================================================================================== 


    // Reverse a string using a stack 

// import java.util.*; 

// public class Stacks{ 

//     public static String reverseString(String str){
//         Stack<Character> s = new Stack<>(); 
//         int idx = 0; 
//         while(idx < str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         } 

//         StringBuilder result = new StringBuilder("");
//         while(!s.isEmpty()){
//             char curr = s.pop(); 
//             result.append(curr);
//         }

//         return result.toString();
//     }

//     public static void main(String args[]){
//         String str = "denial"; 
//         String result = reverseString(str);
//         System.out.println(result);
//     }
// }



// ==================================================================================================== 
// ==================================================================================================== 


                    // Reverse a Stack 


// import java.util.*; 

// public class Stacks { 

//     public static void pushAtBottom(Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         } 

//         int top = s.pop(); 
//         pushAtBottom(s, data);
//         s.push(top);
//     }

//     public static void reverseStack(Stack<Integer> s){ 
//         if(s.isEmpty()){
//              return; 
//         }

//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s, top);
//     }

//     public static void printStack(Stack<Integer> s){
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }

//     public static void main(String args []){
//         Stack<Integer> s = new Stack<>(); 
//         s.push(2); 
//         s.push(3);
//         s.push(4);  

//         printStack(s);
//         reverseStack(s);

//     }
// }

// ==================================================================================================== 
// ==================================================================================================== 


                            // Stock span problem 



// import java.util.*; 

// public class Stacks {
//     public static void stocksSpan(int stocks[], int span[]){
//         Stack<Integer> s = new Stack<>(); 
//         span[0] = 1; 
//         s.push(0);

//         for(int i=1; i<stocks.length; i++){
//             int currPrice = stocks[i];
//             while(!s.isEmpty() && currPrice > stocks[s.peek()]){
//                 s.pop(); 
//             }
//             if(s.isEmpty()){
//                 span[i] = i + 1; 
//             } else {
//                 int prevHigh = s.peek(); 
//                 span[i] = i - prevHigh; 
//             }
//             s.push(i);
//         }
//     }
    
//     public static void main(String args []){
//         int stocks[] = { 100, 80, 60, 70, 60, 85, 100};
//         int span[] = new int[stocks.length];
//         stocksSpan(stocks, span);

//         for(int i=0; i<span.length; i++){
//             System.out.print(span[i]+ " ");
//         }
//         System.out.println();
//     }

// }


// ==================================================================================================== 
// ==================================================================================================== 


                        // Next greater Element 

// import java.util.*; 

// public class Stacks {

//     public static void main(String args []){
//         int arr[] = {6, 8, 0, 1, 3};
//         Stack<Integer> s = new Stack<>(); 
//         int nextGreater[] = new int[arr.length];

//         for(int i= arr.length-1; i>=0; i--){
//             while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
//                 s.pop();
//             }

//             if(s.isEmpty()){
//                 nextGreater[i] = -1;
//             } else {
//                 nextGreater[i] = arr[s.peek()];
//             }
//             s.push(i);
//         }

//         for(int i=0; i<nextGreater.length; i++){
//             System.out.print(nextGreater[i]+" ");
//         }
//         System.out.println();

//     }
// }



// ==================================================================================================== 
// ==================================================================================================== 



        // next session 2 stack  

                    // valid parentheses 


// import java.util.*; 

// public class Stacks {

//     public static boolean isValid(String str ){
//         Stack<Character> s = new Stack<>(); 

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i); 
//             // opening 
//             if (ch == '(' || ch == '{' || ch == '[') {   
//                 s.push(ch);  
//             } else {
//                 // closing 
//                 if(s.isEmpty()){
//                     return false;
//                 } 
//                 if( (s.peek() == '(' && ch == ')' ) 
//                     || (s.peek() == '{' && ch == '}')
//                     || (s.peek() == '[' && ch == ']')){
//                         s.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }

//         if(s.empty()){
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public static void main(String args []){
//         String str = "({})[]";
//         System.out.println(isValid(str));
//     }
// }



// ==================================================================================================== 
// ==================================================================================================== 



            // duplicate parentheses 



// import java.util.*; 

// public class Stacks { 

//     public static boolean isDuplicate(String str ) {
//         Stack<Character> s = new Stack<>(); 

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i); 

//             // closing 
//             if(ch ==')'){
//                 int count = 0; 
//                 while(s.peek() != '('){
//                     s.pop(); 
//                     count++; 
//                 }
//                 if(count < 1){
//                     return true; 
//                 } else {
//                     s.pop(); 
//                 } 
//             }  else {
//                 // opening 
//                 s.push(ch);
//             }
//         }
//         return false; 
//     }

//     public static void main(String args []){
//         String str = "((a-b))";
//         String str2 = "(a+b)";
//         System.out.println(isDuplicate(str));  // true
//         System.out.println(isDuplicate(str2));  // false 

//     }
// }


// ==================================================================================================== 
// ==================================================================================================== 



              // Max Area in Histogram  


// import java.util.*; 

// public class Stacks { 

//     public static void maxArea(int arr[]){
//         int maxArea = 0; 
//         int nsr[] = new int[arr.length];
//         int nsl[] = new int[arr.length]; 

//         // next smaller right 
//         Stack<Integer> s = new Stack<>(); 

//         for(int i=arr.length-1; i>=0; i--) {
//             while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
//                 s.pop(); 
//             }
//             if(s.isEmpty()) {
//                 nsr[i] = arr.length;
//             } else {
//                 nsr[i] = s.peek();
//             } 
//             s.push(i);
//         }

//         // next smaller left 
//         s = new Stack<>(); 

//         for(int i=0; i<arr.length; i++){
//             while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
//                 s.pop(); 
//             }
//             if(s.isEmpty()) {
//                 nsl[i] = -1; 
//             } else {
//                 nsl[i] = s.peek(); 
//             }
//             s.push(i);

//         }

//         // current are : width = j-i-1 = nsr[i]-nsl[i]-1 
//         for(int i =0; i<arr.length; i++){
//             int height = arr[i]; 
//             int width = nsr[i] - nsl[i] - 1; 
//             int currArea = height * width; 
//             maxArea = Math.max(currArea, maxArea);
//         } 

//         System.out.println("max area in histogram = " + maxArea);
//     } 

//     public static void main(String args []){

//         int arr[] = {2, 4};   // height
//         maxArea(arr); 

//     }
// }




// ==================================================================================================== 
// ==================================================================================================== 



// live :- 

                // addAtBottom 
                

// import java.util.*; 

// public class Stacks { 

//     static void addAtBottom(Stack<Integer> st, int num){ 
//         if(st.isEmpty()){
//             st.push(num);
//             return;
//         }

//         int tp = st.pop(); 
//         addAtBottom(st, num);
//         st.push(tp);
//         return; 
//     }

//     public static void main(String args []) {
//         Stack<Integer> st = new Stack<>(); 
//         st.push(5);
//         st.push(3);
//         st.push(7);
 
//         addAtBottom(st, 1);  // for add in last 

//         while(!st.isEmpty()){
//             int tp = st.pop(); 
//             System.out.println(tp);
//         }
//     }
// }


// ==================================================================================================== 
// ==================================================================================================== 


        // reverseStack  


// import java.util.*; 

// public class Stacks { 

//     static void addAtBottom(Stack<Integer> st , int num ) {
//         if(st.isEmpty()){
//             st.push(num);
//             return; 
//         }
//         int tp = st.pop(); 
//         addAtBottom(st, num);
//         st.push(tp);
//         return; 
//     } 

//     static void reverseStack(Stack<Integer> st) {
//         if(st.isEmpty()){
//             return; 
//         }
//         int tp = st.pop(); 
//         reverseStack(st);
//         addAtBottom(st, tp);
//     }

//     public static void main(String args []){
//         Stack<Integer> st = new Stack<>(); 

//         st.push(3);
//         st.push(5);
//         st.push(8); 

//         // print for reverseStack 
//         while(!st.isEmpty()){
//             int tp = st.pop();
//             System.out.println(tp);
//         }
//     }
// }


// ==================================================================================================== 
// ==================================================================================================== 




























































