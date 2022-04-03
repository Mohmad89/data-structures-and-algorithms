package challenge15.structure;

import challenge15.data.BinaryNode;
import challenge15.data.Node;

public class BinarySearchTree <T extends Comparable<T>> {

    private Node<T> root;
    private int size;

    public BinarySearchTree () {

    }


    public int getSize() {
        return size;
    }

    public boolean treeIsEmpty(){
        return root == null;
    }

    public void add(T data){
        if (treeIsEmpty()){
            root = new BinaryNode<>(data);
            size++;
        }else {
            add(data, root);
        }
    }

    public void add(T data, Node<T> root){
        if (data.compareTo(root.getData()) < 0){
            if (root.getLeftNode() != null){
                add(data, root.getLeftNode());
            }else {
                Node <T> newNode = new BinaryNode<>(data);
                root.setRightNode(newNode);
                size++;
            }
        }else if (data.compareTo(root.getData()) > 0){
            if (root.getRightNode() != null){
                add(data, root.getRightNode());
            }else {
                Node <T> newNode = new BinaryNode<>(data);
                root.setRightNode(newNode);
                size++;
            }
        }
    }


    public boolean contain (T value){
        return contain (root, value);
    }

    public boolean contain (Node<T> root, T value){
        if (root == null ){
            return false;
        }else if (root.getData() == value){
            return true;
        }
        if (value.compareTo(root.getData()) < 0){
            return contain(root.getLeftNode(), value);
        } else {
            return contain(root.getRightNode(), value);
        }

    }
    private void preOrder(Node<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        printNode(treeNode);

        preOrder(treeNode.getLeftNode());

        preOrder(treeNode.getRightNode());
    }

    public void printNode (Node <T> node){
        System.out.println(node.getData());
    }

}
