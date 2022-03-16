package challenge10.StackStructure;

public class Stack {

    private StackNode top;

    public Stack () {
        // default constructor
    }

    public StackNode getTop() {
        return top;
    }

    public boolean isEmpty () {
        return top == null;
    }

    public void push (StackNode stackNode){
        if (isEmpty()){
            top = stackNode;
        }else {
            stackNode.setNext(top);
            top = stackNode;
        }
    }

    public StackNode pop () {
        if (isEmpty()){
            return null;
        }else {
            top = top.getNext();
            return top;
        }
    }

    public StackNode peek () {
        return top;
    }
    public int length () {
        StackNode pointer = top;
        int count = 0;
        while (pointer != null){
            count++;
            pointer = pointer.getNext();
        }
        return count;
    }

    @Override
    public String toString() {

        StackNode pointer = top;
        System.out.println("<------------------- Stack ----------------->");
        while (pointer != null) {
            if (pointer == top){
                System.out.println(pointer + "  <---  top");
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
