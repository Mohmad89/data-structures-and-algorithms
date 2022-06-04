package challenge30;

import challenge30.data.BTNode;
import challenge30.data.HashNode;
import challenge30.structure.BinaryTree;
import challenge30.structure.HashMap;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Algorithm <K, V> {

    public Algorithm() {

    }
    public String repeatedWord(String text) {
        HashMap<K, V> hashMap = new HashMap<K, V>();
        String[] array = text.toLowerCase().split(" ");

        for (int i=0; i<array.length; i++) {

            if (hashMap.contains((K) array[i].replaceAll("[^a-zA-Z0-9]", ""))){
                return array[i];
            }
            hashMap.set((K) array[i].replaceAll("[^a-zA-Z0-9]", ""), (V) (array[i] + i));
        }
        return "There isn't any repeated word ! ";
    }

    public String leftJoin (HashMap<K, V> hashMap1, HashMap<K, V> hashMap2){

        List<K> keysHashMap1 = hashMap1.keys();
        List<K> keysHashMap2 = hashMap2.keys();
        String result = "";
        for (int index = 0; index < keysHashMap1.size(); index++){
            if (hashMap1.contains(keysHashMap2.get(index))){
                result += "[ " +  keysHashMap2.get(index) + ", " +
                        hashMap1.get(keysHashMap2.get(index)).toString() + ", " +
                        hashMap2.get(keysHashMap2.get(index)) + " ] " + '\n';
            }if (hashMap2.contains(keysHashMap1.get(index)) == false) {
                result += "[ " + keysHashMap1.get(index) + ", " +
                        hashMap1.get(keysHashMap1.get(index)).toString() + ", " +
                        null + " ] " + '\n';
            }
        }
        return result;
    }

    public List <V> treeIntersection (BinaryTree binaryTreeOne, BinaryTree binaryTreeTwo){

        BTNode rootOne = binaryTreeOne.getRoot();
        BTNode rootTwo = binaryTreeTwo.getRoot();

        HashMap hashMap = new HashMap();

        List <V> nodeTreeOne = binaryTreeOne.listOfTree(binaryTreeOne);

        if (rootTwo != null && rootOne != null) {
            Queue<BTNode> queue = new LinkedList<>();
            queue.offer(rootTwo);

            while (!queue.isEmpty()) {
                BTNode node = queue.poll();
                if (nodeTreeOne.contains(node.getData()))
                    hashMap.set(node.getData(), node.getData() + " value ");

                if (node.getLeft() != null)
                    queue.offer(node.getLeft());

                if (node.getRight() != null)
                    queue.offer(node.getRight());
            }
        }
        if (hashMap.keys().size() > 0)
            return  hashMap.keys();
        else
            return null;
    }
}
