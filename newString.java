import java.util.*; 

public class newString { 

    public static void printLetters(String str){
        // find each latters 
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

public static void main(String args []){

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter name :");
    // String name = sc.nextLine();
    // System.out.println("you entered = " + name ); 


    // for find length 
    // String fullName = "tony bhai ka jai ho ";
    // System.out.println("fullname is = " + fullName + ", fullname length is = " + fullName.length());
    
    // // concatenation   :- when add 2 string in one .
    String firstName = "ajju ";
    String lastName = "bhai" ; 

    String fullName = firstName+lastName;
    System.out.println(fullName.charAt(1));
      
    printLetters(fullName);

    }
}