package graph;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

    @Test
    public void testGraphCreation() {
        Graph<String> test = new Graph<>();
        assertEquals(0,test.nodes.size(), "should be empty");
    }

    @Test
    public void testAddNode() {
        Graph<String> test = new Graph<>();
        Node<String> node1 = test.addNode("kevin");
        assertEquals("kevin", node1.data, "should be kevin");
    }

    @Test
    public void testAddNode2() {
        Graph<String> test = new Graph<>();
        Node<String> node1 = test.addNode("kevin");
        Node<String> node2 = test.addNode("rosales");
        Node<String> node3 = test.addNode("olvara");
        Node<String> node4 = test.addNode("sanchez");
        assertEquals("olvara", node3.data, "should be olvara");
    }

    @Test
    public void testAddNode3() {
        Graph<String> test = new Graph<>();
        Node<String> node1 = test.addNode("kevin");
        Node<String> node2 = test.addNode("rosales");
        Node<String> node3 = test.addNode("olvara");
        Node<String> node4 = test.addNode("pablo");
        Node<String> node5 = test.addNode("one");
        Node<String> node6 = test.addNode("dad");
        Node<String> node7 = test.addNode("mom");
        assertEquals("mom", node7.data, "should be mom");
    }

    @Test
    public void testAddEdge() {
        Graph<String> test = new Graph<>();
        Node<String> node1 = test.addNode("kevin");
        Node<String> node2 = test.addNode("rosales");
        test.addEdge(1, node1, node2);
        assertEquals(1, node1.neighbors.size(), "should have one neighbor");
    }

    @Test
    public void testAddEdge2() {
        Graph<String> test = new Graph<>();
        Node<String> node1 = test.addNode("kevin");
        Node<String> node2 = test.addNode("rosales");
        Node<String> node3 = test.addNode("olvara");
        Node<String> node4 = test.addNode("pablo");
        Node<String> node5 = test.addNode("dad");
        test.addEdge(1, node1, node5);
        test.addEdge(1, node2, node5);
        test.addEdge(1, node3, node5);
        test.addEdge(1, node4, node5);
        assertEquals(4, node5.neighbors.size(), "should have four neighbors");
    }

    @Test
    public void testAddEdge3() {
        Graph<String> test = new Graph<>();
        Node<String> node1 = test.addNode("kevin");
        Node<String> node2 = test.addNode("rosales");
        Node<String> node3 = test.addNode("olvara");
        test.addEdge(1, node1, node2);
        test.addEdge(1, node2, node3);
        assertEquals(2, node2.neighbors.size(), "should have two neighbors");
    }

    @Test
    public void testGetSize() {
        Graph<String> test = new Graph<>();
        assertEquals(0, test.size(), "should be empty");
    }

    @Test
    public void testGetSize2() {
        Graph<String> test = new Graph<>();
        Node<String> node1 = test.addNode("kevin");
        assertEquals(1, test.size(), "should be one node called kevin");
    }

    @Test
    public void testGetSize3() {
        Graph<String> test = new Graph<>();
        Node<String> node1 = test.addNode("kevin");
        Node<String> node2 = test.addNode("rosales");
        Node<String> node3 = test.addNode("olvara");
        Node<String> node4 = test.addNode("sanchez");
        assertEquals(4, test.size(), "should be four nodes");
    }

}