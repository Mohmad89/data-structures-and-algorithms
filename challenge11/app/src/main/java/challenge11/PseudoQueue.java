package challenge11;

import com.google.common.util.concurrent.ClosingFuture;

public class PseudoQueue <T>{
    private Stack <T> firstStack = new Stack<>();
    private Stack <T> secondStack = new Stack<>();
    private Node rear ;
    private Node front;
    private int length;

    public PseudoQueue () {

    }

    public int getLength() {
        return length;
    }

    public void enqueue (T value) {
        firstStack.push(value);
        Node pointer = firstStack.top;
        secondStack.top = null;
        length++;
        while (pointer != null){
            secondStack.push((T) pointer.getValue());
            pointer = pointer.getNext();
        }
        queueFront();
        queueRear();
    }

    public Node dequeue () {
        Node dequeueNode= secondStack.pop();
        queueFront();
        queueRear();
        return dequeueNode;
    }

    public void queueFront () {
        this.front = secondStack.top;

    }
    public void queueRear () {
        this.rear = firstStack.top;
    }

    public Node getRear() {
        queueRear();
        return rear;
    }

    public Node getFront() {
        queueFront();
        return front;
    }

    public void printQueue () {

        secondStack.printStack();
    }

}
