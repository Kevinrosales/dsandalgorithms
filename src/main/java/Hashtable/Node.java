package Hashtable;

// this Idea comes from (https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/)
public class Node<K, V> {
    K key;
    V value;

    Node<K, V> next;

    public Node(K key, V value){
        this.key = key;
        this.value = value;
    }
}
