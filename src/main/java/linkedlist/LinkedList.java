package linkedlist;
import java.util.ArrayList;

public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value, this.head);
        this.head = newNode;
    }

    public boolean includes(int value) {
        Node current = this.head;
        while (current != null) {
            if (value == current.data) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public ArrayList<Integer> print() {
        Node current = this.head;
        ArrayList<Integer> printArr = new ArrayList<>();
        while (current != null) {
            printArr.add(current.data);
            current = current.next;
        }
    System.out.println(printArr.toString());
    return printArr;
    }
//this is the ll_insertions code challenge starting point
// this method is the .append(value) which adds a new node with the given value to the end of the list

    public void append(int value) {
        Node current = this.head;
        while (current != null) {
            if (current.next == null) {
                current.next = new Node(value, null);
                break;
            }
            current = current.next;
        }
    }

    //this method will add a new node with the given newValue immediately before the first value node
    public void insertBefore(int value, int newVal) {
        if (!includes(value)) {
            return;
        }

        Node current = this.head;

        if(value == current.data) {
            insert(newVal);
            return;
        }
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = new Node(newVal, current.next);
                break;
            }
            current = current.next;
        }
    }

    //this method will add a new node with the given newValue immediately after the first value node
    public void insertAfter(int value, int newVal) {
        if (!includes(value)) {
            return;
        }

        Node current = this.head;

        while (current != null) {
            if (current.data == value) {
                current.next = new Node(newVal, current.next);
                break;
            }
            current = current.next;
        }
    }

//this is the ll_kth_from_end code challenge starting point
//this method is the which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list
    public int kFromEnd(int k) {
        Node curr = this.head;
        int count = 1;

        while (curr != null) {
            count++;
            curr = curr.next;
        }
        int[] arr = new int[count];
        curr = this.head;

        while (curr != null) {
            count--;
            arr[count] = curr.data;
            curr = curr.next;
        }
        return arr[k];
    }

}