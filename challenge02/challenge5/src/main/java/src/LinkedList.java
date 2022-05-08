package src;

public class LinkedList <T>{

    Node head;

    public LinkedList(){
        this.head = null;
    }

//    public void insert(T value){
//        Node newNode = new Node<>(value);
//        newNode.next = this.head;
//        this.head = newNode;
//    }

    public void inserts (T value){
        Node newNode = new Node<>(value);
        Node pointer = this.head;
        if(pointer == null){
            newNode.next = null;
            this.head = newNode;
        }
        while(pointer != null){

            if(pointer.next == null){
                newNode.next=null;
                pointer.next = newNode;
                break;
            }
            pointer = pointer.next;
        }
    }

    public boolean include (T value){
        Node pointer = this.head;
        while (pointer != null){
            if(pointer.value == value){
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }

    public void printItems(){
        Node pointer = this.head;
        while(pointer != null){
            System.out.println(pointer.value);
            pointer = pointer.next;
        }
    }
    public String tostring () {
        Node pointer = this.head;
        String result ="";
        while ( pointer != null){

            result += "{"+pointer.value+"} -> ";
            pointer = pointer.next;
        }
        return result + "NULL";
    }

    public int length(){
        Node pointer = this.head;
        int count = 0;
        while(pointer != null){
            count++;
            pointer = pointer.next;
        }
        return count;
    }

    public String Collection(){
        Node pointer = this.head;
        String result = "";
        while(pointer != null){
            result += pointer.value;
            pointer = pointer.next;
        }
        return  result;
    }
}
