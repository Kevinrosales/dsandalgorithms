//package QueueWithStacks;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class QueueWithStacksTest {
//
//    @Test
//    public void testEnqueue() {
//        QueueWithStacks<Integer> testEnqueue = new QueueWithStacks<Integer>();
//
//        testEnqueue.enqueue(19);
//
//        assertEquals("should have 19 at the front", (Integer) 19, testEnqueue.front.data);
//    }
//
//    @Test
//    public void testEnqueue2() {
//        QueueWithStacks<Integer> testEnqueue = new QueueWithStacks<Integer>();
//
//        testEnqueue.enqueue(4);
//        testEnqueue.enqueue(3);
//        testEnqueue.enqueue(2);
//        testEnqueue.enqueue(1);
//
//        assertEquals("should have 4 at the front", (Integer) 4, testEnqueue.front.data);
//    }
//
//    @Test
//    public void testEnqueue3() {
//        QueueWithStacks<Integer> testEnqueue = new QueueWithStacks<Integer>();
//
//        testEnqueue.enqueue(1);
//        testEnqueue.enqueue(2);
//        testEnqueue.enqueue(3);
//
//        assertEquals("should have one at the front", (Integer) 1, testEnqueue.front.data);
//    }
//
//    @Test
//    public void testDequeue() {
//        QueueWithStacks<Integer> testDequeue = new QueueWithStacks<Integer>();
//
//        testDequeue.enqueue(1);
//        testDequeue.enqueue(2);
//        testDequeue.dequeue();
//        testDequeue.dequeue();
//
//        assertNull("should be null stack", testDequeue.dequeue());
//    }
//
//    @Test
//    public void testDequeue2() {
//        QueueWithStacks<Integer> testDequeue = new QueueWithStacks<Integer>();
//
//        testDequeue.enqueue(1);
//        testDequeue.enqueue(2);
//        testDequeue.enqueue(3);
//
//        testDequeue.dequeue();
//        testDequeue.dequeue();
//        testDequeue.dequeue();
//
//        assertNull("should be null stack", testDequeue.dequeue());
//    }
//
//    @Test
//    public void testDequeue3() {
//        QueueWithStacks<Integer> testDequeue = new QueueWithStacks<Integer>();
//
//        testDequeue.enqueue(1);
//        testDequeue.dequeue();
//
//        assertNull("should be null stack", testDequeue.dequeue());
//    }
//
//    @Test
//    public void testPeek() {
//        QueueWithStacks<Integer> testPeek = new QueueWithStacks<Integer>();
//        assertNull("should be null", testPeek.peek());
//        testPeek.enqueue(1);
//        assertEquals("should be 1", (Integer) 1, testPeek.peek().data);
//        testPeek.enqueue(2);
//        assertEquals("should be 1", (Integer) 1, testPeek.peek().data);
//    }
//}