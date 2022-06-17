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

    public void addEdge (Vertex node1, Vertex node2, int weight) {
        if (node1.equals(node2)) {
            adjVertices.get(node1).add(node2);
            node1.setEdges(node2, weight);
        } else {
            adjVertices.get(node1).add(node2);
            adjVertices.get(node2).add(node1);
            node1.setEdges(node2,weight);
            node2.setEdges(node1,weight);
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
    public static Integer businessTrip(Graph graph, String[] cites) {
        int amount = 0;

        for (int index = 0; index < cites.length; index++) {

            if (graph.getNeighbors(new Vertex(cites[index])).contains(new Vertex(cites[index + 1]))) {

                for (Vertex node : graph.getNeighbors(new Vertex(cites[index]))) {

                    if (node.equals(new Vertex(cites[index + 1]))) {
                        amount += node.getEdges(new Vertex(cites[index]));
                    }
                }
            }
            else {
                return null;
            }

            if (index + 2 == cites.length) {
                break;
            }
        }
        return amount;
    }
//
//    public void adjacencyMatrixRepresentation(int[][] arr, Vertex [] nodes, Graph graph) {
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//
//                if (arr[i][j] == 1) {
//                    if (!graph.getNeighbors(nodes[i]).contains(nodes[j]))
//                        graph.addEdge(nodes[i], nodes[j]);
//                }
//            }
//        }
//        for (Vertex vertex:nodes) {
//            System.out.println(vertex + "|" + graph.getNeighbors(vertex).toString());
//        }
//    }
}
