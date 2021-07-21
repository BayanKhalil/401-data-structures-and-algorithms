package Tree;

public class Node <T> {
    T value;
    Node right;
    Node left;


    public Node(T value) {
        this.value = value;

    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", right=" + right +
                ", left=" + left +
                '}';
    }
}
