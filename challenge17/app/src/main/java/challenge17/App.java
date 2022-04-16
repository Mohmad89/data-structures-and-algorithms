/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge17;

import challenge17.data.BTNode;
import challenge17.structure.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App <T>{

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot(new BTNode(1));
        binaryTree.getRoot().setLeft(new BTNode<Integer>(3));
        binaryTree.getRoot().setRight(new BTNode<Integer>(12));
        binaryTree.getRoot().getLeft().setLeft(new BTNode<Integer>(6));
        binaryTree.getRoot().getLeft().setRight(new BTNode<Integer>(7));
        binaryTree.getRoot().getRight().setLeft(new BTNode<Integer>(9));
        binaryTree.levelOrderTraversalLoop();

        ArrayList<String> arrayList = breadthFirst(binaryTree);
        System.out.println(arrayList);
    }


    public static ArrayList<String> breadthFirst (BinaryTree binaryTree) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (binaryTree.getRoot() != null) {
            Queue<BTNode> queue = new LinkedList<>();
            queue.offer(binaryTree.getRoot());

            while (!queue.isEmpty()) {
                BTNode node = queue.poll();
                arrayList.add(node.getData().toString());
                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            }
        }else {
            return null;
        }
        return arrayList;
    }

}