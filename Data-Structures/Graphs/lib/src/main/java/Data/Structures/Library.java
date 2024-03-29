/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Data.Structures;


import java.util.*;

public class Library {
    public boolean someLibraryMethod() {
        return true;

    }

    private Integer totalCost = 0;

    public static void main(String[] args) throws Exception {
        Graph graph = new Graph();

        graph.addVertex("Bob");
        graph.addVertex("Mary");
        graph.addVertex("Alice");
        graph.addVertex("Carl");

        graph.addEdge("Alice", "Carl",0);
        graph.addEdge("Bob", "Mary",0);
//        graph.addEdge("Bob", "Alice",0);

//        System.out.println("the graph => " + graph.printGraph());
//        System.out.println("the size => " + graph.size());

//        graph.removeEdge("Carl", "Alice");
//        graph.removeVertex("Bob");
//        System.out.println();

//        System.out.println("the graph => " + graph.printGraph());
//        System.out.println("the size => " + graph.size());

        System.out.println();

//        System.out.println(graph.bft());
//        System.out.println(graph.getVertex("nb"));
        System.out.println(graph.bft(graph, "Alice"));
        System.out.println(graph.dft(graph, "Alice"));




    }
}
