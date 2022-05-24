# Graphs
* a graph is non-Linear data structure consist of nods and edge.
* Can we Represent Graph with two ways : 
    1. Adjacency List : with use List to store it
    2. Adjacency Matrix : with use 2D array to store it .
___

## Challenge

* In this challenge i will to create more than one function such as : 
    1. addNode : to add node for graph.
    2. addEdge : to add edge between two nodes;
    3. getNode : return all nodes inside graph.
    4. getNeighbors : return list of edge between one node .
    5. size : return number of node inside graph.
___

## Approach & Efficiency

### * Approach 

  * in this challenge i create Vertex nad Graph Class 
      1. Vertex Class : it's a Node that have a data inside it .
      2. Graph Class : i write a function inside it but first of all i  
         create Map to store node inside it then every Node has ArrayList to store edge inside it.
      3. write a require function in this Graph Class.
___  
    
### * Efficiency 

* Big O Notation :  
  1. Time : O(n).
  2. Space: O(n + 2e) -> e : edge.
  
___

## API

1. addNode : to add node for graph that accept value for Node as parameter then return a node itself.
2. addEdge : to add edge between two nodes that accept two node to do edge between it. 
3. getNode : return List of all nodes inside graph.
4. getNeighbors : accept Node as a parameter then return list of edge for this Node .
5. size : return number of node inside graph.

___