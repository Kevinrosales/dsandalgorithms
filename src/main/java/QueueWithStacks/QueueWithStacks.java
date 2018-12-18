package QueueWithStacks;
import stacksandqueues.Node;
import stacksandqueues.Stack;

public class QueueWithStacks<T> {
    public Stack<T> fakeQueue = new Stack<>();
    public Stack<T> bucket = new Stack<>();
    public Node<T> front;
    public Node<T> rear;

    public QueueWithStacks() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T data) {
        T current = this.fakeQueue.pop();

        while (current != null) {
            this.bucket.push(current);
            current = this.fakeQueue.pop();
        }

        if (this.front == null) {
            this.fakeQueue.push(data);
            this.rear = this.fakeQueue.top;
        } else {
            this.fakeQueue.push(data);
            this.rear = this.fakeQueue.top;
            current = this.bucket.pop();
        }

        while (current != null) {
            this.fakeQueue.push(current);
            current = this.bucket.pop();
        }
        this.front = this.fakeQueue.top;
    }

    public T dequeue() {
        if (fakeQueue.top != null) {
            this.front = fakeQueue.top.next;
        }
        return this.fakeQueue.pop();
    }

    public Node<T> peek() {
        return this.front;
    }
}
