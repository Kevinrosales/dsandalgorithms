package graph;

public class Edge<K> {
    int weight;
    public Node<K> node;

    public Edge(Node<K> node) {
        this(1, node);
    }

    public Edge(int weight, Node<K> node) {
        this.weight = weight;
        this.node = node;

    }
}
