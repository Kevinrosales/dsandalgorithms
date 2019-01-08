package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node<K> {
    public K data;
    public Set<Edge<K>> neighbors;

    public Node() {
        this(null);
    }

    public Node (K data) {
        this.data = data;
        this.neighbors = new HashSet<>();
    }

    protected void addEdge(int weight, Node<K> neighbor) {
        Edge<K> newEdge = new Edge(weight, neighbor);
        this.neighbors.add(newEdge);
    }
}
