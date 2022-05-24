package challenge35.structure;

import challenge35.data.Vertex;

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
}
