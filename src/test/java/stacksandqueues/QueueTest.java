//package stacksandqueues;
//import org.junit.Test;
//import static org.junit.Assert.*;
//public class QueueTest {
//
//    @Test
//    public void testQueue(){
//        Queue<Integer> Queue = new Queue<>();
//        Queue.enqueue(1);
//        Queue.enqueue(2);
//        Queue.enqueue(3);
//        Queue.enqueue(4);
//
//        int numberOne = Queue.peek();
//        assertTrue(numberOne == 1);
//        assertFalse(numberOne == 4);
//        assertTrue(numberOne == Queue.dequeue());
//        assertTrue(2 == Queue.dequeue());
//        assertTrue(3 == Queue.dequeue());
//        assertTrue(4 == Queue.peek());
//
//        Queue.enqueue(19);
//        Queue.dequeue();
//        assertTrue(19 == Queue.peek());
//    }
//}