package graph;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    public void testGraph() {
        Graph<String> graph = new Graph<>();
        assertEquals(0, graph.Node.size(), "new graph should have no nodes");
    }

}