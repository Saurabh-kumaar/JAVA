 public class LinkedList { 

   public class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
        }
   }
   public static Node head;
   public static Node tail;
   public static int  size; 


// ============================================

    // addFirst
    public void addFirst(int data){ 
        Node newNode = new Node(data); 
        size++; 
        if(head == null){
            head = tail = newNode; 
            return;
        }

        newNode.next = head;  //link 
        head = newNode; 
    }


// ==============================================

    // addLast 
    public void addLast (int data){
        Node newNode = new Node(data);
        size++; 
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode; 
        tail = newNode; 

    } 

// ================================================
    
    // print 
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head; 

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

// ==================================================

    // add num in middle 
    public void add(int idx, int data){
        if( idx == 0) {
            addFirst(data);
            return; 
        }
        Node newNode = new Node(data); 
        size++;
        Node temp = head; 
        int i = 0; 

        while(i < idx-1) {
            temp = temp.next; 
            i++;
        } 

        // i = idx-1; temp -> prev
        newNode.next = temp.next; 
        temp.next = newNode; 
    } 

// ========================================

    // remove first 
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE; 
        }else if(size == 1){
            int val = head.data; 
            head = tail = null; 
            size = 0; 
            return val; 
        }
        int val = head.data; 
        head = head.next; 
        size--;
        return val; 
    } 

// ========================================== 

    // removeLast 
    public int removeLast() {
        if(size == 0){
            System.out.println("LL is empty");
        } else if(size == 1){
            int val = head.data; 
            head = tail = null; 
            size = 0; 
            return val;
        } 
        //prev : i = size-2
        Node prev = head; 
        for(int i=0; i<size-2; i++){
            prev = prev.next; 
        } 

        int val = prev.next.data; 
        prev.next = null; 
        tail = prev; 
        size--; 
        return val;        

    }

// =============================================

    // iteretive search 
    public int itrSearch(int key){
        Node temp = head; 
        int i = 0; 

        while(temp != null){
            if(temp.data == key) {
                return i;
            }
            temp = temp.next; 
            i++;
        } 

        // if key not found 
        return -1; 
    }

// =================================== 
    // Recursive search 

    public int helper(Node head , int key) {
        if(head == null){
            return -1; 
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key) ;
            if(idx == -1){
                return -1; 
            }
            return idx+1;
        }

    public int recSearch(int key ) {
        return helper(head, key);
    }

// ========================================== 
    // reverse 
    
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next; 

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        head = prev; 
    }

// ========================================== 

    // remove nth node from end 
    


    public static void main(String args []){

        LinkedList ll = new LinkedList(); 
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3); 



        ll.print(); // 1->2->3->4->5
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast(); 
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(4)); // 

        System.out.println("ind is = " + ll.recSearch(5));

        ll.reverse(); // reverse 
        ll.print();

    }
}



 






























