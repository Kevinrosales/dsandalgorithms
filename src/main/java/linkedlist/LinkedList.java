package linkedlist;
import java.util.ArrayList;

public class LinkedList {
    private Node head;

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
    //this method is the .append(value) which adds a new node with the given value to the end of the list
    public void append(int value) {
       Node current = this.head;
       Node newNode = new Node(value, null);
        while(current != null){
            if (current.next == null){
                current = newNode;
            }
            else{current = current.next;}
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
//    this is the ll_merge method from the code challenge 08!!
//    public static ll_merge(){
//
//    }
}