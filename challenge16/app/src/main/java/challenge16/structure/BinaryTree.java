package challenge16.structure;

import challenge16.data.BTNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public int Max () {
        if (root == null){
            return 0;
        }
        Stack<BTNode> stack = new Stack<>();
        stack.push(root);

        int max = (int) root.getData();

        while (!stack.isEmpty()){
            BTNode value = stack.pop();
            if ((int)value.getData() > max){
                max = (int)value.getData();
            }
            if (value.getRight() != null){
                stack.push(value.getRight());
            }
            if (value.getLeft() != null){
                stack.push(value.getLeft());
            }
        }
        return max;
    }
}
