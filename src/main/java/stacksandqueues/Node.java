package stacksandqueues;

public class Node<T> {
    public T data;
    public Node next;

    public Node(T data, Node nextNode) {
        this.data = data;
        this.next = nextNode;
    }

    public T getData() {
        return data;
    }
}
