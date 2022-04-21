package New.folder;

import java.util.ArrayList;

public class Node {

    public ArrayList <Node > child;
    public Object value;

    public Node (Object value) {
        this.value = value;
        child = new ArrayList<>();
    }

    public ArrayList<Node> getChild() {
        return child;
    }

    public void setChild(ArrayList<Node> child) {
        this.child = child;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void addChild(Object child) {
        Node newNode = new Node (child);
        this.child.add(newNode);
    }


}
