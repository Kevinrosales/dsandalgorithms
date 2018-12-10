package stacksandqueues;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testPush(){
        Stack test = new Stack();
        test.push(3);
        assertEquals("checking to see empty", test.peek().data, 3);

    }

    @Test
    public void testPop() {
        Stack test = new Stack();
        test.push(3);
        test.push(2);
        test.push(3);
        assertEquals(3, test.pop());

    }

    @Test
    public void testPeek() {
        Stack test = new Stack();
        test.push(3);
        test.push(2);
        test.push(5);
        assertEquals("checking to see empty", test.peek().data, 5);

    }
}