package challenge10.QueueStructure;

import jdk.nashorn.internal.ir.AccessNode;

public class Queue {

    private QueueNode back;
    private QueueNode front;

    public  Queue () {
        // default constructor
    }

    public QueueNode getBack() {
        return back;
    }

    public QueueNode getFront() {
        return front;
    }

    public boolean isEmpty () {
        return front == null;
    }

    public QueueNode peek () {
        return front;
    }

    public int length () {
        QueueNode pointer = back;
        int count = 0;
        while (pointer != null){
            count++;
            pointer = pointer.getNext();
        }
        return count;
    }

    public void enqueue (QueueNode queueNode){
        if (isEmpty()){
            front = queueNode;
            back = queueNode;
        }else {
            queueNode.setNext(back);
            back = queueNode;
        }
    }

    public QueueNode dequeue () {
        QueueNode pointer = back;

        if (pointer == front){
            back = null;
            front = null;
        }else {
            while (pointer != front){
                if (pointer.getNext() == front){
                    pointer.setNext(null);
                    front = pointer;
                    break;
                }
                pointer = pointer.getNext();
            }
        }
        return front;
    }

    @Override
    public String toString() {
        QueueNode pointer  = back;
        System.out.println("<------------------- Queue ----------------->");
        while (pointer != null){
            if (pointer == back){
                System.out.println(pointer + "  <--- back");
                System.out.println("    |   ");
                System.out.println("    V   ");
                pointer = pointer.getNext();
                continue;
            }
            if (pointer == front){
                System.out.println(pointer + "  <--- front");
                System.out.println("    |   ");
                System.out.println("    V   ");
                pointer = pointer.getNext();
                continue;
            }

            System.out.println(pointer);
            System.out.println("    |   ");
            System.out.println("    V   ");
            pointer = pointer.getNext();
        }
        System.out.println("   null   ");
        System.out.println("<------------------------------------------->");

        return "";
    }
}
