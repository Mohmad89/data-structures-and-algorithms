package challenge17.structure;

import challenge17.data.BTNode;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree <T>{

    private BTNode root;
    private int size;

    public BinaryTree () {}

    public BTNode getRoot() {
        return root;
    }

    public int getSize() {
        return size;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }

    public void levelOrderTraversalLoop() {
        if (root != null) {
            Queue<BTNode> queue = new LinkedList<>();
            queue.offer(root);
            size++;
            while (!queue.isEmpty()) {
                BTNode node = queue.poll();
                System.out.print(node.getData() + " => ");
                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            }
        } else {
            System.out.println("Tree is Empty");
        }
    }


}
