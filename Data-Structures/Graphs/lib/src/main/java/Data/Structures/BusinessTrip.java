package Data.Structures;


import java.util.ArrayList;
import java.util.LinkedList;

public class BusinessTrip {
    ArrayList<Node> myGraph;


    public BusinessTrip() {
        this.myGraph = new ArrayList<>();
    }

    public void addEdge(Node firstNode, Node secondNode, int weight) {


        // if it doesn't have a weight
        if (myGraph.contains(firstNode)&& myGraph.contains(secondNode)) {
            if (weight == 0) {
                Edge edge = new Edge(secondNode);
                firstNode.addNeighbors(edge);
//                System.out.println("if");
            } else {
                // if it has a weight

                Edge edge = new Edge(secondNode, weight);
                firstNode.addNeighbors(edge);
//                System.out.println("else");
            }
        }else{
            throw new IllegalArgumentException("error");
        }
    }



    public Node AddNode(Object nodeValue) {

            Node newNode = new Node(nodeValue);
            myGraph.add(newNode);

            return newNode;

    }


    public class Edge {

        Node node;
        int weight;

        public Edge(Node node, int weight) {
            this.node = node;
            this.weight = weight;
        }

        public Edge(Node node) {
            this.node = node;
            this.weight = 0;
        }


        public Node getNode() {
            return node;
        }
    }



    public String getEdge(BusinessTrip myGraph, ArrayList cities) {


        int index = 0;
        int weight = 0;
        Boolean flag = true;

        if (myGraph.Size() != 0) {
            while (index < cities.size() - 1 && flag == true) {
                flag = false;
                //get all nodes in graph
                for (Node node : myGraph.GetNodes()) {
                    //find  city
                    if (node.value == cities.get(index)) {
                        // get the neighbors for city
                        ArrayList<Edge> neighbors = node.getNeighbors();

                        for (Edge edge : neighbors) {

                            if (edge.getNode().value == cities.get(index + 1)) {       // find dest
                                flag = true;
                                weight += (int) edge.weight;
                                break;
                            }
                        }
                    }
                }
                index++;
            }

            if (flag == true) {
                return "true, " + "$" + weight;
            } else {
                return "False, $0";
            }
        } else {
            return "empty graph";
        }

    }

    public ArrayList<Node> GetNodes(){
        if(myGraph.size() !=0){
            return this.myGraph;
        }
        return null;
    }

    private int Size() {
        return this.myGraph.size();
    }

    public class Node {


        Object value;
        ArrayList<BusinessTrip.Edge> neighbors;
        ArrayList myGraph;

        public Node() {
        }

        public Node(Object value) {
            this.value = value;


            this.neighbors = new ArrayList<BusinessTrip.Edge>();
        }


        public ArrayList<BusinessTrip.Edge> getNeighbors() {
            return neighbors;
        }

        public void addNeighbors(BusinessTrip.Edge newNeighbor) {
            this.neighbors.add(newNeighbor);
        }

    }

}
