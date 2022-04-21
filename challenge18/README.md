# Challenge Summary

in this challenge i will to create method that accept K_ary Tree then return new Tree With some changeing

1. If the value is divisible by 3, replace the value with “Fizz”
2. If the value is divisible by 5, replace the value with “Buzz”
3. If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
4. If the value is not divisible by 3 or 5, simply turn the number into a String

## Whiteboard Process

![Fizz Buzz Whiteboard](Whiteboard%20(2).png)

## Approach & Efficiency

## Big ) Notation 
1. Space : O(n)
2. Time  : O(n)

## Solution

* Examples :  
        K_AryTree tree = new K_AryTree(new Node(1));  
        tree.getRoot().addChild(2);  
        tree.getRoot().addChild(3);  
        tree.getRoot().addChild(4);  
        tree.getRoot().addChild(5);  
        tree.getRoot().getChild().get(0).addChild(6);  
        tree.getRoot().getChild().get(0).addChild(7);  
        tree.getRoot().getChild().get(0).addChild(8);    
        tree.fizzBuzz(tree).print();   
* Output :  
1 -> 2 -> Fizz -> 7 -> 8 -> Fizz -> 4 -> Buzz -> 

