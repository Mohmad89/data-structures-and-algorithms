package challenge10.QueueStructure;

public class QueueNode <T> {

    private T value;
    private QueueNode next;

    public QueueNode (T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "{" +
                "value=" + value +
                '}';
    }
}
