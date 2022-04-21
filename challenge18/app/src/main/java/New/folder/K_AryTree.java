package New.folder;
import java.util.ArrayList;

public class K_AryTree {

    private ArrayList allData = new ArrayList<>();
    private Node root;

    public K_AryTree (Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public ArrayList print() {
        allData.clear();
        printAll (root);
        return allData;
    }

    public ArrayList getAllData() {
        return allData;
    }

    public void setAllData(ArrayList allData) {
        this.allData = allData;
    }

    public void printAll (Node node) {
        if (node == null)
            return;

        int size = 0;
        Node currentNode = null;
        allData.add(node.getValue());
        System.out.print(node.getValue() + " -> ");

        while (size < node.getChild().size()){
            currentNode = node.child.get(size);
            printAll(currentNode);
            size++;
        }
    }

    public K_AryTree fizzBuzz (K_AryTree tree) {
        fizzBuzzAll(tree.getRoot());
        return tree;
    }

    public void fizzBuzzAll(Node node) {
        if (node == null )
            return;

        int size = 0;
        Node currentNode = null;
        int currentValue = (int) node.getValue();

        if ( currentValue % 3 == 0 & currentValue % 5 != 0)
            node.setValue("Fizz");
        else if ( currentValue % 5 == 0 & currentValue % 3 != 0)
            node.setValue("Buzz");
        else if ( currentValue % 5 == 0 & currentValue % 3 == 0)
            node.setValue("FizzBuzz");
        else
            node.setValue(node.getValue() + "");

        while (size < node.getChild().size()){
            currentNode = node.child.get(size);
            fizzBuzzAll(currentNode);
            size++;
        }

    }

}
