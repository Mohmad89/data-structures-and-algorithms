package challenge30.structure;

import challenge30.data.HashNode;

import java.util.ArrayList;
import java.util.List;

public class HashMap <K, V>{

    private ArrayList <HashNode<K, V>> bucketArray;
    private int buckets;
    private int size;

    public HashMap() {
        bucketArray = new ArrayList<>();
        buckets = 10;

        // init bucket array to prevent index out
        // of bounds exception for fits time insert /retrieval
        for (int index = 0; index < buckets; index++){
            bucketArray.add(null);
        }
    }


    public int getSize() {
        return size;
    }

    public int getBuckets() {
        return buckets;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hashCode (K key){
        return key.hashCode();
    }

    /*
    This is the hashing logic which produces
    a unique array index to do insets and lookups
    * */
    private int getBucketIndex (K key) {
        int hashCode = hashCode(key);

        int arrayIndex = hashCode % this.buckets;
        if (arrayIndex < 0){
            arrayIndex = arrayIndex * -1;
        }

        return arrayIndex;
    }

    public void set (K key, V value) {
        // find the index of where we should put the value
        // in the bucket array

        int index = getBucketIndex(key);
        int hashcode = hashCode(key);


        // Create head and make it point to where the index is
        HashNode<K, V> head = bucketArray.get(index);

        HashNode<K, V> newNode = new HashNode<>(key, value, hashcode);
        // head could be pointing to a list so we need to loop over
        // the potential list and insert a new node at the end.

        if (head == null) {
            bucketArray.set(index, newNode);
            size++;
        } else {

            newNode.setNext(head.getNext());
            head.setNext(newNode);

            size++;
        }

//        if ((1.0 * size) / buckets >= 0.7) {
//            ArrayList<HashNode<K, V>> temp = bucketArray;
//            bucketArray = new ArrayList<>();
//            buckets = 2 * buckets;
//            size = 0;
//            for (int i = 0; i < buckets; i++)
//                bucketArray.add(null);
//
//            for (HashNode<K, V> headNode : temp) {
//                while (headNode != null) {
//                    set(headNode.getKey(), headNode.getValue());
//                    headNode = headNode.getNext();
//                }
//            }
//        }
    }

    public V get (K key) {

        int index = getBucketIndex(key);
        int hashcode = hashCode(key);

        HashNode <K, V> head = bucketArray.get(index);

        while (head != null) {
            if (head.getKey().equals(key) & head.getHashCode() == hashcode) {
                return head.getValue();
            }
            head = head.getNext();
        }
        return null;
    }

    public boolean contains (K key) {
        int index = getBucketIndex(key);
        HashNode <K, V> head = bucketArray.get(index);

        while (head != null) {
            if (head.getKey().equals(key)) {
                return true;
            }
            head = head.getNext();
        }
        return false;
    }


    public List<K> keys(){
        ArrayList<K> keys = new ArrayList<>();

        for (int index = 0 ; index < bucketArray.size() ; index++)
        {
            HashNode<K, V> head = bucketArray.get(index);
            while (head != null)
            {
                keys.add(head.getKey());
                head = head.getNext();
            }
        }
        return keys;
    }



    public int hash (K key){
        List<K> keysList = keys();
        if (keysList.contains(key)){
            return getBucketIndex(key);
        } else
            return -1;

    }




}

