package linkedlist;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {

//////////////////////////code challenge 05 test starts////////////////////////////////////////////////////////////
    @Test
    public void testInsert() {
        LinkedList insert = new LinkedList();

        insert.insert(1);
        assertEquals("head node should be 1", 1, insert.head.data);
        assertNull(" next value of  head should be null", insert.head.next);

        insert.insert(2);
        assertEquals("head node should be 2", 2, insert.head.data);
        assertEquals("The next after head should be 1", 1, insert.head.next.data);
        assertNull("value at end should be null", insert.head.next.next);
    }

    @Test
    public void testIncludes() {
        LinkedList incluList = new LinkedList();
        incluList.insert(2);
        incluList.insert(4);

        assertTrue("should be 2", incluList.includes(2));
        assertFalse("false would be 0", incluList.includes(0));

    }

    @Test
    public void testPrint_LastValueCorrect(){
        LinkedList Printing = new LinkedList();

        Printing.insert(1);
        Printing.insert(2);
        Printing.insert(3);

        ArrayList<Integer> printedList = Printing.print();
        int finalNode = printedList.get(printedList.size()-1);

        assertEquals( 1, finalNode);
    }
//////////////////////////code challenge 05 test ends////////////////////////////////////////////////////////////


    @Test
    public void testAppend() {
        LinkedList append = new LinkedList();

        append.insert(1);
        append.append(2);

        assertTrue("Should be a 2 in the list", append.includes(2));
        assertEquals("should be a 2 after the head", 2, append.head.next.data);

    }

    @Test
    public void testInsertBefore() {
        LinkedList before = new LinkedList();

        before.insert(5);
        before.insert(2);
        before.insert(6);

        before.insertBefore(5, 4);
        assertTrue("should be a new node in the list", before.includes(4));

        before.insertBefore(2, 0);
        assertTrue("should be a new node in the list", before.includes(0));

        before.insertBefore(6, 7);
        assertTrue("should be a new node in the list", before.includes(7));

    }

    @Test
    public void testInsertAfter() {
        LinkedList after = new LinkedList();

        after.insert(3);
        after.insert(2);
        after.insert(1);

        after.insertAfter(3, 4);
        assertTrue("should have a Node with the value 4", after.includes(4));

        after.insertAfter(4, 5);
        assertTrue("should add a Node with the value 5", after.includes(5));

        after.insertAfter(1, 2);
        assertTrue("should add a Node with the value 2", after.includes(2));
    }

}