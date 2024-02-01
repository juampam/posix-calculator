import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OperandStackTest {
    private OperandStack stack;

    @Before
    public void setUp() {
        stack = new OperandStack();
    }

    @Test
    public void testPushAndPop() {
        stack.push(5);
        assertFalse(stack.isEmpty());
        assertEquals(5, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(10);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

}

