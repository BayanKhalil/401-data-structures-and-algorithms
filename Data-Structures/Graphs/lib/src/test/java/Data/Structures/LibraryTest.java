/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Data.Structures;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

@Test
    public void test1(){
    Graph graph = new Graph();
    graph.addVertex("Bob");
    graph.addVertex("Alice");
    String expected="Vertex{data='Bob'}[]Vertex{data='Alice'}[]";
    assertEquals(expected,graph.printGraph());
}

    @Test
    public void test2(){
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mary");

        graph.addEdge("Bob", "Mary");
        graph.addEdge("Bob", "Alice");
        String expected="Vertex{data='Bob'}[Vertex{data='Mary'}, Vertex{data='Alice'}]Vertex{data='Alice'}[Vertex{data='Bob'}]Vertex{data='Mary'}[Vertex{data='Bob'}]";
        assertEquals(expected,graph.printGraph());
    }
    @Test
    public void test3(){
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mary");

        graph.addEdge("Bob", "Mary");
        graph.addEdge("Bob", "Alice");

        graph.removeVertex("Bob");
        graph.removeEdge("Bob","Alice");
        String expected="Vertex{data='Alice'}[]Vertex{data='Mary'}[]";
        assertEquals(expected,graph.printGraph());
    }

    @Test
    public void test4(){
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");

        assertNull(graph.getNeighbors("bayan"));
    }
    @Test
    public void test5(){
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");

        assertEquals(2,graph.size());
    }

    @Test
    public void test6(){
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.removeVertex("Bob");
        assertEquals(0,graph.size());
    }

    @Test
    public void test7(){
        Graph graph = new Graph();
        assertEquals(0,graph.size());
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Breadth First <<<<<<<<<<<<<<<<<<<<<<<

    @Test
    public void test8() {

        Graph graph = new Graph();

        graph.addVertex("Bob");
        graph.addVertex("Mary");
        graph.addVertex("Alice");
        graph.addVertex("Carl");

        graph.addEdge("Alice", "Carl");
        graph.addEdge("Bob", "Mary");
        graph.addEdge("Bob", "Alice");

        Set<String> expected= new LinkedHashSet<>();
        expected.add("Alice");
        expected.add("Carl");
        expected.add("Bob");
        expected.add("Mary");

       assertEquals(expected,graph.bft(graph, "Alice"));

    }

    @Test
    public void test9() {

        Graph graph = new Graph();

        graph.addVertex("Bob");
        graph.addVertex("Mary");
        graph.addVertex("Alice");
        graph.addVertex("Carl");

        Set<String> expected=new LinkedHashSet<>();
        expected.add("Alice");
        assertEquals(expected,graph.bft(graph, "Alice"));
    }

    @Test
    public void test10() {

        Graph graph = new Graph();

        graph.addVertex("Bob");
        graph.addVertex("Mary");
        graph.addVertex("Alice");
        graph.addVertex("Carl");
        graph.addEdge("Alice", "Carl");
        graph.addEdge("Bob", "Mary");
        Set<String> expected=new LinkedHashSet<>();
        expected.add("Alice");
        expected.add("Carl");
        assertEquals(expected,graph.bft(graph, "Alice"));
    }


}
