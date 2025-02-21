
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


import java.util.PriorityQueue; 

public class Heaps { 
    static class Student implements Comparable<Student> {
        String name;
        int rank; 

        public Student(String name, int rank) {
            this.name = name; 
            this.rank = rank; 
        } 

        @Override 
        public int compareTo(Student s2) {
            return this.rank - s2.rank; 
        } 
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();   

        pq.add(new Student("E", 5)); 
        pq.add(new Student("D", 9)); 
        pq.add(new Student("C", 7)); 
        pq.add(new Student("A", 4)); 
        pq.add(new Student("B", 1)); 

 
        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> "+ pq.peek().rank);
            pq.remove();
        }
    }
}