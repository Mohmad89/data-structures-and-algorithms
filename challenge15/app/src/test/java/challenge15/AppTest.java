/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge15;

import challenge15.data.BTNode;
import challenge15.structure.BinarySearchTree;
import challenge15.structure.BinaryTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void emptyTree() {

        BinaryTree binaryTree = new BinaryTree<>();
        assertEquals(0 , binaryTree.getSize());
    }

    @Test
    void singleRoot () {
        BinaryTree binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new BTNode<>("A"));
        assertEquals("A", binaryTree.getRoot().getData());
    }

    @Test
    void leftRightBST () {
        BinarySearchTree binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(3);
        binarySearchTree.add(2);
        binarySearchTree.add(4);
        assertEquals(3, binarySearchTree.getSize());
    }

    @Test
    void preOrder () {
        BinaryTree binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new BTNode<>("A"));
        binaryTree.getRoot().setLeft(new BTNode<>("B"));
        binaryTree.getRoot().setRight(new BTNode<>("C"));
        assertEquals("A B C ", binaryTree.preOrder());

    }

    @Test
    void inOrder () {
        BinaryTree binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new BTNode<>("A"));
        binaryTree.getRoot().setLeft(new BTNode<>("B"));
        binaryTree.getRoot().setRight(new BTNode<>("C"));
        assertEquals("B A C ", binaryTree.inOrder());
    }

    @Test
    void postOrder () {
        BinaryTree binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new BTNode<>("A"));
        binaryTree.getRoot().setLeft(new BTNode<>("B"));
        binaryTree.getRoot().setRight(new BTNode<>("C"));
        assertEquals("B C A ", binaryTree.postOrder());
    }

    @Test
    void containNode () {
        BinarySearchTree binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(3);
        binarySearchTree.add(2);
        binarySearchTree.add(4);
        assertEquals(false, binarySearchTree.contain(7));// false
        assertEquals(true, binarySearchTree.contain(4));// true
    }

}
