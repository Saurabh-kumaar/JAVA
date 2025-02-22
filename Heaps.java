
        // pq in jcf 


// import java.util.Comparator;
// import java.util.PriorityQueue; 

// public class Heaps {

//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());   // for reverse 

//         pq.add(5); 
//         pq.add(3);
//         pq.add(1); 

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek());
//             pq.remove();
//         }
//     }
// }



// ==============================================================================
// ==============================================================================


            // PQ for Objects 


// import java.util.PriorityQueue; 

// public class Heaps { 
//     static class Student implements Comparable<Student> {
//         String name;
//         int rank; 

//         public Student(String name, int rank) {
//             this.name = name; 
//             this.rank = rank; 
//         } 

//         @Override 
//         public int compareTo(Student s2) {
//             return this.rank - s2.rank; 
//         } 
//     }

//     public static void main(String[] args) {
//         PriorityQueue<Student> pq = new PriorityQueue<>();   

//         pq.add(new Student("E", 5)); 
//         pq.add(new Student("D", 9)); 
//         pq.add(new Student("C", 7)); 
//         pq.add(new Student("A", 4)); 
//         pq.add(new Student("B", 1)); 

 
//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek().name + " -> "+ pq.peek().rank);
//             pq.remove();
//         }
//     }
// }


// ==============================================================================
// ==============================================================================


    // insert in heap and delete 


// import java.util.*; 

// public class Heaps { 

//     static class Heap {
//         ArrayList<Integer> arr = new ArrayList<>(); 

//         public void add(int data) {
//             // add at last idx 
//             arr.add(data); 

//             int x = arr.size()-1; 
//             int par = (x-1)/2; 

//             while(arr.get(x) < arr.get(par)) {
//                 // swap 
//                 int temp = arr.get(x); 
//                 arr.set(x, arr.get(par)); 
//                 arr.set(par,temp); 

//                 x = par;
//                 par = (x-1)/2;
//             }
//         } 
//         public int peek() {
//             return arr.get(0);
//         } 

//         // heapify
//         private void heapify (int i) {
//             int left = 2*i+1; 
//             int right = 2*i+2; 
//             int minIdx = i; 

//             if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {
//                 minIdx = left; 
//             } 

//             if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
//                 minIdx = right; 
//             } 

//             if(minIdx != i) {
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(minIdx)); 
//                 arr.set(minIdx, temp);

//                 heapify(minIdx);
//             }
//         }  

//         // remove 
//         public int remove() {
//             int data = arr.get(0); 
        

//             // step-1 swap first & last 
//             int temp = arr.get(0); 
//             arr.set(0, arr.get(arr.size()-1)); 
//             arr.set(arr.size()-1, temp); 

//             // step-2 delete last 
//             arr.remove(arr.size()-1); 

//             // step -3 heapify 
//             heapify(0); 
//             return data; 
//         }

//         public boolean isEmpty() {
//             return arr.size() == 0; 
//         }  
//     }

//     public static void main(String args []) {     
//         Heap h = new Heap(); 
//         h.add(3);
//         h.add(9);
//         h.add(1);
//         h.add(6); 

//         while(!h.isEmpty()) {
//             System.out.println(h.peek());
//             h.remove(); 
//         }
//     }
// }


// ============================================================================================= 
// =============================================================================================











