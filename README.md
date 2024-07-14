# THIS IS A CLONED README! IT HAS NOTHING TO DO WITH THIS PROJECT!  

# Project Four: Implement Binary Search Trees
* Austin Howard
* 2024U_CSCI251_VA - Data Structures
* July 9, 2024
* Instructor: Leticia Rabor

## Project Description
In this project, students are required to implement a binary search tree using the provided class and method structures
to understand the interaction between nodes and subtrees when modifying their structures.The main class, 
CSCI463ProjFour, is already implemented by the professor and is not modified. This class will allow the user to input 
data into a binary search tree and basic manipulation of said data.

The goal of this project is to implement and interact with a Binary Search Tree (BST) in Java in order to understand 
tree structures and algorithms.

The instructor has provided a rigid class and method structures that I must work within. I have defined these to match
the project requirements listed below.

## Lecturer's Notes
This project is designed to help students understand the Binary Search Tree and algorithms related to Binary Search 
Tree.  

The students need to implement two given classes: TreeNode and BinarySearchTree. Three classes are given. 
The students shall not modify the CSCI463ProjFour.java file. However, the students should understand this file. 
The other two files, TreeNode.java and BinarySearchTree.java, are the files that the students need to finish.

These two files, TreeNode.java and BinarySearchTree.java, must be implemented within the given design. The students 
cannot change the name of public methods. The students cannot add extra public methods. However, the students may add 
private methods to make the implementation more clear and easier to read. 
* For instance, the toString method will return a String representation of a Binary Search Tree. The best way to do so 
is using recursive thinking. So the toString method actually is a driver method for private method nodeTraversal 
(see below). The implementation could be as following:
    ```
    public String toString() {
        return "(" + nodeTraversal(root) + ")";
    }
    private String nodeTraversal(TreeNode<E> treeNode) {
        if (treeNode == null)
            return "-";
        return treeNode.getData().toString() + "(" + nodeTraversal(treeNode.getLeft()) + ", " + nodeTraversal(treeNode.getRight()) + ")";
    }
    ```  

The students may run the given executable jar file to see how the project should work.  

## License
Uses GNU GPL v3.0  
Please see license in main branch.
