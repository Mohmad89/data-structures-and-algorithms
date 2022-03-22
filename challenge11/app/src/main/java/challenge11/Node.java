package challenge11;

public class Node <T>{

    private T value;
    private Node next;

    public Node (T value){
        this.value = value;
    }

    public Node getNext () {
        return next;
    }

    public void setNext (Node value){
        next = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }



    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
