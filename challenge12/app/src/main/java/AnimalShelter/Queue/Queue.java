package AnimalShelter.Queue;

import java.util.NoSuchElementException;

public class Queue<T> {


    private QueueNode <T> front= null ;
    private QueueNode <T> back = null;
    private int size = 0;


    public Queue () {}

    public QueueNode<T> getFront() {
        return front;
    }

    public void setFront(QueueNode<T> front) {
        this.front = front;
    }

    public QueueNode<T> getBack() {
        return back;
    }

    public void setBack(QueueNode<T> back) {
        this.back = back;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void enqueue (T value) {
        QueueNode <T> newNode = new QueueNode<>(value);
        if (isEmpty()) {
            front = newNode;
            back = newNode;
        }else {
            newNode.setNext(back);
            back = newNode;
            size++;
        }
    }

    public T dequeue () {

        if (isEmpty()){
            return null;
        }else {
            T value = back.getValue();
            back = back.getNext();
            return value;
        }
    }

    public T peek () {
        if (isEmpty())
            return null;
        else
            return front.getValue();
    }

    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", back=" + back +
                ", size=" + size +
                '}';
    }

}