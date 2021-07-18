package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;
    public BinaryTree(Node n) {
        this.root = n;
    }

    public  List inorder(Node n) {
        ArrayList tree=new ArrayList();
        if(n != null) {
            tree.addAll(inorder(n.getLeft())); // traverse left sub tree
            System.out.print(" " + tree.add(n.getKey())); // root
            tree.addAll( inorder(n.getRight())); // traverse right sub tree

        }
        return tree;
    }

    public List postorder(Node n) {
        ArrayList tree=new ArrayList();
        if(n != null) {
            tree.addAll(postorder(n.getLeft()));
            tree.addAll(postorder(n.getRight()));
            System.out.print(" "+tree.add(n.getKey())+" ");
        }
        return tree;
    }


    public List preorder(Node n) {
        ArrayList tree=new ArrayList();
        if(n != null) {
            System.out.print(" "+tree.add(n.getKey())+" ");
            tree.addAll(postorder(n.getLeft()));
            tree.addAll(postorder(n.getRight()));
        }
        return tree;
    }




    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }


}
