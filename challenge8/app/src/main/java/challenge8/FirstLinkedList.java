package challenge8;

import java.util.LinkedList;

public class FirstLinkedList <T>{

    Node head;

    public FirstLinkedList () {
        head = null;
    }

    public void addNode (T value){
        Node newNode = new Node (value);
        Node pointer = head;
        if (head == null){
            newNode.next = head;
            head = newNode;
        }else {
            while (pointer != null){
                if (pointer.next == null){
                    newNode.next = null;
                    pointer.next = newNode;
                    break;
                }
                pointer = pointer.next;
            }
        }
    }

    public FirstLinkedList zipLists(FirstLinkedList firstLinkedList, FirstLinkedList secondLinkedList){
        Node pointer1 = head;
        Node pointer2 = secondLinkedList.head;
        FirstLinkedList<Integer> newLinkedList = new FirstLinkedList<>();

        while (pointer1 != null ||  pointer2 != null){

            if (pointer1 == null){
                while (pointer2 != null) {
                    newLinkedList.addNode((Integer) pointer2.value);
                    pointer2 = pointer2.next;
                }
                break;

            }
            if (pointer2 == null){
                while (pointer1 != null) {
                    newLinkedList.addNode((Integer) pointer1.value);
                    pointer1 = pointer1.next;
                }
                break;
            }
            newLinkedList.addNode((Integer) pointer1.value);
            newLinkedList.addNode((Integer) pointer2.value);
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return newLinkedList;

    }

    public int length () {
        int count = 0;
        Node pointer = head;
        while (pointer != null){
            count++;
            pointer = pointer.next;
        }
        return count;
    }

    public void printNodes (String title) {

        Node pointer = head;
        System.out.print(title + " LinkedList : ");
        while (pointer != null) {
            System.out.print( "[" + pointer.value + "]" + " => ");
            pointer = pointer.next;
        }
        System.out.println("null");
    }
}
