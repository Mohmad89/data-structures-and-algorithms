# Trees
A tree is non-linear and a hierarchical data structure consisting of a collection of nodes such that each node of the tree stores a value, a list of references to nodes

## Challenge
in this challenge we want to create two class :  
1. BinaryTree Class :  
    in this class we want to create method to add node for this class and we want to create theree method to order tree (preOreder, inOreder, inOrder).
2. BinarySearchTree Class :  
    in this class we want to create two method the first method is add method to add node to our tree and the second method is contain method to chaeck if the value that user pass it is found inside tree or not.

## Approach & Efficiency
1. BinaryTree :  
    space Time : O(n)  
    Complex Time : O (n)   
2. BinarySearchTree :  
    space Time : O(n)   
    Complex Time : O (log n)  
## API
1. BinaryTree :  
    1. preOrder() : to order data as this format (root => left => right)  
    2. inOrder() : to order data as this format (left => root => right)   
    3. postOrder() : to order data as this format (left => right => root)  
2. BinarySearchTree :  
    1. insert : to add data 