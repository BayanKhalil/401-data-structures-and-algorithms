# Tree
You can create different type of tree and manipulate it.

## Challenge
1. Create a Node class that has properties for the value stored in the node, the left child node, and the right child nod
2. Create a Binary Tree 
3. Create a Binary Search Tree 



## Approach & Efficiency
There are three main classes ( Node , BinarySearchTree ,BinaryTree ), each Node has two fields (key, left node,right node ) and the tree has one field which is the (root node) root will pointing always to the first node of the tree,
 in Binary Tree the PreOrder method, inOrder and PostOrder implement the depth first traversals. the big O: O(n)
## API
Binary Tree methods: 

* preOrder :root,left ,right 

* inOrder :left ,root , right 

* postOrder left, right,root 

BinarySearchTree methods:

* Add method: we will check if the node is null, insert the new node . if the new node< the current node ==> go to left if the new node> current node go to right

* contains method:checks if the tree contains a specific value or not 