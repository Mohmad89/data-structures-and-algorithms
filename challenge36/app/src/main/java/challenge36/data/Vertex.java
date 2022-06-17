package challenge36.data;

import java.util.HashMap;
import java.util.Objects;

public class Vertex {

    private String data;
    private HashMap<Vertex,Integer> edgesList;

    public Vertex (String data) {
        this.data = data;
        edgesList = new HashMap<Vertex,Integer>();

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setEdges(Vertex node ,int weight){
        edgesList.put(node,weight);

    }

    public  int getEdges(Vertex vertex){
        return   edgesList.get(vertex);

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(data, vertex.data);
    }


    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        return data ;

    }
}
