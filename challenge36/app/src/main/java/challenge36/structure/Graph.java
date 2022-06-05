package challenge36.structure;

import challenge36.data.Vertex;

import java.util.*;

public class Graph {

    private Map<Vertex, List<Vertex>> adjVertices;

    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    public Vertex addNode (String data){
        Vertex vertex = new Vertex (data);
        adjVertices.putIfAbsent (vertex, new ArrayList<>());
        return vertex;
    }

    public void addEdge (Vertex node1, Vertex node2) {
        if (node1.equals(node2))
            adjVertices.get(node1).add(node2);
        else {
            adjVertices.get(node1).add(node2);
            adjVertices.get(node2).add(node1);
        }
    }

    public List<Vertex> getNode () {

        List<Vertex> allVertex = new ArrayList<>();

        for (Vertex vertex : adjVertices.keySet()) {
            allVertex.add(vertex);
        }
        if (allVertex.size() > 0)
            return allVertex;
        else
            return null;
    }

    public List<Vertex> getNeighbors (Vertex node) {
        List <String> edgeRoad = new ArrayList<>();
        List <Vertex> edgeList = adjVertices.get(node);
        return edgeList;

    }

    public int size() {
        return adjVertices.size();
    }

    public List<Vertex> breadthFirst (Vertex node) {

        List<Vertex> visitedNodes = new ArrayList<>();
        Queue<Vertex> queue = new LinkedList<>();

        queue.add(node);
        visitedNodes.add(node);

        while (!queue.isEmpty()) {
            Vertex currentNode = queue.poll();

            for (Vertex vertex : getNeighbors(currentNode)) {
                if (!visitedNodes.contains((vertex))) {
                    queue.add(vertex);
                    visitedNodes.add(vertex);

                }
            }
        }
        return visitedNodes;
    }

    public List<Vertex> depthFirst(Vertex root){
        List<Vertex> visited=new ArrayList<>();
        if (root == null){
            return null;
        }
        if (root!=null)
        {
            depthFirstVertex(root,visited);
        }
        return visited;
    }

    private void depthFirstVertex(Vertex root, List<Vertex> list) {
        list.add(root);
        if (this.getNeighbors(root)==null)
        {
            return;
        }
        for (Vertex vertex: this.getNeighbors(root))
        {
            if (!list.contains(vertex))
            {
                depthFirstVertex(vertex,list);
            }
        }
    }
}
