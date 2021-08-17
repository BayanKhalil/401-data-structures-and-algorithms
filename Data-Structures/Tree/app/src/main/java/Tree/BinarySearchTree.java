package Tree;


// we require that data stored in each node is Comparable
public class BinarySearchTree<T extends Comparable> {

    Node root;

    public BinarySearchTree () {
        this.root = null;
    }

    public void add(T value) {
        root = addNode(root, value);
    }


    public Node addNode(Node node, T value) {
        try {
            if (node == null) {
                return new Node(value);
            } else if (value.compareTo(node.value) >0 ) {
                node.right = addNode(node.right, value);

            } else if (value.compareTo(node.value) <= 0) {
                node.left = addNode(node.left, value);

            } else {

                return node;
            }
            return node;
        }catch (IllegalStateException ex){
            throw new IllegalStateException("error");
        }
    }



    public boolean contains(int value) {
        Node <Integer> currNode = root;
        while (!currNode.value.equals(value)) {
            if (value < currNode.value) {
                currNode = currNode.left;
            } else {
                currNode = currNode.right;
            }
            // the value doesn't exist
            if(currNode == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
