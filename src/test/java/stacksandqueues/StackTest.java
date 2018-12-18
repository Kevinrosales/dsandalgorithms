package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

//    test too see if nodes are being made correctly
    @Test
    public void testNode() {
        Node<Integer> newNode = new Node(19, null);
        Integer nodeVal = newNode.getData();
        assertTrue(nodeVal.equals(19));
    }

    @Test
    public void testNode2() {
        Node<Integer> newNode = new Node(81, null);
        Integer nodeVal = newNode.getData();
        assertTrue(nodeVal.equals(81));
    }

    @Test
    public void testNode3() {
        Node<Integer> newNode = new Node(11111, null);
        Integer nodeVal = newNode.getData();
        assertTrue(nodeVal.equals(11111));
    }

//    test too see if push and peek work #2birds1Stone
    @Test
    public void testPushAndPeek() {
        Stack<Integer> testPush = new Stack<>();

        testPush.push(1);

        int peekVal = testPush.peek();

        assertTrue(peekVal == 1);
    }

    @Test
    public void testPushAndPeek2() {
        Stack<Integer> testPush = new Stack<>();

        testPush.push(1);
        testPush.push(2);
        testPush.push(3);

        int peekVal = testPush.peek();

        assertTrue(peekVal == 3);
    }

    @Test
    public void testPushAndPeek3() {
        Stack<Integer> testPush = new Stack<>();

        testPush.push(3);
        testPush.push(3);
        testPush.push(3);
        testPush.push(3);
        testPush.push(3);
        testPush.push(3);
        testPush.push(3);
        testPush.push(3);

        int peekVal = testPush.peek();

        assertTrue(peekVal == 3);
    }
    @Test
    public void testPop(){
        Stack<Integer> testPop = new Stack<>();

        testPop.push(1);
        testPop.push(2);
        testPop.push(3);
        int poppedVal = testPop.pop();
        int peekVal2 = testPop.peek();

        assertTrue(poppedVal == 3);
        assertTrue(peekVal2 == 2);

        int poppedVal2 = testPop.pop();
        int poppedVal3 = testPop.pop();

        assertTrue(poppedVal2 == 2);
        assertTrue(poppedVal3 == 1);
        assertTrue(testPop.peek() == null);
    }
    @Test
    public void testPop2(){
        Stack<Integer> testPop = new Stack<>();

        testPop.push(1);
        testPop.push(2);
        testPop.push(3);
        testPop.push(4);
        testPop.push(5);

        int poppedVal = testPop.pop();
        int peekVal2 = testPop.peek();

        assertTrue(poppedVal == 5);
        assertTrue(peekVal2 == 4);

        int poppedVal2 = testPop.pop();
        int poppedVal3 = testPop.pop();

        assertTrue(poppedVal2 == 4);
        assertTrue(poppedVal3 == 3);
        assertTrue(testPop.peek() == 2);
    }
    @Test
    public void testPop3(){
        Stack<Integer> testPop = new Stack<>();

        testPop.push(1);
        testPop.push(2);
        testPop.push(3);
        testPop.push(4);
        testPop.push(5);
        testPop.push(6);
        testPop.push(7);
        testPop.push(8);
        testPop.push(9);

        int poppedVal = testPop.pop();
        int peekVal2 = testPop.peek();

        assertTrue(poppedVal == 9);
        assertTrue(peekVal2 == 8);

        int poppedVal2 = testPop.pop();
        int poppedVal3 = testPop.pop();

        assertTrue(poppedVal2 == 8);
        assertTrue(poppedVal3 == 7);
        assertTrue(testPop.peek() == 6);
    }
}