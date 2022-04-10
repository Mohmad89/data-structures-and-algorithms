package challenge17.structure;

import challenge17.data.BTNode;



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


}
