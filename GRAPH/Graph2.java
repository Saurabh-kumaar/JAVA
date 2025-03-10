
        // here we will learn about somethings new in graph 

                    // Connected component

// import java.util.*; 

// public class Graph2 { 
//     static class Edge {
//         int dest; 
//         int src; 
//         int wt; 

//         public Edge(int s, int d,  int w){
//             this.dest = d; 
//             this.src = s; 
//             this.wt = w; 
//         }
//     } 

    
//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>(); 
//         } 

//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1)); 

//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 3, 1)); 

//         graph[2].add(new Edge(2, 0, 1)); 
//         graph[2].add(new Edge(2, 4, 1));    

//         graph[3].add(new Edge(3, 1, 1)); 
//         graph[3].add(new Edge(3, 4, 1));  
//         graph[3].add(new Edge(3, 5, 1)); 

//         graph[4].add(new Edge(4, 2, 1)); 
//         graph[4].add(new Edge(4, 5, 1)); 
//         graph[4].add(new Edge(4, 3, 1)); 

//         graph[5].add(new Edge(5, 3, 1)); 
//         graph[5].add(new Edge(5, 4, 1)); 
//         graph[5].add(new Edge(5, 6, 1));  

//         graph[5].add(new Edge(6, 5, 1)); 

//     } 

//     public static void bfs(ArrayList<Edge>graph[]) {
//         boolean vis[] = new boolean[graph.length];  
//         for(int i=0; i<graph.length; i++) {
//             if(!vis[i]) {
//                 bfs(graph, vis);
//             }
//         }
//     } 
//     // bfs 
//     public static void bfsUtil(ArrayList<Edge> graph[], boolean vis[]) {
//         Queue<Integer> q = new LinkedList<>(); 
//         q.add(0);   // source =0

//         while(!q.isEmpty()) {
//             int curr = q.remove(); 

//             if(!vis[curr]) {
//                 System.out.print(curr+" ");
//                 vis[curr] = true; 
//                 for(int i=0; i<graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i); 
//                     q.add(e.dest); 
//                 }
//             }
//         }
//     }

//     // ------------ d f s --------------- 
//     public static void dfs(ArrayList<Edge>graph []) { 
//         boolean vis[] = new boolean[graph.length]; 
//         for(int i=0; i<graph.length; i++) {
//             dfsUtil(graph, i, vis); ;
//         }
//     }

//     public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
//         System.out.print(curr + " "); 
//         vis[curr] = true; 

//         for(int i=0; i<graph[curr].size(); i++) { 
//             Edge e = graph[curr].get(i); 
//             if(!vis[e.dest]) {
//                 dfsUtil(graph, e.dest, vis);
//             }
//         }
//     }



//     public static void main(String args []) { 
//          /*
//               1 ---- 3 
//              /       | \
//             0        |  5 -- 6 
//             \        | / 
//              2 ----- 4 

//          */ 
//         int V = 7; 
//         ArrayList<Edge> graph[] = new ArrayList[V]; 
//         createGraph(graph);
//         // bfs(graph); 
//         dfs(graph, 0, new boolean[V]);
 
//     }
// }

// ===============================================================================================
// ===============================================================================================


                        // Cycle Detection :- undirected 


// import java.util.*; 

 
// public class Graph2 { 
//     static class Edge { 
//         int src; 
//         int dest; 

//         public Edge(int s, int d) {
//             this.dest = d; 
//             this.src = s; 
//         }
//     } 
//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>(); 
//         } 

//         graph[0].add(new Edge(0, 1)); 
//         graph[0].add(new Edge(0, 2)); 
//         graph[0].add(new Edge(0, 3)); 

//         graph[1].add(new Edge(1, 0)); 
//         graph[1].add(new Edge(1, 2)); 

//         graph[2].add(new Edge(2, 0)); 
//         graph[2].add(new Edge(2, 1)); 

//         graph[3].add(new Edge(3, 0)); 
//         graph[3].add(new Edge(3, 4)); 

//         graph[4].add(new Edge(4, 3)); 
//     } 

//     public static boolean detectCycle(ArrayList<Edge> [] graph) {
//         boolean vis[] = new boolean[graph.length]; 
//         for(int i=0; i<graph.length; i++) {
//             if(!vis[i]) {
//                 if(detectCycleUtil(graph, vis, i, -1)) {
//                     return true; 
//                 } 
//             }
//         } 
//         return false; 
//     } 

//     public static boolean detectCycleUtil(ArrayList<Edge>[]graph, boolean vis[], int curr, int par) { 
//         vis[curr] = true;  

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i); 
//             // case 3 
//             if(!vis[e.dest] && detectCycleUtil(graph, vis, e.dest, curr)) {
//                 return true; 
//             } 
//             // case 1 
//             else if(vis[e.dest] && e.dest != par) {
//                 return true; 
//             }
//             // case 2 -> do nothing -> continue 
//         }
//         return false; 
//     }
    
//     public static void main(String args[]) { 

//         /*
//                 0 -------- 3
//                /|          |
//               / |          |
//              /  |          |
//             1   |          4
//              \  |
//               \ |
//                \|
//                 2
//         */ 

//         int V = 5; 
//         ArrayList<Edge> graph[] = new ArrayList[V];  
//         createGraph(graph);         
//         System.out.println(detectCycle(graph));  

//     }
// }


// ================================================================================================================== 
// ==================================================================================================================

            // Bipartite :- 
            
// import java.util.*; 

// public class Graph2 { 
//     static class Edge{
//         int src; 
//         int dest; 

//         public Edge(int s, int d) {
//             this.src = s; 
//             this.dest = d; 
//         }
//     } 
//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>(); 
//         } 

//         graph[0].add(new Edge(0, 1)); 
//         graph[0].add(new Edge(0, 2)); 

//         graph[1].add(new Edge(1, 0)); 
//         graph[1].add(new Edge(1, 3)); 

//         graph[2].add(new Edge(2, 0)); 
//         graph[2].add(new Edge(2, 4)); 

//         graph[3].add(new Edge(3, 1)); 
//         // graph[3].add(new Edge(3, 4)); 

//         graph[4].add(new Edge(4, 2)); 
//         // graph[4].add(new Edge(4, 3)); 
//     } 

//     public static boolean isBipartite(ArrayList<Edge> graph[]) {
//         int col[] = new int[graph.length]; 
//         for(int i=0; i<col.length; i++) {
//             col[i] = -1; // no color
//         } 

//         Queue<Integer> q = new LinkedList<>(); 

//         for(int i=0; i<graph.length; i++) {
//             if(col[i] == -1) {
//                 q.add(i); 
//                 col[i] = 0;  // yellow
//                 while(!q.isEmpty()) {
//                     int curr = q.remove(); 
//                     for(int j=0; j<graph[curr].size(); j++) {
//                         Edge e = graph[curr].get(j); // e.dest
//                         if(col[e.dest] == -1) {
//                             int nextCol = col[curr] == 0 ? 1 : 0; 
//                             col[e.dest] = nextCol; 
//                             q.add(e.dest); 
//                         } else if(col[e.dest] == col[curr]) {
//                             return false; 
//                         }
//                     }
//                 }
//             }
//         } 
//         return true; 
//     }

//     public static void main(String args[]) {
//         /*
//                 0 -------- 2
//                /          /
//               /          /
//              1          4
//               \        /
//                \      /
//                 \    /
//                   3 
//                   FALSE

//         */ 
//         int V = 5; 
//         ArrayList<Edge> graph[] = new ArrayList[V]; 
//         createGraph(graph);  
 
//         System.out.println(isBipartite(graph));
//     }
// }



