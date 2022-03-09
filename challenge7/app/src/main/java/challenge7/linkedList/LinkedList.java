package challenge7.linkedList;

public class LinkedList <T> {

    private Node head;
    private int count;

    public LinkedList () {
        head = null;
    }

    public int getCount (){
        return count;
    }

    public void addNode (T value) {
        Node newNode = new Node (value);
        Node pointer = head;

        if (pointer == null){
            newNode.next = null;
            head = newNode;
        }else {
            while (pointer != null){
                if (pointer.next == null){
                    count++;
                    newNode.next = null;
                    pointer.next = newNode;
                    break;
                }
                pointer = pointer.next;
            }
        }
    }

    public int length () {
        int index = 0;
        Node pointer = head;
        while (pointer != null){
            index++;
            pointer = pointer.next;
        }
        return index;
    }

    public String happyPath (int value) {
        if (this.length() > value){
            return "Happy Path";
        }
        return "";
    }


    public String kthFromEnd (int index) {
        if (index < 0){
            return "Exception";
        }
        Node pointer = head;
        int result = count - index;
        int count = 0;
        if (result < 0){
            return "Exception";
        }else if (result == 0){
            return pointer.value + "";
        }
        else {
            while (pointer != null){

                if (count == result){
                    return pointer.value + "";
                }
                pointer = pointer.next;
                count ++;
            }

        }
        return "";
    }

    public void printItem () {
        Node pointer = head;
        while (pointer != null ){
            System.out.println(pointer.value);
            pointer = pointer.next;
        }
    }
}
