package stacksandqueues;
public class Stack<T> {
    public Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T val) {
        Node<T> newTopNode = new Node(val, this.top);
        this.top = newTopNode;
    }

    public T pop() {
        if(this.top != null){
            Node<T> topNode = this.top;

            this.top = this.top.next;

            topNode.next = null;

            return topNode.getData();

        } else {
            return null;
        }
    }


    public T peek(){
        // if top is not null, return the value contained in the top node
        // else, return null
        return (this.top != null) ? this.top.getData() : null;
    }
}