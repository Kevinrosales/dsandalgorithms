package graph;

import java.util.HashSet;
import java.util.Set;

public class Graph<K> {
    public Set<Node<K>> nodes;

    public Graph() {
        this.nodes = new HashSet<>();
    }

    public Node<K> addNode(K data) {
        Node<K> newNode = new Node<>(data);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(int weight, Node<K> node1, Node<K> node2) {
        if (!this.nodes.contains(node1) || !this.nodes.contains(node2)){
            throw new IllegalArgumentException("Nodes must be contained in the graph");
        }
        node1.addEdge(weight, node2);
        node2.addEdge(weight, node1);
    }

    public Set<Node<K>> getNodes() {
        return this.nodes;
    }

    public int size() {
        return this.nodes.size();
    }

    public Set<Edge<K>> getNeighbor(Node<K> node) {
        return node.neighbors;
    }

}
