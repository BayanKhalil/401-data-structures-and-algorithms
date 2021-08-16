package HashTable;





import java.util.*;

class Node <T> {

    public Node  left;
    public Node  right;
    public T value;


    public Node (T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }


    public Node(T value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

    public class IntersectionTree {




        public static List<Integer> treeIntersection(Node root1, Node root2) {
            List<Integer> result = new ArrayList<>();
            HashMap<Integer, Boolean> valuesRoot1 = new HashMap<>();
            LinkedList<Node> nodes = new LinkedList<>();

            nodes.add(root1);
            while(!nodes.isEmpty()) {
                Node current = nodes.removeFirst();
                valuesRoot1.put((Integer) current.value, null);


                if (current.left != null) {
                    nodes.add(current.left);
                }
                if (current.right != null) {
                    nodes.add(current.right);
                }
            }
            // tree2
            nodes.add(root2);

            while(!nodes.isEmpty()) {
                Node current = nodes.removeFirst();
                if(valuesRoot1.containsKey(current.value)) {
                    result.add((Integer) current.value);
                }
                // traverse through tree2 (breadth-first)
                if (current.left != null) {
                    nodes.add(current.left);
                }
                if (current.right != null) {
                    nodes.add(current.right);
                }
            }
            return result;
        }


        }


