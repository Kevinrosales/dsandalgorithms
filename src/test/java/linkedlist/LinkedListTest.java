package linkedlist;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testInsert() {
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
    }

}