package challenge6.com.example.LinkedList;

public class LinkedList <T>{

    Node head;

    public LinkedList (){
        this.head = null;
    }

    public void append (T value){
        Node newNode = new Node(value);
        Node pointer = this.head;
        if (pointer == null){
            newNode.next=null;
            this.head = newNode;
        }else {
            while (pointer != null) {
                if (pointer.next == null) {
                    newNode.next = null;
                    pointer.next = newNode;
                    break;

                }
                pointer = pointer.next;
            }
        }

    }

    public String insertBefore(T newValue, T oldValue){
        Node newNode = new Node (newValue);
        Node pointer = this.head;
        if (this.head.value == oldValue){
            newNode.next = this.head;
            this.head = newNode;
            return "The newNode insert before the first Node";

        }else {
            while (pointer != null) {
                if (pointer.next.value == oldValue) {
                    newNode.next = pointer.next;
                    pointer.next = newNode;
                    break;
                }
                pointer = pointer.next;
            }
        }
        return "the newNode insert in The middle";
    }

    public String insertAfter (T newValue, T oldValue){
        Node pointer =this.head;
        Node newNode = new Node(newValue);

        while (pointer != null){
            if (pointer.value == oldValue){
                if (pointer.next == null){
                    newNode.next = null;
                    pointer.next = newNode;
                    return "the newNode insert after the last node";

                }
                newNode.next = pointer.next;
                pointer.next =newNode;

                break;
            }
            pointer = pointer.next;
        }
        return "the newNode insert after the middle node";
    }

    public int length (){
        Node pointer = this.head;
        int count = 0;
        while (pointer != null){
            count++;
            pointer = pointer.next;
        }
        return count;
    }

    public void printItems(){
        Node pointer = this.head;
        while(pointer != null){
            System.out.println(pointer.value);
            pointer = pointer.next;
        }
    }
}
