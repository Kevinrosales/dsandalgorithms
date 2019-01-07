package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    int data;
    public List<Vertex> neighbors;

    Vertex(int data){
        this.data = data;
        this.neighbors = new ArrayList<>();
    }
}
