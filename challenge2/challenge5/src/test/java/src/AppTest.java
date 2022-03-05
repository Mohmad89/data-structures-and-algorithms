package src;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test void emptyLinkList(){
        LinkedList<String> empty = new LinkedList<>();
        assertEquals(0, empty.length());
    }
    @Test void insertLinkedList(){
        LinkedList <Integer> insert = new LinkedList<>();
        insert.inserts(5);
        assertEquals(1 , insert.length());
    }
    @Test void multipleInsertLinkedList(){
        LinkedList<Integer> multipleInsert = new LinkedList<>();
        multipleInsert.inserts(3);
        multipleInsert.inserts(6);
        multipleInsert.inserts(8);
        multipleInsert.inserts(9);
        assertEquals(4, multipleInsert.length());
    }
    @Test void findValue (){
        LinkedList<Integer> find = new LinkedList<>();
        find.inserts(5);
        find.inserts(7);
        assertEquals(true, find.include(5));
    }

    @Test void notFindValue (){
        LinkedList <Integer> notFound = new LinkedList<>();
        notFound.inserts(8);
        notFound.inserts(5);
        notFound.inserts(4);
        assertEquals(false, notFound.include(99));
    }

    @Test void collectionValue(){
        LinkedList <Integer> collection = new LinkedList<>();
        collection.inserts(1);
        collection.inserts(2);
        collection.inserts(3);
        assertEquals("123", collection.Collection());
    }
}
