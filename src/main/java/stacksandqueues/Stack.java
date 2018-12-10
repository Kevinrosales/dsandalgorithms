package stacksandqueues;

public class Stack {

    public Node top = null;

    public Stack(){
        this.top = null;
    }

    public void push(int value){
        Node newNode = new Node(value, this.top);
        top = newNode;
    }

    public int pop(){
        Node temp = this.top;
        top = top.next;

        return temp.data;
    }

    public Node peek(){
        return top;
    }
}
