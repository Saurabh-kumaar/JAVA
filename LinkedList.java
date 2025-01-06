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


// ============================================

    // addFirst
    public void addFirst(int data){ 
        Node newNode = new Node(data); 
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
        Node newNode = new Node(data); 
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

    public static void main(String args []){

        LinkedList ll = new LinkedList(); 
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(0);
        ll.add(2, 8);

        ll.print();

    }
 }

































