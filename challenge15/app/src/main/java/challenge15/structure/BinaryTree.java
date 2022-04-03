package challenge15.structure;

import challenge15.data.BTNode;
import challenge15.data.Node;
import challenge15.data.TreeNotFoundException;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class BinaryTree <T>{


    private BTNode root;
    private int size ;

    public BinaryTree () {

    }

    public BTNode getRoot() {
        return root;
    }

    public int getSize () {
        return size;
    }
    public void setRoot (BTNode root){
        this.root = root;
    }
    public void levelOrderTraversalLoop() {
        if (root != null) {
            Queue<BTNode> queue = new LinkedList<> ();
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



    public String preOrder() {
        if(root == null) {
            return "Tree is Empty";
        }

        Stack<BTNode> stack = new Stack<>();
        stack.push(root);

        String result = "";
        while(!stack.isEmpty()) {
            BTNode temp = stack.pop();
            result += (temp.getData() + " ");
            if(temp.getRight() != null) {
                stack.push(temp.getRight());
            }
            if(temp.getLeft() != null) {
                stack.push(temp.getLeft());
            }
        }
        return result;
    }



    public String inOrder() {
        if(root == null) {
            return("Tree is Empty");
        }

        Stack<BTNode> stack = new Stack<>();
        BTNode temp = root;
        String result = "";
        while(!stack.isEmpty() || temp != null) {
            if(temp != null) {
                stack.push(temp);
                temp = temp.getLeft();
            } else {
                temp = stack.pop();
                result += (temp.getData() + " ");
                temp = temp.getRight();
            }
        }
        return result;
    }


    public String postOrder(){
        BTNode current = root;
        Stack<BTNode> stack = new Stack<>();

        String result = "";
        while(current != null || !stack.isEmpty()){
            if(current != null){
                stack.push(current);
                current = current.getLeft();
            } else {
                BTNode temp = stack.peek().getRight();
                if(temp == null){
                    temp = stack.pop();
                    result += (temp.getData() + " ");
                    while(!stack.isEmpty() && temp == stack.peek().getRight()){
                        temp = stack.pop();
                        result += (temp.getData() + " ");
                    }
                } else {
                    current = temp;
                }
            }
        }
        return result;
    }

}
