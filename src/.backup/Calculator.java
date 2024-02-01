import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testEvaluateExpression() {
        Calculator calculator = new Calculator();

        // Test cases
        assertEquals(10, calculator.evaluateExpression("2 3 * 4 +")); // 2 * 3 + 4 = 10
        assertEquals(15, calculator.evaluateExpression("5 1 2 + 4 * +")); // 5 + (1 + 2) * 4 = 15
        assertEquals(5, calculator.evaluateExpression("9 3 / 2 +")); // 9 / 3 + 2 = 5
        assertEquals(15, calculator.evaluateExpression("7 2 - 3 *")); // (7 - 2) * 3 = 15
        assertEquals(8, calculator.evaluateExpression("8 2 / 2 *")); // (8 / 2) * 2 = 8
    }
}

