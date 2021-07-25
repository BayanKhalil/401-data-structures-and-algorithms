package Tree;


import java.io.*;
import java.util.*;

public class BinaryTree<T> extends BinarySearchTree {

    //It is used to call superclass methods, and to access the superclass constructor.
// The most common use of the super keyword is to eliminate the
// confusion between superclasses and subclasses that have methods with the same name.
    public BinaryTree() {
        super();
    }

    public BinaryTree(T value) {
        Node node1 = new Node(value);
        this.root = node1;
    }


    public List<Integer> Preorder() {
        List<Integer> list = new ArrayList<>();


        return traversePreorder(root, list);
    }

    public List<Integer> traversePreorder(Node node, List<Integer> list) {

        if (node == null) {
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

        if (node == null) {
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

        if (node == null) {
            return list;
        }

        traversePostOrder(node.left, list);// traverse left sub tree
        traversePostOrder(node.right, list);// traverse right sub tree
        list.add((Integer) node.value); // root

        return list;
    }

    public int findMaximumValue() {

        if (this.root.value instanceof Integer) {
            return maxFinder(root, (Integer) root.value);

        } else {
            throw new NoSuchElementException("no element of this type in the tree");
        }

    }
//  prOrder process
    public int maxFinder(Node curr, int highest){
        if(curr == null) {
            return highest;
        }
        if((Integer)curr.value > highest) {
            highest = (Integer)curr.value;
        }
        if (curr.left != null) {
            highest = maxFinder(curr.left, highest);
        }
        if (curr.right != null) {
            highest = maxFinder(curr.right, highest);
        }
        return highest;
    }


    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}

