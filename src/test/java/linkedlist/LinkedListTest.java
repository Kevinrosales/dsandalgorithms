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
    public void testPrint() {
    }

    @Test
    public void testAppend(){

    }

    @Test
    public void testKFromEnd(){

    }
}