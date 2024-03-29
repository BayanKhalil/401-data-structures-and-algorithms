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
    public List breadthFirstTraverse (Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        List result = new ArrayList();

        // put the root into the queue to process first.
        if (root == null) {
            throw new NullPointerException("no element in the tree");
        } else {
            queue.add(root);
        }
        // process rest of the nodes, while there are nodes left
        while (!queue.isEmpty()) {
            Node currNode = queue.remove();
            result.add(currNode.value);

//            System.out.println("current result is " + result);
//            System.out.println("current queue is " + queue);
//            System.out.println("current node is " + currNode.value);

            if (currNode !=null && currNode.left != null) {
                queue.add(currNode.left);
            }
            if (currNode != null && currNode.right != null) {
                queue.add(currNode.right);
            }
        }
        return result;
    }

    public  BinaryTree <String> fizzBuzz(BinaryTree<Integer> input) {
        BinaryTree<String> answer = new BinaryTree<>();
        answer.root = fizzBuzzHelper(input.root);
        return answer;
    }

    private  Node<String> fizzBuzzHelper(Node<Integer> node) {
        if (node == null) {
            return null;
        } else {
            Node<String> answer = new Node<>();
            if ((node.value % 3) == 0 && (node.value % 5) == 0) {
                answer.value = "fizzbuzz";
            } else if (node.value % 5 == 0) {
                answer.value = "buzz";
            } else if (node.value % 3 == 0) {
                answer.value = "fizz";
            } else {
                answer.value = node.value.toString();
            }
            // We recurse on the left (circle the left side of the tree) and
            // we recurse on the right side of the tree (circle the right side of the tree).
            answer.left = fizzBuzzHelper(node.left);
            answer.right = fizzBuzzHelper(node.right);
            return answer;
        }


    }

    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}

