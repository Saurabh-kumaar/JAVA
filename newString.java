
        // today we learn string 


// import java.util.*; 

// public class newString { 

//     public static void printLetters(String str){
//         // find each latters 
//         for(int i=0; i<str.length(); i++){
//             System.out.print(str.charAt(i) + " ");
//         }
//         System.out.println();
//     }

// public static void main(String args []){

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter name :");
    // String name = sc.nextLine();
    // System.out.println("you entered = " + name ); 


    // for find length 
    // String fullName = "tony bhai ka jai ho ";
    // System.out.println("fullname is = " + fullName + ", fullname length is = " + fullName.length());
    
    // // concatenation   :- when add 2 string in one .
//     String firstName = "ajju ";
//     String lastName = "bhai" ; 

//     String fullName = firstName+lastName;
//     System.out.println(fullName.charAt(1));
      
//     printLetters(fullName);  // call for function 

//     }
// }

// ======================================================================================
// ====================================================================================== 

                    // palindrome 

// import java.util.*; 

// public class newString { 

//     public static boolean isPalindrome(String str){
//         for(int i=0; i<str.length()/2; i++){
//             int n = str.length(); 
//             if(str.charAt(i) != str.charAt(n-1-i)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]){
//         String str = "rajujar";
//         System.out.println(isPalindrome(str));
//     }
// }


// ============================================================================================
// ============================================================================================

                    // shortest path 

//  import java.util.*; 
 
//  public class newString { 

//     public static float getShortPath(String path){
//         int x = 0, y =0; 

//         for(int i=0; i<path.length(); i++){  //time complexity = O(n)
//             char dir = path.charAt(i);

//             // south 
//             if(dir == 's'){
//                 y--;
//             }
//             // north 
//             else if(dir == 'N'){
//                 y++;
//             }
//             // west 
//             else if(dir == 'W'){
//                 x--; 
//             }
//             // east 
//             else {
//             }
//         }
//         int x2 = x*x; 
//         int y2 = y*y; 
//         return (float)Math.sqrt(x2 + y2);


//     }
 
//     public static void main(String args []){
        
//         String path = "ES";
//         System.out.println(getShortPath(path));
//     }
//  } 

// =============================================================================================
// =============================================================================================

                    // compare String 

// import java.util.*;  

// public class newString {

// public static void main(String args []){
//     String s1 = "raju";
//     String s2 = "raju";
//     String s3 = new String("raju");
    
//     // for compare 
//     if(s1 == s2){
//         System.out.println("String are equal");
//     } else {
//         System.out.println("String are not equal");
//     } 

//     if(s1 == s3 ){
//         System.out.println("String are equal");
//     } else {
//         System.out.println("string are not equal");
//     }

//         // (.equal) 
//     if(s1.equals(s3)){   // equal check only value
//         System.out.println("String are equal");
//     } else {
//         System.out.println("String are not equal");
//     }
// }
// }

// =============================================================================================
// =============================================================================================

                    // find subString function 

// import java.util.*; 

// public class newString {  

//     public static String subString(String str, int si, int ei){
//         String substr = "";  // mt
//         for(int i=si; i<ei; i++){
//             substr += str.charAt(i);
//         }
//         return substr;
//     }
//         public static void main(String args []){
//             String str = "kyahalhairajubhai";
//             System.out.println(subString(str, 2, 8));
//         }
// }

// =============================================================================================
// =============================================================================================
 
                // string BUilder 

// import java.util.*; 

// public class newString {

//     public static void main(String args []){
//         StringBuilder sb = new StringBuilder("");
//         for(char ch='a'; ch<='z'; ch++){
//             sb.append(ch);

//         }
//         System.out.println( " " + sb + " ");
//     }
//  }


//  =============================================================================================
 // =============================================================================================
 

                    // convert letter  toUpperCase 

// import java.util.*; 

// public class newString { 

//     public static String toUpperCase(String str){
//         StringBuilder sb = new StringBuilder("");

//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for(int i=1; i<str.length(); i++){
//             if(str.charAt(i) == ' ' && i<str.length()-1){
//                 sb.append( str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             } else {
//                 sb.append(str.charAt(i));
//             }
//         } 
//         return sb.toString();
//     }

//     public static void main(String args []){
//         String str = "hello huys ";
//         System.out.println(toUpperCase(str));
//     }
// }


// ===========================================================================================
//=============================================================================================
 
                // String Compression  (popular problem )


// import java.util.*; 

// public class newString { 

//     public static String compress(String str){
//         String newStr = "";

//         for(int i=0; i<str.length(); i++){
//             Integer count = 1; 
//             while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                 count++;
//                 i++;
//             } 
//             newStr += str.charAt(i);
//             if(count > 1){
//                 newStr += count.toString();
//             }
//         } 
//         return newStr; 
//     }

//     public static void main(String args []){
//         String str = "aaaabbbbbbbcccccbcccdd" ;

//         System.out.println(compress(str));
//     }
// }


// ============================================================================================
 //=============================================================================================
 
                // find the lowercase 

// import java.util.*; 

// public class newString {

//     public static void main(String args []){

//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int count = 0;
//         for(int i=0; i<s.length(); i++){   //time complexity O(n)
//             char ch = s.charAt(i);

//             if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
//                 count++;
//             }
//         }
//         System.out.println("Lower Case vowels : " + count);
//     }
// }

// ============================================================================================
 //=============================================================================================
 
                    // .equals use 

// import java.util.*; 

// public class newString {

//     public static void main(String args []){

//         String str = "helloraju";
//         String str1 = "hellobhai";
//         String str2 = "helloraju";

//         // System.out.println(str.equals(str2));
//         if(str == str2){
//             System.out.println("it is same");
//         } else {
//             System.out.println("it is not same ");
//         }
//     }
// }

// ============================================================================================
// =============================================================================================
 
                    // replace element 

// import java.util.*;

// public class newString {

//     public static void main(String args []){

//         String str = "hello bhai ";
//         String str2 = str.replace  //("bhai", "bro"); 
//         // String str2 = str.toUpperCase(); // to change font small to capital
//         System.out.println(str2);
//     }
// }


// =============================================================================================
// =============================================================================================
































































