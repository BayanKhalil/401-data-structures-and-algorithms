/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @DisplayName( "instantiate an empty tree")
    @Test
    public void test1() {
        BinarySearchTree test1 = new BinarySearchTree();
        assertNull (test1.root);
    }

    @DisplayName(" instantiate a tree with a single root node")
    @Test
    public void test2() {
        BinarySearchTree test2 = new BinarySearchTree();
        test2.add(5);
       assertNotNull (test2.root);
    }

    @DisplayName("  add a left child and right child to a single root node")
    @Test
    public void test3() {
        BinarySearchTree test3 = new BinarySearchTree();
        test3.add(5);
        test3.add(7);
        test3.add(3);
        test3.add(10);
       String expected="BinarySearchTree{root=Node{key=5, left=Node{key=3, left=null, right=null}, right=Node{key=7, left=null, right=Node{key=10, left=null, right=null}}}}" ;
        assertEquals (expected,test3.toString());
    }

@DisplayName("return a collection from a postorder traversal")
@Test
public void test4(){
    Node  node1 = new Node(1);
    Node  node2 = new Node(2);
    Node  node3 = new Node(3);

    BinaryTree binaryTree = new BinaryTree(node1);

    node1.setLeft(node2);
    node1.setRight(node3);
    List expected=binaryTree.postorder(binaryTree.root);
    assertArrayEquals(Arrays.asList(2,3,1).toArray(), expected.toArray());

}
    @DisplayName("return a collection from a preorder traversal")
    @Test
    public void test5(){
        Node  node1 = new Node(1);
        Node  node2 = new Node(2);
        Node  node3 = new Node(3);

        BinaryTree binaryTree = new BinaryTree(node1);

        node1.setLeft(node2);
        node1.setRight(node3);
        List expected=binaryTree.preorder(binaryTree.root);
        assertArrayEquals(Arrays.asList(1,2,3).toArray(), expected.toArray());

    }
    @DisplayName("return a collection from an inorder traversal")
    @Test
    public void test6(){
        Node  node1 = new Node(1);
        Node  node2 = new Node(2);
        Node  node3 = new Node(3);

        BinaryTree binaryTree = new BinaryTree(node1);

        node1.setLeft(node2);
        node1.setRight(node3);
        List expected=binaryTree.preorder(binaryTree.root);
        assertArrayEquals(Arrays.asList(1,2,3).toArray(), expected.toArray());

    }
}
