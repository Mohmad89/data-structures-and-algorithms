package challenge10.StackStructure;

public class StackNode <T>{

    private T value;
    private StackNode next;

    public StackNode (T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

    @Override
    public String toString() {

        return "{" +
                "value=" + value +
                '}';
    }
}
