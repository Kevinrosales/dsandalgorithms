package Hashtable;

import java.util.ArrayList;
// this Idea comes from (https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/)
public class Hashtable<K, V> {

    public ArrayList<Node<K, V>> bucketArray;
    public int numBuckets;
    public int size;

    public Hashtable() {
        bucketArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;

        for (int i = 0; i < numBuckets; i++)
            bucketArray.add(null);
    }

    public int size() {
        return size;
    }

    public int getBucketIndex(K key)
    {
        int hashCode = key.hashCode();
        int index = hashCode % numBuckets;
        return index;
    }

}