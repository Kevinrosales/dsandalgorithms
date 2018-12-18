package stacksandqueues;

public class Node<T> {
    protected T data;
    protected Node next;

    public Node(T data, Node nextNode) {
        this.data = data;
        this.next = nextNode;
    }

    public T getData() {
        return data;
    }
}
