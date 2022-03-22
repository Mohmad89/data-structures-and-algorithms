package challenge11;

public class Stack <T>{
    Node top;

    public Stack () {

    }

    public boolean isEmpty () {
        return top == null;
    }

    public void push(T value) {
        Node newNode = new Node(value);
        if(isEmpty()) {
            top = newNode;
        }else {
            newNode.setNext(top);
            top = newNode;
        }
    }

    public Node pop () {
        Node topValue = top;
        if (isEmpty()){
        }else {
            top = top.getNext();
        }
        return topValue;
    }

    public Node peek () {
        return top;
    }

    public void printStack () {
        Node pointer = top;
        while (pointer != null){
            System.out.println(pointer.getValue());
            pointer = pointer.getNext();
        }
    }
}
