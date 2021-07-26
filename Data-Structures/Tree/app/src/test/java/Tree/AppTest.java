/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

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
       String expected="BinarySearchTree{root=Node{value=5, right=Node{value=7, right=Node{value=10, right=null, left=null}, left=null}, left=Node{value=3, right=null, left=null}}}" ;
        assertEquals (expected,test3.toString());
    }

@DisplayName("return a collection from a postorder traversal")
@Test
public void test4(){
    BinaryTree  binaryTree = new BinaryTree();



        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(3);
        binaryTree.add(10);



    List expected=binaryTree.PostOrder();
    assertArrayEquals(Arrays.asList(3,10,7,5).toArray(), expected.toArray());

}
    @DisplayName("return a collection from a preorder traversal")
    @Test
    public void test5(){
        BinaryTree  binaryTree = new BinaryTree();



        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(3);
        binaryTree.add(10);



        List expected=binaryTree.Preorder();
        assertArrayEquals(Arrays.asList(5,3,7,10).toArray(), expected.toArray());


    }
    @DisplayName("return a collection from an inorder traversal")
    @Test
    public void test6(){
        BinaryTree  binaryTree = new BinaryTree();



        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(3);
        binaryTree.add(10);



        List expected=binaryTree.inOrder();
        assertArrayEquals(Arrays.asList(3,5,7,10).toArray(), expected.toArray());


    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>> tree-Max<<<<<<<<<<<<<<<
@DisplayName("return a max value")
@Test
public void test7() {
    BinaryTree binaryTree = new BinaryTree();
    binaryTree.add(5);
    binaryTree.add(7);
    binaryTree.add(3);
    binaryTree.add(10);


    int expected=binaryTree.findMaximumValue();
    assertEquals(expected,10);
}
    @DisplayName("Empty tree")
    @Test
    void test8() {

        BinaryTree binaryTree = new BinaryTree();
        assertNotNull(binaryTree);
    }

    @DisplayName("Exception")
    @Test
    public void testExceptionMessage() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add("g");
        Throwable exception = assertThrows(NoSuchElementException.class, () -> {
            binaryTree.findMaximumValue();
//            throw new NoSuchElementException("no element of this type in the tree");
        });
        assertEquals("no element of this type in the tree",exception.getMessage());

    }
//>>>>>>>>>>>>>>><<<<<<<<<<breadthFisrt Tree<<<<<<<<<<<<<<<<<<<<<<<<<<<

    @DisplayName("return a breadthFirst tree")
    @Test
    public void test9(){
        BinaryTree  binaryTree = new BinaryTree();

        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(3);
        binaryTree.add(10);

        List expected=binaryTree.breadthFirstTraverse(binaryTree.root);
        assertArrayEquals(Arrays.asList(5,3,7,10).toArray(), expected.toArray());


    }

    @DisplayName("empty tree in breadthFisrt Tree")
    @Test
    public void test10(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(5);
        assertNotNull(binaryTree.breadthFirstTraverse(binaryTree.root));
    }
    @DisplayName("Exception")
    @Test
    public void test11() {
        BinaryTree binaryTree = new BinaryTree();

        Throwable exception = assertThrows(NullPointerException.class, () -> {
            binaryTree.breadthFirstTraverse(binaryTree.root);

        });
        assertEquals("no element in the tree",exception.getMessage());

    }
}