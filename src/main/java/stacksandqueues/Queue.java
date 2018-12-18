package stacksandqueues;

public class Queue<T> {
    protected Node<T> front;
    protected Node<T> back;

    public Queue() {
        this.front = null;
        this.back = null;
    }

    public void enqueue(T val) {
        Node<T> newBackNode = new Node<>(val, this.back);

        // if back is null, make the back the new node
        if (this.back == null) {
            this.back = newBackNode;

        } else {
            this.back.next = newBackNode;
            this.back = newBackNode;

        }

        // set the front when adding the first node
        if (this.front == null) {
            this.front = newBackNode;
        }
    }

    public T dequeue() {

        if (this.front != null) {

            Node<T> frontNode = this.front;
            this.front = this.front.next;
            frontNode.next = null;

            if (this.front == null) {
                this.back = null;
            }

            return frontNode.getData();

        } else {
            return null;

        }

    }

    public T peek() {
        return (this.front != null) ? this.front.getData() : null;
    }
}