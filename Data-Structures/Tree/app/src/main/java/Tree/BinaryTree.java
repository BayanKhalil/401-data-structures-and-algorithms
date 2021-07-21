package Tree;


import java.util.ArrayList;
import java.util.List;

public class BinaryTree extends BinarySearchTree{

//It is used to call superclass methods, and to access the superclass constructor.
// The most common use of the super keyword is to eliminate the
// confusion between superclasses and subclasses that have methods with the same name.
    public BinaryTree(){
        super();
    }

    public BinaryTree(int value) {
        Node node1 = new Node(value);
        this.root = node1;
    }



    public List<Integer> Preorder() {
        List<Integer> list = new ArrayList<>();


        return traversePreorder(root, list);
    }

    public List<Integer> traversePreorder(Node node, List<Integer> list) {

        if(node == null){
            return list;
        }
        list.add((Integer) node.value); // root
         traversePreorder(node.left, list);// traverse left sub tree

         traversePreorder(node.right, list);  // traverse right sub tree

        return list;
    }


    public List<Integer> inOrder() {
        List<Integer> list = new ArrayList<>();


        return traverseInOrder(root, list);
    }

    public List<Integer> traverseInOrder(Node node, List<Integer> list) {

        if(node == null){
            return list;
        }

         traverseInOrder(node.left, list);// traverse left sub tree
        list.add((Integer) node.value); // root
         traverseInOrder(node.right, list); // traverse right sub tree

        return list;
    }


    public List<Integer> PostOrder() {
        List<Integer> list = new ArrayList<>();


        return traversePostOrder(root, list);
    }

    public List<Integer> traversePostOrder(Node node, List<Integer> list) {

        if(node == null){
            return list;
        }

        traversePostOrder(node.left, list);// traverse left sub tree
         traversePostOrder(node.right, list);// traverse right sub tree
        list.add((Integer) node.value); // root

        return list;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}

