# Challenge Summary
in this challenge we will to create method that do combine between tow linked list to.
___
## Whiteboard Process
![image](picture/ziplist%20method.png)
___
## Approach & Efficiency
Big O = O(n^2);
___
## Solution

        FirstLinkedList <Integer> firstLinkedList = new FirstLinkedList<>();  
        firstLinkedList.addNode(1);  
        firstLinkedList.addNode(3);  
        firstLinkedList.addNode(5);  
        firstLinkedList.addNode(7);  
        firstLinkedList.printNodes("First");  
  
   
        FirstLinkedList <Integer> secondLinkedList = new FirstLinkedList<>();  
        secondLinkedList.addNode(2);  
        secondLinkedList.addNode(4);  
        secondLinkedList.addNode(6);  
        secondLinkedList.addNode(8);  
        secondLinkedList.printNodes("Second");  

        FirstLinkedList resultLinkedList = firstLinkedList.zipLists(firstLinkedList, secondLinkedList);  
        resultLinkedList.printNodes("Result");  

        assertEquals(8, resultLinkedList.length());  
## Output   
First LinkedList : [1] => [3] => [5] => [7] => null  
Second LinkedList : [2] => [4] => [6] => [8] => null  
Result LinkedList : [1] => [2] => [3] => [4] => [5] => [6] => [7] => [8] => null  

