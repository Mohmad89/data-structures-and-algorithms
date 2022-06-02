# Challenge Summary

in this challenge i will to create function that pass a Vertex node as  a variable then return the list for all the node inside this graph according the breadth first way.

## Whiteboard Process

![WhiteBoard](image/bridthFirst%20Graph.png)

## Approach & Efficiency

* Approach :  
    - create Vertex Class to assign node for graph.
    - create Graph Class .
    - create breadthFirst function inside Graph class.
    - enter some vertex and edges to the graph.
    - call the breadthFirst function.

* Efficiency :
    - Big O notation :
        1. Time : O(n).
        2. Space: O(n).

___

## Solution

* Example :  
    Graph graph = new Graph();  
        System.out.println(graph.addNode("A"));  
        System.out.println(graph.addNode("B"));  
        System.out.println(graph.addNode("C"));  
        System.out.println(graph.addNode("D"));  
        System.out.println(graph.getNode());  
        graph.addEdge(new Vertex("A"), new Vertex("B"));  
        graph.addEdge(new Vertex("A"), new Vertex("C"));  
        graph.addEdge(new Vertex("B"), new Vertex("D"));  
        graph.addEdge(new Vertex("D"), new Vertex("C"));  
        System.out.println(graph.breadthFirst(new Vertex("A")));
* Output :  
    [A   B  C  D]

___
