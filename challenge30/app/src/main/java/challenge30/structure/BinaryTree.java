package challenge30.structure;

import challenge30.data.BTNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree <V>{

    private BTNode root;
    private int size;

    public BinaryTree () {}

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void levelOrderTraversalLoop () {

        if (root != null){

            Queue <BTNode> queue = new LinkedList<>();
            queue.offer(root);

            size++;

            while (!queue.isEmpty()){
                BTNode node = queue.poll();

                System.out.print(node.getData() + " => ");

                if (node.getLeft() != null)
                    queue.offer(node.getLeft());

                if (node.getRight() != null)
                    queue.offer(node.getRight());
            }
        }else {
            System.out.println("Tree is Empty");
        }
    }

    public List<V> listOfTree(BinaryTree binaryTree) {

        BTNode rootTree = binaryTree.getRoot();
        List<V> allTreeNode = new ArrayList<>();

        if (rootTree != null) {
            Queue <BTNode> queue = new LinkedList<>();
            queue.offer(rootTree);

            while (!queue.isEmpty()) {
                BTNode node = queue.poll();

                allTreeNode.add((V)node.getData());

                if (node.getLeft() != null)
                    queue.offer(node.getLeft());

                if (node.getRight() != null)
                    queue.offer(node.getRight());
            }
            return  allTreeNode;
        }else
            return null;
    }


}
