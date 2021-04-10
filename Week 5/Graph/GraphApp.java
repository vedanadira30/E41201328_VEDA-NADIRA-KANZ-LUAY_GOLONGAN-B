
package week5b.graph;

/**
 *
 * E41201328 VEDA NADIRA TIF B
 */
public class GraphApp {
        public static void main(String[] args) {
        
        Graph theGraph = new Graph();
        
        theGraph.addVertex('A'); //0
        theGraph.addVertex('B'); //1
        theGraph.addVertex('C'); //2
        theGraph.addVertex('D'); //3
        theGraph.addVertex('E'); //4
        
        System.out.println(" ");
        theGraph.addEdge(0, 1); //AB
        theGraph.addEdge(1, 2); //BC
        theGraph.addEdge(2, 3); //AD
        theGraph.addEdge(3, 4); //DE
        theGraph.bfs();
        
        System.out.println(" ");
        theGraph.display(); 
        
        theGraph.addEdge(0, 1); //AB
        theGraph.addEdge(1, 2); //BC
        theGraph.addEdge(2, 3); //AD
        theGraph.addEdge(3, 4); //DE
        theGraph.dfs();
        theGraph.display();
   
        }
}