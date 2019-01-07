package graph;

public class Edge {
    int weight;
    public Vertex starting;
    public Vertex neighbors;

    public Edge(int weight, Vertex starting, Vertex neighbors){
        this.weight = weight;
        this.starting = starting;
        this.neighbors = neighbors;
    }

}
