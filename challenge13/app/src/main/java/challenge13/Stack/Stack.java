package challenge13.Stack;

public class Stack {

    private Node top;

    public Stack () {
        top = null;
    }

    public boolean isEmpty () {
        return top == null;
    }

    public void push (char value){
        Node newNode = new Node(value);
        Node pointer = top;
        if (isEmpty()){
            newNode.setNext(null);
            top = newNode;
        }else {
            newNode.setNext(top);
            top = newNode;
            }

    }

    public char pop () {
        char last = 0;
        if (!isEmpty()){
            last = top.getValue();
            top = top.getNext();
        }
        return  last;
    }
}
