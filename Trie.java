
//         // we started trie


// import java.util.*; 
// public class Trie {   
//     static class Node {
//         Node children[] = new Node[26];
//         boolean eow = false;

//         Node() {
//             for(int i=0; i<26; i++) {
//                 children[i] = null; 
//             }
//         }   
//     } 

//     public static Node root = new Node();

//     // insert 
//     public static void insert(String word) {
//         Node curr = root; 
//         for(int level=0; level<word.length(); level++) {
//             int idx = word.charAt(level) - 'a'; 
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node(); 
//             } 
//             curr = curr.children[idx]; 
//         }
//         curr.eow = true; 
//     } 

//     // search 
    // public static boolean search(String key) {
    //     Node curr = root; 
    //     for(int level=0; level<key.length(); level++) {
    //         int idx = key.charAt(level)-'a'; 
    //         if(curr.children[idx] == null) {
    //             return false; 
    //         } 
    //         curr = curr.children[idx]; 
    //     } 
    //     return curr.eow == true; 
    // } 

//     // wordBreak 
//     public static boolean wordBreak(String key) { 
//         if(key.length() == 0) {
//             return true; 
//         }

//         for(int i=1; i<=key.length(); i++) {
//             if(search(key.substring(0,i)) && 
//             wordBreak(key.substring(i))) {
//                 return true; 
//             }
//         }
//         return false; 
//     }



//     public static void main(String args[]) {
//         // String words[] = {"the", "a", "there", "their", "any", "thee"};
//         // for(int i=0; i<words.length; i++) {
//         //     insert(words[i]); 
//         // }
//         // System.out.println(search("thee"));
//         // System.out.println(search("thorr")); 

//         String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"}; 
//         for(int i=0; i<arr.length; i++) {
//             insert(arr[i]); 
//         }
        
//         String key = "ilike"; 
//         System.out.println(wordBreak(key));
//     }
// }


// ================================================================================================== 
// ================================================================================================== 


            // findPrefix 

// import java.util.*; 

// public class Trie {  
//     static class Node {
//         boolean eow = false; 
//         int freq; 
//         Node children[] = new Node[26];

//         public Node() {
//             for(int i=0; i<children.length; i++) {
//                 children[i] = null; 
//             } 
//             freq = 1;
//         }
//     } 

//     public static Node root = new Node(); 

//     public static void insert(String word) {
//         Node curr = root; 
//         for(int i=0; i<word.length(); i++) {
//             int idx = word.charAt(i)-'a';
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node(); 
//             } else {
//                 curr.children[idx].freq++; 
//             } 

//             curr = curr.children[idx];
//         }
//         curr.eow = true; 
//     } 

//     public static void findPrefix(Node root, String ans) {
//         if(root == null){
//             return; 
//         } 

//         if(root.freq == 1) {
//             System.out.println(ans); 
//             return; 
//         } 

//         for(int i=0; i<root.children.length; i++) {
//             if(root.children[i] != null) {
//                 findPrefix(root.children[i],ans+(char)(i+'a'));
//             }
//         }
//     }
    
//     public static void main(String args[]) {  
//         String arr[] = {"Zebra", "dog", "duck", "dove"}; 
//         for(int i=0; i<arr.length; i++) {
//             insert(arr[i].toLowerCase());
//         }
//         root.freq = -1;
//         findPrefix(root, "");
//       }
// }

// ==================================================================================================
// ================================================================================================== 



           
import java.util.*; 

public class Trie {  
    static class Node {
        boolean eow = false; 
        int freq; 
        Node children[] = new Node[26];

        public Node() {
            for(int i=0; i<children.length; i++) {
                children[i] = null; 
            } 
            freq = 1;
        }
    } 

    public static Node root = new Node(); 

    public static void insert(String word) {
        Node curr = root; 
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node(); 
            } else {
                curr.children[idx].freq++; 
            } 

            curr = curr.children[idx];
        }
        curr.eow = true; 
    } 

    public static boolean search(String key) {
        Node curr = root; 
        for(int level=0; level<key.length(); level++) {
            int idx = key.charAt(level)-'a'; 
            if(curr.children[idx] == null) {
                return false; 
            } 
            curr = curr.children[idx]; 
        } 
        return curr.eow == true; 
    }  

    public static boolean startWith(String prefix) {
        Node curr = root; 

        for(int i=0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i) -'a'; 
            if(curr.children[idx] == null) {
                return false; 
            }
            curr = curr.children[idx]; 
        }
        return true; 
    }
    
    public static void main(String args[]) {  

        String words[] = {"apple", "app", "mango", }; 
        String prefix1 = "app"; 
        String prefix2 = "moon";  

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startWith(prefix1));   // true
        System.out.println(startWith(prefix2));  // false 
    }
}

